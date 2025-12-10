package th.p047co.dtac.android.dtacone.model.prepaid;

import androidx.autofill.HintConstants;
import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.bouncycastle.i18n.MessageBundle;
import th.p047co.dtac.android.dtacone.model.face_recognition.FaceRecognitionRequest;
import th.p047co.dtac.android.dtacone.util.constant.customerenquiry.ConstsKt;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

/* renamed from: th.co.dtac.android.dtacone.model.prepaid.RegisterPrepaidCollection */
/* loaded from: classes8.dex */
public class RegisterPrepaidCollection {
    @SerializedName("documentNames")
    private List<String> documentName;
    @SerializedName("faceRecognition")
    private FaceRecognitionRequest faceRecognitionRequest;
    @SerializedName("isSmartCardData")
    private String isSmartCardData;
    @SerializedName(Scopes.PROFILE)
    private ProfileCollection profile;
    @SerializedName("subscriber")
    private SubscriberCollection subscriber;
    @SerializedName("userCode")
    private String userCode = "";
    @SerializedName("channel")
    private String channel = "";

    /* renamed from: th.co.dtac.android.dtacone.model.prepaid.RegisterPrepaidCollection$SubscriberCollection */
    /* loaded from: classes8.dex */
    public static class SubscriberCollection {
        @SerializedName("simcardNumber")
        private String simCardNumber;
        @SerializedName("simType")
        private String simType;
        @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
        private String subscriberNumber;
        @SerializedName("retailerNumber")
        private String retailerNumber = "";
        @SerializedName(ConstsKt.TELEPHONE_TYPE)
        private String telephoneType = "";

        public SubscriberCollection(String str, String str2, String str3) {
            this.simCardNumber = str;
            this.subscriberNumber = str2;
            this.simType = str3;
        }
    }

    public RegisterPrepaidCollection(CardCollection cardCollection, CardInformationCollection cardInformationCollection, NationWideCollection nationWideCollection, List<String> list, FaceRecognitionRequest faceRecognitionRequest) {
        this.isSmartCardData = cardCollection.getIsSmartCardData();
        this.documentName = list;
        this.subscriber = new SubscriberCollection(nationWideCollection.getSimCardNumber(), nationWideCollection.getSubscriberNumber(), nationWideCollection.getSimType());
        this.profile = new ProfileCollection(nationWideCollection.getCompanyCode(), cardCollection, cardInformationCollection);
        this.faceRecognitionRequest = faceRecognitionRequest;
    }

    /* renamed from: th.co.dtac.android.dtacone.model.prepaid.RegisterPrepaidCollection$ProfileCollection */
    /* loaded from: classes8.dex */
    public static class ProfileCollection {
        @SerializedName("birthDate")
        private String birthDate;
        @SerializedName("companyCode")
        private String companyCode;
        @SerializedName("firstName")
        private String firstName;
        @SerializedName(HintConstants.AUTOFILL_HINT_GENDER)
        private String gender;
        @SerializedName("identityNumber")
        private String identityNumber;
        @SerializedName("identityType")
        private String identityType;
        @SerializedName("lastName")
        private String lastName;
        @SerializedName("legalAddress")
        private CardInformationCollection legalAddress;
        @SerializedName(MessageBundle.TITLE_ENTRY)
        private String title;
        @SerializedName("billingProductCode")
        private String billingProductCode = "";
        @SerializedName("issueDate")
        private String issueDate = "";
        @SerializedName("expiryDate")
        private String expiryDate = "";
        @SerializedName("filename")
        private String filename = "";

        public ProfileCollection(String str, CardCollection cardCollection, CardInformationCollection cardInformationCollection) {
            this.companyCode = str;
            this.title = cardCollection.getTitle();
            this.firstName = cardCollection.getFirstName();
            this.lastName = cardCollection.getLastName();
            this.identityType = cardCollection.getCardType();
            this.identityNumber = cardCollection.getIdentityNumber();
            this.birthDate = cardCollection.getBirthDate();
            this.legalAddress = cardInformationCollection;
            this.gender = cardCollection.getGender();
        }

        public ProfileCollection(String str, String str2, String str3, String str4, String str5, String str6, String str7, CardInformationCollection cardInformationCollection) {
            this.companyCode = str;
            this.title = str4;
            this.firstName = str5;
            this.lastName = str6;
            this.identityType = str2;
            this.identityNumber = str3;
            this.birthDate = str7;
            this.legalAddress = cardInformationCollection;
        }
    }
}