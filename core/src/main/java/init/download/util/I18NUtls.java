package init.download.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

@Component
public class I18NUtls {
	private static MessageSource messageSource;
	@Autowired
	public void setMessageSource(MessageSource messageSource) {
		I18NUtls.messageSource = messageSource;
	}
	
	public static String getMessage(String name) {
		return messageSource.getMessage(name, null, LocaleContextHolder.getLocale());
	}
}