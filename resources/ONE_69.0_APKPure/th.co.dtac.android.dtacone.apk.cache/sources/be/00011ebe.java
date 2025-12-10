package th.p047co.dtac.android.dtacone.model.mnp;

/* renamed from: th.co.dtac.android.dtacone.model.mnp.SimCardInformationCollection */
/* loaded from: classes8.dex */
public class SimCardInformationCollection {
    private String imsiNumber;
    private String simcardNumber;

    public SimCardInformationCollection(String str, String str2) {
        this.simcardNumber = str;
        this.imsiNumber = str2;
    }

    public String getImsiNumber() {
        return this.imsiNumber;
    }

    public String getSimcardNumber() {
        return this.simcardNumber;
    }
}