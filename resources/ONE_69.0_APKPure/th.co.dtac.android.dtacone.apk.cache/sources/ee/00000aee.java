package p000;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* renamed from: LX1 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class LX1 {
    /* renamed from: a */
    public static /* synthetic */ int m67548a(int i, int i2) {
        return (int) ((i & BodyPartID.bodyIdMax) % (i2 & BodyPartID.bodyIdMax));
    }
}