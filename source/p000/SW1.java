package p000;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* renamed from: SW1 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class SW1 {
    /* renamed from: a */
    public static /* synthetic */ int m66320a(int i, int i2) {
        return (int) ((i & BodyPartID.bodyIdMax) / (i2 & BodyPartID.bodyIdMax));
    }
}
