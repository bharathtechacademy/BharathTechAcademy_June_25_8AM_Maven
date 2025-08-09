package transientExamples;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    String username;
    transient String password;  // won't be serialized

     User(String name, String key) {
        username = name;
        password = key;
    }
}