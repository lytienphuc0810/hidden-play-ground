import java.util.List;

import play.Application;
import play.GlobalSettings;
import play.libs.Yaml;

import com.avaje.ebean.Ebean;

public class Global extends GlobalSettings {

    public void onStart(Application app) {
        Ebean.save((List<?>) Yaml.load("initial-data.yml"));
    }
}
