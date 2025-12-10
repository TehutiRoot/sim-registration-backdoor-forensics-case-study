package p000;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.math.Primes;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.CustomerEnquiry700MhzFragment;

/* renamed from: Lb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17970Lb2 implements zzeh {

    /* renamed from: a */
    public static final zzeh f3501a = new C17970Lb2();

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final boolean zza(int i) {
        if (i == 129 || i == 161 || i == 209 || i == 2705 || i == 20753 || i == 20769 || i == 215 || i == 216 || i == 1297 || i == 1298) {
            return true;
        }
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                switch (i) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        return true;
                    default:
                        switch (i) {
                            case EACTags.ANSWER_TO_RESET /* 81 */:
                            case EACTags.HISTORICAL_BYTES /* 82 */:
                            case ModuleDescriptor.MODULE_VERSION /* 83 */:
                            case 84:
                            case CustomerEnquiry700MhzFragment.hiddenSubProdHeight /* 85 */:
                                return true;
                            default:
                                switch (i) {
                                    case 163:
                                    case 164:
                                    case 165:
                                    case 166:
                                    case 167:
                                    case 168:
                                    case 169:
                                        return true;
                                    default:
                                        switch (i) {
                                            case Primes.SMALL_FACTOR_LIMIT /* 211 */:
                                            case 212:
                                            case 213:
                                                return true;
                                            default:
                                                return false;
                                        }
                                }
                        }
                }
        }
    }
}
