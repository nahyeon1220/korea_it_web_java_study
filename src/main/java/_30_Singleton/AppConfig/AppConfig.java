package _30_Singleton.AppConfig;

import lombok.Data;

@Data
//자주 쓰는 시그니처 패키지
//Getter, Setter, toString, EqualsAndHashCode, RequiredArgsConstructor가 다 포함되어 있음
public class AppConfig { //설정파일이라고 생각하면 됨
    private static AppConfig instance;

    private String apikey;
    private String appMode;

    private AppConfig(){
        this.apikey = "DEFAULT-KEY";
        this.appMode = "PRODUCTION";
    }

    public static AppConfig getInstance(){
        if(instance == null){
            instance = new AppConfig();
        }
        return instance;
    }

}
