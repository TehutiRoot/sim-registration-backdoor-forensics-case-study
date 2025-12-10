package th.p047co.dtac.android.dtacone.model.login;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;

/* renamed from: th.co.dtac.android.dtacone.model.login.LoginCollection */
/* loaded from: classes8.dex */
public class LoginCollection {
    @SerializedName(HintConstants.AUTOFILL_HINT_PASSWORD)
    private String password;
    @SerializedName(HintConstants.AUTOFILL_HINT_USERNAME)
    private String username;

    public LoginCollection(String str, String str2) {
        this.username = str;
        this.password = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginCollection)) {
            return false;
        }
        LoginCollection loginCollection = (LoginCollection) obj;
        String str = this.username;
        if (str == null ? loginCollection.username != null : !str.equals(loginCollection.username)) {
            return false;
        }
        String str2 = this.password;
        String str3 = loginCollection.password;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int i;
        String str = this.username;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.password;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setUsername(String str) {
        this.username = str;
    }
}