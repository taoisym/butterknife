package butterknife;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Bind a field to the specified string resource ID.
 * <pre><code>
 * {@literal @}BindString(R.string.username_error) String usernameErrorText;
 * </code></pre>
 */
@Retention(CLASS) @Target({FIELD})
public @interface BindBeanFunc {
    int id();
    String value();
    BindFunc func();
}
