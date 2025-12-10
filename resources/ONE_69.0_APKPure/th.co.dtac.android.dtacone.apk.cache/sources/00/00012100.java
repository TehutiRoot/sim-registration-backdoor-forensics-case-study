package th.p047co.dtac.android.dtacone.model.updateprepaid;

import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import th.p047co.dtac.android.dtacone.model.prepaid.RegisterPrepaidCollection;

/* renamed from: th.co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidUpdateProfile */
/* loaded from: classes8.dex */
public class UpdatePrepaidUpdateProfile {
    @SerializedName("channel")
    private String channel;
    @SerializedName("documentNames")
    private List<String> documentNames;
    @SerializedName("faceRecognition")
    private UpdatePrepaidFaceRecognition faceRecognition;
    @SerializedName("isSmartCardData")
    private String isSmartCardData;
    @SerializedName("otp")
    private String otp;
    @SerializedName(Scopes.PROFILE)
    private RegisterPrepaidCollection.ProfileCollection profile;
    @SerializedName("subscriber")
    private RegisterPrepaidCollection.SubscriberCollection subscriber;
    @SerializedName("transactionId")
    private String transactionId;
    @SerializedName("userCode")
    private String userCode;

    public UpdatePrepaidUpdateProfile(String str, String str2, RegisterPrepaidCollection.SubscriberCollection subscriberCollection, String str3, RegisterPrepaidCollection.ProfileCollection profileCollection, List<String> list, String str4, String str5, UpdatePrepaidFaceRecognition updatePrepaidFaceRecognition) {
        this.userCode = str;
        this.isSmartCardData = str2;
        this.subscriber = subscriberCollection;
        this.channel = str3;
        this.profile = profileCollection;
        this.documentNames = list;
        this.transactionId = str4;
        this.otp = str5;
        this.faceRecognition = updatePrepaidFaceRecognition;
    }
}