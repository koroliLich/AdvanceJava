import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The XmlRoot annotation is used to specify the root element in the serialized XML/JSON format.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface XmlRoot {
  /**
   * The name of the root element.
   *
   * @return the name of the root element
   */
  String value();
}
