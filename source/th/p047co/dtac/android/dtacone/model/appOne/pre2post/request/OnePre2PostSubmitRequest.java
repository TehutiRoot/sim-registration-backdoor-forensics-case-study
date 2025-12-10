package th.p047co.dtac.android.dtacone.model.appOne.pre2post.request;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.customerenquiry.OffersPackage;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.Address;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0003\bî\u0001\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0005\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\r\u0012\u0006\u0010 \u001a\u00020\r\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\r\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020'\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\u0003\u0012\u0006\u0010,\u001a\u00020\u0003\u0012\u0006\u0010-\u001a\u00020\u0003\u0012\u0006\u0010.\u001a\u00020\u0003\u0012\u0006\u0010/\u001a\u00020\u0003\u0012\u0006\u00100\u001a\u00020\u0003\u0012\u0006\u00101\u001a\u00020\u0003\u0012\u0006\u00102\u001a\u00020\u0003\u0012\u0006\u00103\u001a\u00020\u0003\u0012\u0006\u00104\u001a\u00020\u0003\u0012\u0006\u00105\u001a\u00020\u0003\u0012\u0006\u00106\u001a\u00020\u0003\u0012\u0006\u00107\u001a\u00020\u0003\u0012\u0006\u00108\u001a\u00020\u0003\u0012\u0006\u00109\u001a\u00020:\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010<\u001a\u00020\u0003\u0012\u0006\u0010=\u001a\u00020\u0003\u0012\u0006\u0010>\u001a\u00020\u0003\u0012\u0006\u0010?\u001a\u00020\u0003\u0012\u0006\u0010@\u001a\u00020\u0003\u0012\u0006\u0010A\u001a\u00020\u0003\u0012\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00030C\u0012\u0006\u0010D\u001a\u00020\u0003\u0012\u0006\u0010E\u001a\u00020\u0003\u0012\u0006\u0010F\u001a\u00020\u0003\u0012\u0006\u0010G\u001a\u00020\u0003\u0012\u0006\u0010H\u001a\u00020\u0003\u0012\f\u0010I\u001a\b\u0012\u0004\u0012\u00020K0J\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010M\u001a\u00020\u0003\u0012\b\b\u0002\u0010N\u001a\u00020\u0003\u0012\b\b\u0002\u0010O\u001a\u00020\u0003\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010S\u001a\u00020\r¢\u0006\u0002\u0010TJ\n\u0010é\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ê\u0001\u001a\u00020\rHÆ\u0003J\n\u0010ë\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ì\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010í\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010î\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ï\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ð\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ñ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ò\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ó\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ô\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010õ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ö\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010÷\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ø\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ù\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ú\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010û\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ü\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ý\u0001\u001a\u00020\rHÆ\u0003J\n\u0010þ\u0001\u001a\u00020\rHÆ\u0003J\n\u0010ÿ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0080\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0081\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0082\u0002\u001a\u00020\rHÆ\u0003J\n\u0010\u0083\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0084\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0085\u0002\u001a\u00020'HÆ\u0003J\n\u0010\u0086\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0087\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0088\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0089\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008a\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008b\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008c\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008d\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008e\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008f\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0090\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0091\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0092\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0093\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0094\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0095\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0096\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0097\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0098\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0099\u0002\u001a\u00020:HÆ\u0003J\n\u0010\u009a\u0002\u001a\u00020:HÆ\u0003J\n\u0010\u009b\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009c\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009d\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009e\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009f\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010 \u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010¡\u0002\u001a\u00020\u0003HÆ\u0003J\u0010\u0010¢\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030CHÆ\u0003J\n\u0010£\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010¤\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010¥\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010¦\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010§\u0002\u001a\u00020\u0003HÆ\u0003J\u0010\u0010¨\u0002\u001a\b\u0012\u0004\u0012\u00020K0JHÆ\u0003J\f\u0010©\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010ª\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010«\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010¬\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u00ad\u0002\u001a\u00020\u0003HÆ\u0003J\f\u0010®\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¯\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010°\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010±\u0002\u001a\u00020\rHÆ\u0003J\n\u0010²\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010³\u0002\u001a\u00020\u0003HÆ\u0003J\u008c\u0006\u0010´\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\r2\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\u00032\b\b\u0002\u00100\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\u00032\b\b\u0002\u00102\u001a\u00020\u00032\b\b\u0002\u00103\u001a\u00020\u00032\b\b\u0002\u00104\u001a\u00020\u00032\b\b\u0002\u00105\u001a\u00020\u00032\b\b\u0002\u00106\u001a\u00020\u00032\b\b\u0002\u00107\u001a\u00020\u00032\b\b\u0002\u00108\u001a\u00020\u00032\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020:2\b\b\u0002\u0010<\u001a\u00020\u00032\b\b\u0002\u0010=\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\u00032\b\b\u0002\u0010?\u001a\u00020\u00032\b\b\u0002\u0010@\u001a\u00020\u00032\b\b\u0002\u0010A\u001a\u00020\u00032\u000e\b\u0002\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00030C2\b\b\u0002\u0010D\u001a\u00020\u00032\b\b\u0002\u0010E\u001a\u00020\u00032\b\b\u0002\u0010F\u001a\u00020\u00032\b\b\u0002\u0010G\u001a\u00020\u00032\b\b\u0002\u0010H\u001a\u00020\u00032\u000e\b\u0002\u0010I\u001a\b\u0012\u0004\u0012\u00020K0J2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010M\u001a\u00020\u00032\b\b\u0002\u0010N\u001a\u00020\u00032\b\b\u0002\u0010O\u001a\u00020\u00032\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010S\u001a\u00020\rHÆ\u0001J\u0015\u0010µ\u0002\u001a\u00020\r2\t\u0010¶\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010·\u0002\u001a\u00020'HÖ\u0001J\n\u0010¸\u0002\u001a\u00020\u0003HÖ\u0001R$\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00030C8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001e\u00105\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001e\u0010\u001c\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010Z\"\u0004\b^\u0010\\R\u001e\u0010\u001b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010Z\"\u0004\b`\u0010\\R\u0018\u0010P\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010ZR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010Z\"\u0004\bc\u0010\\R\u001e\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010Z\"\u0004\be\u0010\\R\u001e\u0010@\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010Z\"\u0004\bg\u0010\\R\u001e\u0010A\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010Z\"\u0004\bi\u0010\\R\u001e\u0010=\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010Z\"\u0004\bk\u0010\\R\u001e\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010Z\"\u0004\bm\u0010\\R\u001e\u0010\u0016\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010Z\"\u0004\bo\u0010\\R\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010Z\"\u0004\bq\u0010\\R\u001e\u0010<\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010Z\"\u0004\bs\u0010\\R\u001e\u0010G\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010Z\"\u0004\bu\u0010\\R\u001e\u0010F\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010Z\"\u0004\bw\u0010\\R\u001e\u0010H\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010Z\"\u0004\by\u0010\\R\u001e\u00106\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010Z\"\u0004\b{\u0010\\R\u001e\u00100\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010Z\"\u0004\b}\u0010\\R\u001e\u00102\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010Z\"\u0004\b\u007f\u0010\\R \u00108\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010Z\"\u0005\b\u0081\u0001\u0010\\R \u0010\u0018\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010Z\"\u0005\b\u0083\u0001\u0010\\R \u0010\u001a\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010Z\"\u0005\b\u0085\u0001\u0010\\R \u0010!\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010Z\"\u0005\b\u0087\u0001\u0010\\R \u0010\"\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010Z\"\u0005\b\u0089\u0001\u0010\\R \u0010D\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010Z\"\u0005\b\u008b\u0001\u0010\\R \u0010>\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0001\u0010Z\"\u0005\b\u008d\u0001\u0010\\R \u0010?\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010Z\"\u0005\b\u008f\u0001\u0010\\R!\u0010 \u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b \u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R!\u0010\u001f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u001f\u0010\u0090\u0001\"\u0006\b\u0093\u0001\u0010\u0092\u0001R!\u0010#\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b#\u0010\u0090\u0001\"\u0006\b\u0094\u0001\u0010\u0092\u0001R!\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\f\u0010\u0090\u0001\"\u0006\b\u0095\u0001\u0010\u0092\u0001R \u00107\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0096\u0001\u0010Z\"\u0005\b\u0097\u0001\u0010\\R \u00103\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0098\u0001\u0010Z\"\u0005\b\u0099\u0001\u0010\\R \u00104\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010Z\"\u0005\b\u009b\u0001\u0010\\R\"\u00109\u001a\u00020:8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R\"\u0010;\u001a\u00020:8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b \u0001\u0010\u009d\u0001\"\u0006\b¡\u0001\u0010\u009f\u0001R \u0010(\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¢\u0001\u0010Z\"\u0005\b£\u0001\u0010\\R \u0010\u001e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¤\u0001\u0010Z\"\u0005\b¥\u0001\u0010\\R \u0010\u001d\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¦\u0001\u0010Z\"\u0005\b§\u0001\u0010\\R \u0010)\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¨\u0001\u0010Z\"\u0005\b©\u0001\u0010\\R \u0010*\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bª\u0001\u0010Z\"\u0005\b«\u0001\u0010\\R \u0010+\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¬\u0001\u0010Z\"\u0005\b\u00ad\u0001\u0010\\R\u0019\u0010Q\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b®\u0001\u0010ZR&\u0010I\u001a\b\u0012\u0004\u0012\u00020K0J8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¯\u0001\u0010V\"\u0005\b°\u0001\u0010XR \u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b±\u0001\u0010Z\"\u0005\b²\u0001\u0010\\R \u0010-\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b³\u0001\u0010Z\"\u0005\b´\u0001\u0010\\R \u0010,\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bµ\u0001\u0010Z\"\u0005\b¶\u0001\u0010\\R \u0010E\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b·\u0001\u0010Z\"\u0005\b¸\u0001\u0010\\R\u0017\u0010N\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¹\u0001\u0010ZR\u0017\u0010M\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bº\u0001\u0010ZR \u0010/\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b»\u0001\u0010Z\"\u0005\b¼\u0001\u0010\\R\u0019\u0010R\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b½\u0001\u0010ZR\u0017\u0010O\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¾\u0001\u0010ZR \u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¿\u0001\u0010Z\"\u0005\bÀ\u0001\u0010\\R \u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÁ\u0001\u0010Z\"\u0005\bÂ\u0001\u0010\\R \u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÃ\u0001\u0010Z\"\u0005\bÄ\u0001\u0010\\R \u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÅ\u0001\u0010Z\"\u0005\bÆ\u0001\u0010\\R \u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÇ\u0001\u0010Z\"\u0005\bÈ\u0001\u0010\\R \u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÉ\u0001\u0010Z\"\u0005\bÊ\u0001\u0010\\R \u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bË\u0001\u0010Z\"\u0005\bÌ\u0001\u0010\\R \u0010\u0019\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÍ\u0001\u0010Z\"\u0005\bÎ\u0001\u0010\\R \u0010\u0017\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÏ\u0001\u0010Z\"\u0005\bÐ\u0001\u0010\\R \u0010.\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÑ\u0001\u0010Z\"\u0005\bÒ\u0001\u0010\\R \u00101\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÓ\u0001\u0010Z\"\u0005\bÔ\u0001\u0010\\R\u0019\u0010L\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bÕ\u0001\u0010ZR\u0018\u0010S\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÖ\u0001\u0010\u0090\u0001R \u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b×\u0001\u0010Z\"\u0005\bØ\u0001\u0010\\R \u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÙ\u0001\u0010Z\"\u0005\bÚ\u0001\u0010\\R \u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÛ\u0001\u0010Z\"\u0005\bÜ\u0001\u0010\\R \u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÝ\u0001\u0010Z\"\u0005\bÞ\u0001\u0010\\R \u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bß\u0001\u0010Z\"\u0005\bà\u0001\u0010\\R\"\u0010&\u001a\u00020'8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bá\u0001\u0010â\u0001\"\u0006\bã\u0001\u0010ä\u0001R \u0010$\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bå\u0001\u0010Z\"\u0005\bæ\u0001\u0010\\R \u0010%\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bç\u0001\u0010Z\"\u0005\bè\u0001\u0010\\¨\u0006¹\u0002"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostSubmitRequest;", "", "userFormatType", "", "userNameLogin", "userCode", "userLan", "userName", "channel", "subChannel", "rtrCode", "rtrName", "isWithDevice", "", "deviceCampaignType", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "otpCode", "customerNumber", "subscriberStatus", "subscriberLastChangeDateTime", "companyCode", "simCardNumber", "dealerNumber", "switchOffReasonCode", "groupCode", "subscriberType", "hardwareNumber", "brandName", "brandCode", "modelName", "modelCode", "isNewIMEI", "isDtacDevice", "idNumber", "idType", "isSmartCard", "verifyIDNumber", "verifyType", "verifyAttempt", "", "manualReason", "nbtcConfidence", "nbtcMessage", "nbtcStatus", "packageGroupCode", "packageDescription", "switchOnReasonCode", "requesterId", "firstName", MessageBundle.TITLE_ENTRY, "firstNameEnglish", "lastName", "lastNameEnglish", "birthDate", "expiryDate", "issueDate", HintConstants.AUTOFILL_HINT_GENDER, "legalAddress", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/Address;", "mailingAddress", "email", "contactNumber", "invoiceAlertLanguage", "invoiceAlertMethod", "consentAcceptType", "consentVersion", "attachmentNames", "", "identityPhotoName", "profileImage", "existingHardwareNumber", "existingBrand", "existingModel", "offersPackage", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/OffersPackage;", "togglePrepaidEnable", "requesterChannel", "requesterApplication", "requesterZone", "campaignID", "offerPOID", "requesterLocation", "updateConsent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/Address;Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAttachmentNames", "()Ljava/util/List;", "setAttachmentNames", "(Ljava/util/List;)V", "getBirthDate", "()Ljava/lang/String;", "setBirthDate", "(Ljava/lang/String;)V", "getBrandCode", "setBrandCode", "getBrandName", "setBrandName", "getCampaignID", "getChannel", "setChannel", "getCompanyCode", "setCompanyCode", "getConsentAcceptType", "setConsentAcceptType", "getConsentVersion", "setConsentVersion", "getContactNumber", "setContactNumber", "getCustomerNumber", "setCustomerNumber", "getDealerNumber", "setDealerNumber", "getDeviceCampaignType", "setDeviceCampaignType", "getEmail", "setEmail", "getExistingBrand", "setExistingBrand", "getExistingHardwareNumber", "setExistingHardwareNumber", "getExistingModel", "setExistingModel", "getExpiryDate", "setExpiryDate", "getFirstName", "setFirstName", "getFirstNameEnglish", "setFirstNameEnglish", "getGender", "setGender", "getGroupCode", "setGroupCode", "getHardwareNumber", "setHardwareNumber", "getIdNumber", "setIdNumber", "getIdType", "setIdType", "getIdentityPhotoName", "setIdentityPhotoName", "getInvoiceAlertLanguage", "setInvoiceAlertLanguage", "getInvoiceAlertMethod", "setInvoiceAlertMethod", "()Z", "setDtacDevice", "(Z)V", "setNewIMEI", "setSmartCard", "setWithDevice", "getIssueDate", "setIssueDate", "getLastName", "setLastName", "getLastNameEnglish", "setLastNameEnglish", "getLegalAddress", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/Address;", "setLegalAddress", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/Address;)V", "getMailingAddress", "setMailingAddress", "getManualReason", "setManualReason", "getModelCode", "setModelCode", "getModelName", "setModelName", "getNbtcConfidence", "setNbtcConfidence", "getNbtcMessage", "setNbtcMessage", "getNbtcStatus", "setNbtcStatus", "getOfferPOID", "getOffersPackage", "setOffersPackage", "getOtpCode", "setOtpCode", "getPackageDescription", "setPackageDescription", "getPackageGroupCode", "setPackageGroupCode", "getProfileImage", "setProfileImage", "getRequesterApplication", "getRequesterChannel", "getRequesterId", "setRequesterId", "getRequesterLocation", "getRequesterZone", "getRtrCode", "setRtrCode", "getRtrName", "setRtrName", "getSimCardNumber", "setSimCardNumber", "getSubChannel", "setSubChannel", "getSubscriberLastChangeDateTime", "setSubscriberLastChangeDateTime", "getSubscriberNumber", "setSubscriberNumber", "getSubscriberStatus", "setSubscriberStatus", "getSubscriberType", "setSubscriberType", "getSwitchOffReasonCode", "setSwitchOffReasonCode", "getSwitchOnReasonCode", "setSwitchOnReasonCode", "getTitle", "setTitle", "getTogglePrepaidEnable", "getUpdateConsent", "getUserCode", "setUserCode", "getUserFormatType", "setUserFormatType", "getUserLan", "setUserLan", "getUserName", "setUserName", "getUserNameLogin", "setUserNameLogin", "getVerifyAttempt", "()I", "setVerifyAttempt", "(I)V", "getVerifyIDNumber", "setVerifyIDNumber", "getVerifyType", "setVerifyType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component7", "component70", "component71", "component72", "component73", "component74", "component75", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostSubmitRequest */
/* loaded from: classes8.dex */
public final class OnePre2PostSubmitRequest {
    public static final int $stable = 8;
    @SerializedName("attachmentNames")
    @NotNull
    private List<String> attachmentNames;
    @SerializedName("birthDate")
    @NotNull
    private String birthDate;
    @SerializedName("brandCode")
    @NotNull
    private String brandCode;
    @SerializedName("brandName")
    @NotNull
    private String brandName;
    @SerializedName("campaignID")
    @Nullable
    private final String campaignID;
    @SerializedName("channel")
    @NotNull
    private String channel;
    @SerializedName("companyCode")
    @NotNull
    private String companyCode;
    @SerializedName("consentAcceptType")
    @NotNull
    private String consentAcceptType;
    @SerializedName("consentVersion")
    @NotNull
    private String consentVersion;
    @SerializedName("contactNumber")
    @NotNull
    private String contactNumber;
    @SerializedName("customerNumber")
    @NotNull
    private String customerNumber;
    @SerializedName("dealerNumber")
    @NotNull
    private String dealerNumber;
    @SerializedName("deviceCampaignType")
    @NotNull
    private String deviceCampaignType;
    @SerializedName("email")
    @NotNull
    private String email;
    @SerializedName("existingBrand")
    @NotNull
    private String existingBrand;
    @SerializedName("existingHardwareNumber")
    @NotNull
    private String existingHardwareNumber;
    @SerializedName("existingModel")
    @NotNull
    private String existingModel;
    @SerializedName("expiryDate")
    @NotNull
    private String expiryDate;
    @SerializedName("firstName")
    @NotNull
    private String firstName;
    @SerializedName("firstNameEnglish")
    @NotNull
    private String firstNameEnglish;
    @SerializedName(HintConstants.AUTOFILL_HINT_GENDER)
    @NotNull
    private String gender;
    @SerializedName("groupCode")
    @NotNull
    private String groupCode;
    @SerializedName("hardwareNumber")
    @NotNull
    private String hardwareNumber;
    @SerializedName("idNumber")
    @NotNull
    private String idNumber;
    @SerializedName("idType")
    @NotNull
    private String idType;
    @SerializedName("identityPhotoName")
    @NotNull
    private String identityPhotoName;
    @SerializedName("invoiceAlertLanguage")
    @NotNull
    private String invoiceAlertLanguage;
    @SerializedName("invoiceAlertMethod")
    @NotNull
    private String invoiceAlertMethod;
    @SerializedName("isDtacDevice")
    private boolean isDtacDevice;
    @SerializedName("isNewIMEI")
    private boolean isNewIMEI;
    @SerializedName("isSmartCard")
    private boolean isSmartCard;
    @SerializedName("isWithDevice")
    private boolean isWithDevice;
    @SerializedName("issueDate")
    @NotNull
    private String issueDate;
    @SerializedName("lastName")
    @NotNull
    private String lastName;
    @SerializedName("lastNameEnglish")
    @NotNull
    private String lastNameEnglish;
    @SerializedName("legalAddress")
    @NotNull
    private Address legalAddress;
    @SerializedName("mailingAddress")
    @NotNull
    private Address mailingAddress;
    @SerializedName("manualReason")
    @NotNull
    private String manualReason;
    @SerializedName("modelCode")
    @NotNull
    private String modelCode;
    @SerializedName("modelName")
    @NotNull
    private String modelName;
    @SerializedName("nbtcConfidence")
    @NotNull
    private String nbtcConfidence;
    @SerializedName("nbtcMessage")
    @NotNull
    private String nbtcMessage;
    @SerializedName("nbtcStatus")
    @NotNull
    private String nbtcStatus;
    @SerializedName("offerPOID")
    @Nullable
    private final String offerPOID;
    @SerializedName("offersPackage")
    @NotNull
    private List<OffersPackage> offersPackage;
    @SerializedName("otpCode")
    @NotNull
    private String otpCode;
    @SerializedName("packageDescription")
    @NotNull
    private String packageDescription;
    @SerializedName("packageGroupCode")
    @NotNull
    private String packageGroupCode;
    @SerializedName("profileImage")
    @NotNull
    private String profileImage;
    @SerializedName("requesterApplication")
    @NotNull
    private final String requesterApplication;
    @SerializedName("requesterChannel")
    @NotNull
    private final String requesterChannel;
    @SerializedName("requesterId")
    @NotNull
    private String requesterId;
    @SerializedName("requesterLocation")
    @Nullable
    private final String requesterLocation;
    @SerializedName("requesterZone")
    @NotNull
    private final String requesterZone;
    @SerializedName("rtrCode")
    @NotNull
    private String rtrCode;
    @SerializedName("rtrName")
    @NotNull
    private String rtrName;
    @SerializedName("simCardNumber")
    @NotNull
    private String simCardNumber;
    @SerializedName("subChannel")
    @NotNull
    private String subChannel;
    @SerializedName("subscriberLastChangeDateTime")
    @NotNull
    private String subscriberLastChangeDateTime;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private String subscriberNumber;
    @SerializedName("subscriberStatus")
    @NotNull
    private String subscriberStatus;
    @SerializedName("subscriberType")
    @NotNull
    private String subscriberType;
    @SerializedName("switchOffReasonCode")
    @NotNull
    private String switchOffReasonCode;
    @SerializedName("switchOnReasonCode")
    @NotNull
    private String switchOnReasonCode;
    @SerializedName(MessageBundle.TITLE_ENTRY)
    @NotNull
    private String title;
    @SerializedName("togglePrepaidEnable")
    @Nullable
    private final String togglePrepaidEnable;
    @SerializedName("updateConsent")
    private final boolean updateConsent;
    @SerializedName("userCode")
    @NotNull
    private String userCode;
    @SerializedName("userFormatType")
    @NotNull
    private String userFormatType;
    @SerializedName("userLan")
    @NotNull
    private String userLan;
    @SerializedName("userName")
    @NotNull
    private String userName;
    @SerializedName("userNameLogin")
    @NotNull
    private String userNameLogin;
    @SerializedName("verifyAttempt")
    private int verifyAttempt;
    @SerializedName("verifyIDNumber")
    @NotNull
    private String verifyIDNumber;
    @SerializedName("verifyType")
    @NotNull
    private String verifyType;

    public OnePre2PostSubmitRequest(@NotNull String userFormatType, @NotNull String userNameLogin, @NotNull String userCode, @NotNull String userLan, @NotNull String userName, @NotNull String channel, @NotNull String subChannel, @NotNull String rtrCode, @NotNull String rtrName, boolean z, @NotNull String deviceCampaignType, @NotNull String subscriberNumber, @NotNull String otpCode, @NotNull String customerNumber, @NotNull String subscriberStatus, @NotNull String subscriberLastChangeDateTime, @NotNull String companyCode, @NotNull String simCardNumber, @NotNull String dealerNumber, @NotNull String switchOffReasonCode, @NotNull String groupCode, @NotNull String subscriberType, @NotNull String hardwareNumber, @NotNull String brandName, @NotNull String brandCode, @NotNull String modelName, @NotNull String modelCode, boolean z2, boolean z3, @NotNull String idNumber, @NotNull String idType, boolean z4, @NotNull String verifyIDNumber, @NotNull String verifyType, int i, @NotNull String manualReason, @NotNull String nbtcConfidence, @NotNull String nbtcMessage, @NotNull String nbtcStatus, @NotNull String packageGroupCode, @NotNull String packageDescription, @NotNull String switchOnReasonCode, @NotNull String requesterId, @NotNull String firstName, @NotNull String title, @NotNull String firstNameEnglish, @NotNull String lastName, @NotNull String lastNameEnglish, @NotNull String birthDate, @NotNull String expiryDate, @NotNull String issueDate, @NotNull String gender, @NotNull Address legalAddress, @NotNull Address mailingAddress, @NotNull String email, @NotNull String contactNumber, @NotNull String invoiceAlertLanguage, @NotNull String invoiceAlertMethod, @NotNull String consentAcceptType, @NotNull String consentVersion, @NotNull List<String> attachmentNames, @NotNull String identityPhotoName, @NotNull String profileImage, @NotNull String existingHardwareNumber, @NotNull String existingBrand, @NotNull String existingModel, @NotNull List<OffersPackage> offersPackage, @Nullable String str, @NotNull String requesterChannel, @NotNull String requesterApplication, @NotNull String requesterZone, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z5) {
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(userNameLogin, "userNameLogin");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(subChannel, "subChannel");
        Intrinsics.checkNotNullParameter(rtrCode, "rtrCode");
        Intrinsics.checkNotNullParameter(rtrName, "rtrName");
        Intrinsics.checkNotNullParameter(deviceCampaignType, "deviceCampaignType");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(otpCode, "otpCode");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(subscriberStatus, "subscriberStatus");
        Intrinsics.checkNotNullParameter(subscriberLastChangeDateTime, "subscriberLastChangeDateTime");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(simCardNumber, "simCardNumber");
        Intrinsics.checkNotNullParameter(dealerNumber, "dealerNumber");
        Intrinsics.checkNotNullParameter(switchOffReasonCode, "switchOffReasonCode");
        Intrinsics.checkNotNullParameter(groupCode, "groupCode");
        Intrinsics.checkNotNullParameter(subscriberType, "subscriberType");
        Intrinsics.checkNotNullParameter(hardwareNumber, "hardwareNumber");
        Intrinsics.checkNotNullParameter(brandName, "brandName");
        Intrinsics.checkNotNullParameter(brandCode, "brandCode");
        Intrinsics.checkNotNullParameter(modelName, "modelName");
        Intrinsics.checkNotNullParameter(modelCode, "modelCode");
        Intrinsics.checkNotNullParameter(idNumber, "idNumber");
        Intrinsics.checkNotNullParameter(idType, "idType");
        Intrinsics.checkNotNullParameter(verifyIDNumber, "verifyIDNumber");
        Intrinsics.checkNotNullParameter(verifyType, "verifyType");
        Intrinsics.checkNotNullParameter(manualReason, "manualReason");
        Intrinsics.checkNotNullParameter(nbtcConfidence, "nbtcConfidence");
        Intrinsics.checkNotNullParameter(nbtcMessage, "nbtcMessage");
        Intrinsics.checkNotNullParameter(nbtcStatus, "nbtcStatus");
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(packageDescription, "packageDescription");
        Intrinsics.checkNotNullParameter(switchOnReasonCode, "switchOnReasonCode");
        Intrinsics.checkNotNullParameter(requesterId, "requesterId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(firstNameEnglish, "firstNameEnglish");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(lastNameEnglish, "lastNameEnglish");
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
        Intrinsics.checkNotNullParameter(issueDate, "issueDate");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(legalAddress, "legalAddress");
        Intrinsics.checkNotNullParameter(mailingAddress, "mailingAddress");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(contactNumber, "contactNumber");
        Intrinsics.checkNotNullParameter(invoiceAlertLanguage, "invoiceAlertLanguage");
        Intrinsics.checkNotNullParameter(invoiceAlertMethod, "invoiceAlertMethod");
        Intrinsics.checkNotNullParameter(consentAcceptType, "consentAcceptType");
        Intrinsics.checkNotNullParameter(consentVersion, "consentVersion");
        Intrinsics.checkNotNullParameter(attachmentNames, "attachmentNames");
        Intrinsics.checkNotNullParameter(identityPhotoName, "identityPhotoName");
        Intrinsics.checkNotNullParameter(profileImage, "profileImage");
        Intrinsics.checkNotNullParameter(existingHardwareNumber, "existingHardwareNumber");
        Intrinsics.checkNotNullParameter(existingBrand, "existingBrand");
        Intrinsics.checkNotNullParameter(existingModel, "existingModel");
        Intrinsics.checkNotNullParameter(offersPackage, "offersPackage");
        Intrinsics.checkNotNullParameter(requesterChannel, "requesterChannel");
        Intrinsics.checkNotNullParameter(requesterApplication, "requesterApplication");
        Intrinsics.checkNotNullParameter(requesterZone, "requesterZone");
        this.userFormatType = userFormatType;
        this.userNameLogin = userNameLogin;
        this.userCode = userCode;
        this.userLan = userLan;
        this.userName = userName;
        this.channel = channel;
        this.subChannel = subChannel;
        this.rtrCode = rtrCode;
        this.rtrName = rtrName;
        this.isWithDevice = z;
        this.deviceCampaignType = deviceCampaignType;
        this.subscriberNumber = subscriberNumber;
        this.otpCode = otpCode;
        this.customerNumber = customerNumber;
        this.subscriberStatus = subscriberStatus;
        this.subscriberLastChangeDateTime = subscriberLastChangeDateTime;
        this.companyCode = companyCode;
        this.simCardNumber = simCardNumber;
        this.dealerNumber = dealerNumber;
        this.switchOffReasonCode = switchOffReasonCode;
        this.groupCode = groupCode;
        this.subscriberType = subscriberType;
        this.hardwareNumber = hardwareNumber;
        this.brandName = brandName;
        this.brandCode = brandCode;
        this.modelName = modelName;
        this.modelCode = modelCode;
        this.isNewIMEI = z2;
        this.isDtacDevice = z3;
        this.idNumber = idNumber;
        this.idType = idType;
        this.isSmartCard = z4;
        this.verifyIDNumber = verifyIDNumber;
        this.verifyType = verifyType;
        this.verifyAttempt = i;
        this.manualReason = manualReason;
        this.nbtcConfidence = nbtcConfidence;
        this.nbtcMessage = nbtcMessage;
        this.nbtcStatus = nbtcStatus;
        this.packageGroupCode = packageGroupCode;
        this.packageDescription = packageDescription;
        this.switchOnReasonCode = switchOnReasonCode;
        this.requesterId = requesterId;
        this.firstName = firstName;
        this.title = title;
        this.firstNameEnglish = firstNameEnglish;
        this.lastName = lastName;
        this.lastNameEnglish = lastNameEnglish;
        this.birthDate = birthDate;
        this.expiryDate = expiryDate;
        this.issueDate = issueDate;
        this.gender = gender;
        this.legalAddress = legalAddress;
        this.mailingAddress = mailingAddress;
        this.email = email;
        this.contactNumber = contactNumber;
        this.invoiceAlertLanguage = invoiceAlertLanguage;
        this.invoiceAlertMethod = invoiceAlertMethod;
        this.consentAcceptType = consentAcceptType;
        this.consentVersion = consentVersion;
        this.attachmentNames = attachmentNames;
        this.identityPhotoName = identityPhotoName;
        this.profileImage = profileImage;
        this.existingHardwareNumber = existingHardwareNumber;
        this.existingBrand = existingBrand;
        this.existingModel = existingModel;
        this.offersPackage = offersPackage;
        this.togglePrepaidEnable = str;
        this.requesterChannel = requesterChannel;
        this.requesterApplication = requesterApplication;
        this.requesterZone = requesterZone;
        this.campaignID = str2;
        this.offerPOID = str3;
        this.requesterLocation = str4;
        this.updateConsent = z5;
    }

    @NotNull
    public final String component1() {
        return this.userFormatType;
    }

    public final boolean component10() {
        return this.isWithDevice;
    }

    @NotNull
    public final String component11() {
        return this.deviceCampaignType;
    }

    @NotNull
    public final String component12() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component13() {
        return this.otpCode;
    }

    @NotNull
    public final String component14() {
        return this.customerNumber;
    }

    @NotNull
    public final String component15() {
        return this.subscriberStatus;
    }

    @NotNull
    public final String component16() {
        return this.subscriberLastChangeDateTime;
    }

    @NotNull
    public final String component17() {
        return this.companyCode;
    }

    @NotNull
    public final String component18() {
        return this.simCardNumber;
    }

    @NotNull
    public final String component19() {
        return this.dealerNumber;
    }

    @NotNull
    public final String component2() {
        return this.userNameLogin;
    }

    @NotNull
    public final String component20() {
        return this.switchOffReasonCode;
    }

    @NotNull
    public final String component21() {
        return this.groupCode;
    }

    @NotNull
    public final String component22() {
        return this.subscriberType;
    }

    @NotNull
    public final String component23() {
        return this.hardwareNumber;
    }

    @NotNull
    public final String component24() {
        return this.brandName;
    }

    @NotNull
    public final String component25() {
        return this.brandCode;
    }

    @NotNull
    public final String component26() {
        return this.modelName;
    }

    @NotNull
    public final String component27() {
        return this.modelCode;
    }

    public final boolean component28() {
        return this.isNewIMEI;
    }

    public final boolean component29() {
        return this.isDtacDevice;
    }

    @NotNull
    public final String component3() {
        return this.userCode;
    }

    @NotNull
    public final String component30() {
        return this.idNumber;
    }

    @NotNull
    public final String component31() {
        return this.idType;
    }

    public final boolean component32() {
        return this.isSmartCard;
    }

    @NotNull
    public final String component33() {
        return this.verifyIDNumber;
    }

    @NotNull
    public final String component34() {
        return this.verifyType;
    }

    public final int component35() {
        return this.verifyAttempt;
    }

    @NotNull
    public final String component36() {
        return this.manualReason;
    }

    @NotNull
    public final String component37() {
        return this.nbtcConfidence;
    }

    @NotNull
    public final String component38() {
        return this.nbtcMessage;
    }

    @NotNull
    public final String component39() {
        return this.nbtcStatus;
    }

    @NotNull
    public final String component4() {
        return this.userLan;
    }

    @NotNull
    public final String component40() {
        return this.packageGroupCode;
    }

    @NotNull
    public final String component41() {
        return this.packageDescription;
    }

    @NotNull
    public final String component42() {
        return this.switchOnReasonCode;
    }

    @NotNull
    public final String component43() {
        return this.requesterId;
    }

    @NotNull
    public final String component44() {
        return this.firstName;
    }

    @NotNull
    public final String component45() {
        return this.title;
    }

    @NotNull
    public final String component46() {
        return this.firstNameEnglish;
    }

    @NotNull
    public final String component47() {
        return this.lastName;
    }

    @NotNull
    public final String component48() {
        return this.lastNameEnglish;
    }

    @NotNull
    public final String component49() {
        return this.birthDate;
    }

    @NotNull
    public final String component5() {
        return this.userName;
    }

    @NotNull
    public final String component50() {
        return this.expiryDate;
    }

    @NotNull
    public final String component51() {
        return this.issueDate;
    }

    @NotNull
    public final String component52() {
        return this.gender;
    }

    @NotNull
    public final Address component53() {
        return this.legalAddress;
    }

    @NotNull
    public final Address component54() {
        return this.mailingAddress;
    }

    @NotNull
    public final String component55() {
        return this.email;
    }

    @NotNull
    public final String component56() {
        return this.contactNumber;
    }

    @NotNull
    public final String component57() {
        return this.invoiceAlertLanguage;
    }

    @NotNull
    public final String component58() {
        return this.invoiceAlertMethod;
    }

    @NotNull
    public final String component59() {
        return this.consentAcceptType;
    }

    @NotNull
    public final String component6() {
        return this.channel;
    }

    @NotNull
    public final String component60() {
        return this.consentVersion;
    }

    @NotNull
    public final List<String> component61() {
        return this.attachmentNames;
    }

    @NotNull
    public final String component62() {
        return this.identityPhotoName;
    }

    @NotNull
    public final String component63() {
        return this.profileImage;
    }

    @NotNull
    public final String component64() {
        return this.existingHardwareNumber;
    }

    @NotNull
    public final String component65() {
        return this.existingBrand;
    }

    @NotNull
    public final String component66() {
        return this.existingModel;
    }

    @NotNull
    public final List<OffersPackage> component67() {
        return this.offersPackage;
    }

    @Nullable
    public final String component68() {
        return this.togglePrepaidEnable;
    }

    @NotNull
    public final String component69() {
        return this.requesterChannel;
    }

    @NotNull
    public final String component7() {
        return this.subChannel;
    }

    @NotNull
    public final String component70() {
        return this.requesterApplication;
    }

    @NotNull
    public final String component71() {
        return this.requesterZone;
    }

    @Nullable
    public final String component72() {
        return this.campaignID;
    }

    @Nullable
    public final String component73() {
        return this.offerPOID;
    }

    @Nullable
    public final String component74() {
        return this.requesterLocation;
    }

    public final boolean component75() {
        return this.updateConsent;
    }

    @NotNull
    public final String component8() {
        return this.rtrCode;
    }

    @NotNull
    public final String component9() {
        return this.rtrName;
    }

    @NotNull
    public final OnePre2PostSubmitRequest copy(@NotNull String userFormatType, @NotNull String userNameLogin, @NotNull String userCode, @NotNull String userLan, @NotNull String userName, @NotNull String channel, @NotNull String subChannel, @NotNull String rtrCode, @NotNull String rtrName, boolean z, @NotNull String deviceCampaignType, @NotNull String subscriberNumber, @NotNull String otpCode, @NotNull String customerNumber, @NotNull String subscriberStatus, @NotNull String subscriberLastChangeDateTime, @NotNull String companyCode, @NotNull String simCardNumber, @NotNull String dealerNumber, @NotNull String switchOffReasonCode, @NotNull String groupCode, @NotNull String subscriberType, @NotNull String hardwareNumber, @NotNull String brandName, @NotNull String brandCode, @NotNull String modelName, @NotNull String modelCode, boolean z2, boolean z3, @NotNull String idNumber, @NotNull String idType, boolean z4, @NotNull String verifyIDNumber, @NotNull String verifyType, int i, @NotNull String manualReason, @NotNull String nbtcConfidence, @NotNull String nbtcMessage, @NotNull String nbtcStatus, @NotNull String packageGroupCode, @NotNull String packageDescription, @NotNull String switchOnReasonCode, @NotNull String requesterId, @NotNull String firstName, @NotNull String title, @NotNull String firstNameEnglish, @NotNull String lastName, @NotNull String lastNameEnglish, @NotNull String birthDate, @NotNull String expiryDate, @NotNull String issueDate, @NotNull String gender, @NotNull Address legalAddress, @NotNull Address mailingAddress, @NotNull String email, @NotNull String contactNumber, @NotNull String invoiceAlertLanguage, @NotNull String invoiceAlertMethod, @NotNull String consentAcceptType, @NotNull String consentVersion, @NotNull List<String> attachmentNames, @NotNull String identityPhotoName, @NotNull String profileImage, @NotNull String existingHardwareNumber, @NotNull String existingBrand, @NotNull String existingModel, @NotNull List<OffersPackage> offersPackage, @Nullable String str, @NotNull String requesterChannel, @NotNull String requesterApplication, @NotNull String requesterZone, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z5) {
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(userNameLogin, "userNameLogin");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(subChannel, "subChannel");
        Intrinsics.checkNotNullParameter(rtrCode, "rtrCode");
        Intrinsics.checkNotNullParameter(rtrName, "rtrName");
        Intrinsics.checkNotNullParameter(deviceCampaignType, "deviceCampaignType");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(otpCode, "otpCode");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(subscriberStatus, "subscriberStatus");
        Intrinsics.checkNotNullParameter(subscriberLastChangeDateTime, "subscriberLastChangeDateTime");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(simCardNumber, "simCardNumber");
        Intrinsics.checkNotNullParameter(dealerNumber, "dealerNumber");
        Intrinsics.checkNotNullParameter(switchOffReasonCode, "switchOffReasonCode");
        Intrinsics.checkNotNullParameter(groupCode, "groupCode");
        Intrinsics.checkNotNullParameter(subscriberType, "subscriberType");
        Intrinsics.checkNotNullParameter(hardwareNumber, "hardwareNumber");
        Intrinsics.checkNotNullParameter(brandName, "brandName");
        Intrinsics.checkNotNullParameter(brandCode, "brandCode");
        Intrinsics.checkNotNullParameter(modelName, "modelName");
        Intrinsics.checkNotNullParameter(modelCode, "modelCode");
        Intrinsics.checkNotNullParameter(idNumber, "idNumber");
        Intrinsics.checkNotNullParameter(idType, "idType");
        Intrinsics.checkNotNullParameter(verifyIDNumber, "verifyIDNumber");
        Intrinsics.checkNotNullParameter(verifyType, "verifyType");
        Intrinsics.checkNotNullParameter(manualReason, "manualReason");
        Intrinsics.checkNotNullParameter(nbtcConfidence, "nbtcConfidence");
        Intrinsics.checkNotNullParameter(nbtcMessage, "nbtcMessage");
        Intrinsics.checkNotNullParameter(nbtcStatus, "nbtcStatus");
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(packageDescription, "packageDescription");
        Intrinsics.checkNotNullParameter(switchOnReasonCode, "switchOnReasonCode");
        Intrinsics.checkNotNullParameter(requesterId, "requesterId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(firstNameEnglish, "firstNameEnglish");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(lastNameEnglish, "lastNameEnglish");
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
        Intrinsics.checkNotNullParameter(issueDate, "issueDate");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(legalAddress, "legalAddress");
        Intrinsics.checkNotNullParameter(mailingAddress, "mailingAddress");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(contactNumber, "contactNumber");
        Intrinsics.checkNotNullParameter(invoiceAlertLanguage, "invoiceAlertLanguage");
        Intrinsics.checkNotNullParameter(invoiceAlertMethod, "invoiceAlertMethod");
        Intrinsics.checkNotNullParameter(consentAcceptType, "consentAcceptType");
        Intrinsics.checkNotNullParameter(consentVersion, "consentVersion");
        Intrinsics.checkNotNullParameter(attachmentNames, "attachmentNames");
        Intrinsics.checkNotNullParameter(identityPhotoName, "identityPhotoName");
        Intrinsics.checkNotNullParameter(profileImage, "profileImage");
        Intrinsics.checkNotNullParameter(existingHardwareNumber, "existingHardwareNumber");
        Intrinsics.checkNotNullParameter(existingBrand, "existingBrand");
        Intrinsics.checkNotNullParameter(existingModel, "existingModel");
        Intrinsics.checkNotNullParameter(offersPackage, "offersPackage");
        Intrinsics.checkNotNullParameter(requesterChannel, "requesterChannel");
        Intrinsics.checkNotNullParameter(requesterApplication, "requesterApplication");
        Intrinsics.checkNotNullParameter(requesterZone, "requesterZone");
        return new OnePre2PostSubmitRequest(userFormatType, userNameLogin, userCode, userLan, userName, channel, subChannel, rtrCode, rtrName, z, deviceCampaignType, subscriberNumber, otpCode, customerNumber, subscriberStatus, subscriberLastChangeDateTime, companyCode, simCardNumber, dealerNumber, switchOffReasonCode, groupCode, subscriberType, hardwareNumber, brandName, brandCode, modelName, modelCode, z2, z3, idNumber, idType, z4, verifyIDNumber, verifyType, i, manualReason, nbtcConfidence, nbtcMessage, nbtcStatus, packageGroupCode, packageDescription, switchOnReasonCode, requesterId, firstName, title, firstNameEnglish, lastName, lastNameEnglish, birthDate, expiryDate, issueDate, gender, legalAddress, mailingAddress, email, contactNumber, invoiceAlertLanguage, invoiceAlertMethod, consentAcceptType, consentVersion, attachmentNames, identityPhotoName, profileImage, existingHardwareNumber, existingBrand, existingModel, offersPackage, str, requesterChannel, requesterApplication, requesterZone, str2, str3, str4, z5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePre2PostSubmitRequest) {
            OnePre2PostSubmitRequest onePre2PostSubmitRequest = (OnePre2PostSubmitRequest) obj;
            return Intrinsics.areEqual(this.userFormatType, onePre2PostSubmitRequest.userFormatType) && Intrinsics.areEqual(this.userNameLogin, onePre2PostSubmitRequest.userNameLogin) && Intrinsics.areEqual(this.userCode, onePre2PostSubmitRequest.userCode) && Intrinsics.areEqual(this.userLan, onePre2PostSubmitRequest.userLan) && Intrinsics.areEqual(this.userName, onePre2PostSubmitRequest.userName) && Intrinsics.areEqual(this.channel, onePre2PostSubmitRequest.channel) && Intrinsics.areEqual(this.subChannel, onePre2PostSubmitRequest.subChannel) && Intrinsics.areEqual(this.rtrCode, onePre2PostSubmitRequest.rtrCode) && Intrinsics.areEqual(this.rtrName, onePre2PostSubmitRequest.rtrName) && this.isWithDevice == onePre2PostSubmitRequest.isWithDevice && Intrinsics.areEqual(this.deviceCampaignType, onePre2PostSubmitRequest.deviceCampaignType) && Intrinsics.areEqual(this.subscriberNumber, onePre2PostSubmitRequest.subscriberNumber) && Intrinsics.areEqual(this.otpCode, onePre2PostSubmitRequest.otpCode) && Intrinsics.areEqual(this.customerNumber, onePre2PostSubmitRequest.customerNumber) && Intrinsics.areEqual(this.subscriberStatus, onePre2PostSubmitRequest.subscriberStatus) && Intrinsics.areEqual(this.subscriberLastChangeDateTime, onePre2PostSubmitRequest.subscriberLastChangeDateTime) && Intrinsics.areEqual(this.companyCode, onePre2PostSubmitRequest.companyCode) && Intrinsics.areEqual(this.simCardNumber, onePre2PostSubmitRequest.simCardNumber) && Intrinsics.areEqual(this.dealerNumber, onePre2PostSubmitRequest.dealerNumber) && Intrinsics.areEqual(this.switchOffReasonCode, onePre2PostSubmitRequest.switchOffReasonCode) && Intrinsics.areEqual(this.groupCode, onePre2PostSubmitRequest.groupCode) && Intrinsics.areEqual(this.subscriberType, onePre2PostSubmitRequest.subscriberType) && Intrinsics.areEqual(this.hardwareNumber, onePre2PostSubmitRequest.hardwareNumber) && Intrinsics.areEqual(this.brandName, onePre2PostSubmitRequest.brandName) && Intrinsics.areEqual(this.brandCode, onePre2PostSubmitRequest.brandCode) && Intrinsics.areEqual(this.modelName, onePre2PostSubmitRequest.modelName) && Intrinsics.areEqual(this.modelCode, onePre2PostSubmitRequest.modelCode) && this.isNewIMEI == onePre2PostSubmitRequest.isNewIMEI && this.isDtacDevice == onePre2PostSubmitRequest.isDtacDevice && Intrinsics.areEqual(this.idNumber, onePre2PostSubmitRequest.idNumber) && Intrinsics.areEqual(this.idType, onePre2PostSubmitRequest.idType) && this.isSmartCard == onePre2PostSubmitRequest.isSmartCard && Intrinsics.areEqual(this.verifyIDNumber, onePre2PostSubmitRequest.verifyIDNumber) && Intrinsics.areEqual(this.verifyType, onePre2PostSubmitRequest.verifyType) && this.verifyAttempt == onePre2PostSubmitRequest.verifyAttempt && Intrinsics.areEqual(this.manualReason, onePre2PostSubmitRequest.manualReason) && Intrinsics.areEqual(this.nbtcConfidence, onePre2PostSubmitRequest.nbtcConfidence) && Intrinsics.areEqual(this.nbtcMessage, onePre2PostSubmitRequest.nbtcMessage) && Intrinsics.areEqual(this.nbtcStatus, onePre2PostSubmitRequest.nbtcStatus) && Intrinsics.areEqual(this.packageGroupCode, onePre2PostSubmitRequest.packageGroupCode) && Intrinsics.areEqual(this.packageDescription, onePre2PostSubmitRequest.packageDescription) && Intrinsics.areEqual(this.switchOnReasonCode, onePre2PostSubmitRequest.switchOnReasonCode) && Intrinsics.areEqual(this.requesterId, onePre2PostSubmitRequest.requesterId) && Intrinsics.areEqual(this.firstName, onePre2PostSubmitRequest.firstName) && Intrinsics.areEqual(this.title, onePre2PostSubmitRequest.title) && Intrinsics.areEqual(this.firstNameEnglish, onePre2PostSubmitRequest.firstNameEnglish) && Intrinsics.areEqual(this.lastName, onePre2PostSubmitRequest.lastName) && Intrinsics.areEqual(this.lastNameEnglish, onePre2PostSubmitRequest.lastNameEnglish) && Intrinsics.areEqual(this.birthDate, onePre2PostSubmitRequest.birthDate) && Intrinsics.areEqual(this.expiryDate, onePre2PostSubmitRequest.expiryDate) && Intrinsics.areEqual(this.issueDate, onePre2PostSubmitRequest.issueDate) && Intrinsics.areEqual(this.gender, onePre2PostSubmitRequest.gender) && Intrinsics.areEqual(this.legalAddress, onePre2PostSubmitRequest.legalAddress) && Intrinsics.areEqual(this.mailingAddress, onePre2PostSubmitRequest.mailingAddress) && Intrinsics.areEqual(this.email, onePre2PostSubmitRequest.email) && Intrinsics.areEqual(this.contactNumber, onePre2PostSubmitRequest.contactNumber) && Intrinsics.areEqual(this.invoiceAlertLanguage, onePre2PostSubmitRequest.invoiceAlertLanguage) && Intrinsics.areEqual(this.invoiceAlertMethod, onePre2PostSubmitRequest.invoiceAlertMethod) && Intrinsics.areEqual(this.consentAcceptType, onePre2PostSubmitRequest.consentAcceptType) && Intrinsics.areEqual(this.consentVersion, onePre2PostSubmitRequest.consentVersion) && Intrinsics.areEqual(this.attachmentNames, onePre2PostSubmitRequest.attachmentNames) && Intrinsics.areEqual(this.identityPhotoName, onePre2PostSubmitRequest.identityPhotoName) && Intrinsics.areEqual(this.profileImage, onePre2PostSubmitRequest.profileImage) && Intrinsics.areEqual(this.existingHardwareNumber, onePre2PostSubmitRequest.existingHardwareNumber) && Intrinsics.areEqual(this.existingBrand, onePre2PostSubmitRequest.existingBrand) && Intrinsics.areEqual(this.existingModel, onePre2PostSubmitRequest.existingModel) && Intrinsics.areEqual(this.offersPackage, onePre2PostSubmitRequest.offersPackage) && Intrinsics.areEqual(this.togglePrepaidEnable, onePre2PostSubmitRequest.togglePrepaidEnable) && Intrinsics.areEqual(this.requesterChannel, onePre2PostSubmitRequest.requesterChannel) && Intrinsics.areEqual(this.requesterApplication, onePre2PostSubmitRequest.requesterApplication) && Intrinsics.areEqual(this.requesterZone, onePre2PostSubmitRequest.requesterZone) && Intrinsics.areEqual(this.campaignID, onePre2PostSubmitRequest.campaignID) && Intrinsics.areEqual(this.offerPOID, onePre2PostSubmitRequest.offerPOID) && Intrinsics.areEqual(this.requesterLocation, onePre2PostSubmitRequest.requesterLocation) && this.updateConsent == onePre2PostSubmitRequest.updateConsent;
        }
        return false;
    }

    @NotNull
    public final List<String> getAttachmentNames() {
        return this.attachmentNames;
    }

    @NotNull
    public final String getBirthDate() {
        return this.birthDate;
    }

    @NotNull
    public final String getBrandCode() {
        return this.brandCode;
    }

    @NotNull
    public final String getBrandName() {
        return this.brandName;
    }

    @Nullable
    public final String getCampaignID() {
        return this.campaignID;
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @NotNull
    public final String getConsentAcceptType() {
        return this.consentAcceptType;
    }

    @NotNull
    public final String getConsentVersion() {
        return this.consentVersion;
    }

    @NotNull
    public final String getContactNumber() {
        return this.contactNumber;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @NotNull
    public final String getDealerNumber() {
        return this.dealerNumber;
    }

    @NotNull
    public final String getDeviceCampaignType() {
        return this.deviceCampaignType;
    }

    @NotNull
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final String getExistingBrand() {
        return this.existingBrand;
    }

    @NotNull
    public final String getExistingHardwareNumber() {
        return this.existingHardwareNumber;
    }

    @NotNull
    public final String getExistingModel() {
        return this.existingModel;
    }

    @NotNull
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    @NotNull
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    public final String getFirstNameEnglish() {
        return this.firstNameEnglish;
    }

    @NotNull
    public final String getGender() {
        return this.gender;
    }

    @NotNull
    public final String getGroupCode() {
        return this.groupCode;
    }

    @NotNull
    public final String getHardwareNumber() {
        return this.hardwareNumber;
    }

    @NotNull
    public final String getIdNumber() {
        return this.idNumber;
    }

    @NotNull
    public final String getIdType() {
        return this.idType;
    }

    @NotNull
    public final String getIdentityPhotoName() {
        return this.identityPhotoName;
    }

    @NotNull
    public final String getInvoiceAlertLanguage() {
        return this.invoiceAlertLanguage;
    }

    @NotNull
    public final String getInvoiceAlertMethod() {
        return this.invoiceAlertMethod;
    }

    @NotNull
    public final String getIssueDate() {
        return this.issueDate;
    }

    @NotNull
    public final String getLastName() {
        return this.lastName;
    }

    @NotNull
    public final String getLastNameEnglish() {
        return this.lastNameEnglish;
    }

    @NotNull
    public final Address getLegalAddress() {
        return this.legalAddress;
    }

    @NotNull
    public final Address getMailingAddress() {
        return this.mailingAddress;
    }

    @NotNull
    public final String getManualReason() {
        return this.manualReason;
    }

    @NotNull
    public final String getModelCode() {
        return this.modelCode;
    }

    @NotNull
    public final String getModelName() {
        return this.modelName;
    }

    @NotNull
    public final String getNbtcConfidence() {
        return this.nbtcConfidence;
    }

    @NotNull
    public final String getNbtcMessage() {
        return this.nbtcMessage;
    }

    @NotNull
    public final String getNbtcStatus() {
        return this.nbtcStatus;
    }

    @Nullable
    public final String getOfferPOID() {
        return this.offerPOID;
    }

    @NotNull
    public final List<OffersPackage> getOffersPackage() {
        return this.offersPackage;
    }

    @NotNull
    public final String getOtpCode() {
        return this.otpCode;
    }

    @NotNull
    public final String getPackageDescription() {
        return this.packageDescription;
    }

    @NotNull
    public final String getPackageGroupCode() {
        return this.packageGroupCode;
    }

    @NotNull
    public final String getProfileImage() {
        return this.profileImage;
    }

    @NotNull
    public final String getRequesterApplication() {
        return this.requesterApplication;
    }

    @NotNull
    public final String getRequesterChannel() {
        return this.requesterChannel;
    }

    @NotNull
    public final String getRequesterId() {
        return this.requesterId;
    }

    @Nullable
    public final String getRequesterLocation() {
        return this.requesterLocation;
    }

    @NotNull
    public final String getRequesterZone() {
        return this.requesterZone;
    }

    @NotNull
    public final String getRtrCode() {
        return this.rtrCode;
    }

    @NotNull
    public final String getRtrName() {
        return this.rtrName;
    }

    @NotNull
    public final String getSimCardNumber() {
        return this.simCardNumber;
    }

    @NotNull
    public final String getSubChannel() {
        return this.subChannel;
    }

    @NotNull
    public final String getSubscriberLastChangeDateTime() {
        return this.subscriberLastChangeDateTime;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String getSubscriberStatus() {
        return this.subscriberStatus;
    }

    @NotNull
    public final String getSubscriberType() {
        return this.subscriberType;
    }

    @NotNull
    public final String getSwitchOffReasonCode() {
        return this.switchOffReasonCode;
    }

    @NotNull
    public final String getSwitchOnReasonCode() {
        return this.switchOnReasonCode;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTogglePrepaidEnable() {
        return this.togglePrepaidEnable;
    }

    public final boolean getUpdateConsent() {
        return this.updateConsent;
    }

    @NotNull
    public final String getUserCode() {
        return this.userCode;
    }

    @NotNull
    public final String getUserFormatType() {
        return this.userFormatType;
    }

    @NotNull
    public final String getUserLan() {
        return this.userLan;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    @NotNull
    public final String getUserNameLogin() {
        return this.userNameLogin;
    }

    public final int getVerifyAttempt() {
        return this.verifyAttempt;
    }

    @NotNull
    public final String getVerifyIDNumber() {
        return this.verifyIDNumber;
    }

    @NotNull
    public final String getVerifyType() {
        return this.verifyType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((this.userFormatType.hashCode() * 31) + this.userNameLogin.hashCode()) * 31) + this.userCode.hashCode()) * 31) + this.userLan.hashCode()) * 31) + this.userName.hashCode()) * 31) + this.channel.hashCode()) * 31) + this.subChannel.hashCode()) * 31) + this.rtrCode.hashCode()) * 31) + this.rtrName.hashCode()) * 31;
        boolean z = this.isWithDevice;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((((((((((((((((((((((((((((((((((hashCode + i) * 31) + this.deviceCampaignType.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.otpCode.hashCode()) * 31) + this.customerNumber.hashCode()) * 31) + this.subscriberStatus.hashCode()) * 31) + this.subscriberLastChangeDateTime.hashCode()) * 31) + this.companyCode.hashCode()) * 31) + this.simCardNumber.hashCode()) * 31) + this.dealerNumber.hashCode()) * 31) + this.switchOffReasonCode.hashCode()) * 31) + this.groupCode.hashCode()) * 31) + this.subscriberType.hashCode()) * 31) + this.hardwareNumber.hashCode()) * 31) + this.brandName.hashCode()) * 31) + this.brandCode.hashCode()) * 31) + this.modelName.hashCode()) * 31) + this.modelCode.hashCode()) * 31;
        boolean z2 = this.isNewIMEI;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z3 = this.isDtacDevice;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int hashCode3 = (((((i3 + i4) * 31) + this.idNumber.hashCode()) * 31) + this.idType.hashCode()) * 31;
        boolean z4 = this.isSmartCard;
        int i5 = z4;
        if (z4 != 0) {
            i5 = 1;
        }
        int hashCode4 = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode3 + i5) * 31) + this.verifyIDNumber.hashCode()) * 31) + this.verifyType.hashCode()) * 31) + this.verifyAttempt) * 31) + this.manualReason.hashCode()) * 31) + this.nbtcConfidence.hashCode()) * 31) + this.nbtcMessage.hashCode()) * 31) + this.nbtcStatus.hashCode()) * 31) + this.packageGroupCode.hashCode()) * 31) + this.packageDescription.hashCode()) * 31) + this.switchOnReasonCode.hashCode()) * 31) + this.requesterId.hashCode()) * 31) + this.firstName.hashCode()) * 31) + this.title.hashCode()) * 31) + this.firstNameEnglish.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.lastNameEnglish.hashCode()) * 31) + this.birthDate.hashCode()) * 31) + this.expiryDate.hashCode()) * 31) + this.issueDate.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.legalAddress.hashCode()) * 31) + this.mailingAddress.hashCode()) * 31) + this.email.hashCode()) * 31) + this.contactNumber.hashCode()) * 31) + this.invoiceAlertLanguage.hashCode()) * 31) + this.invoiceAlertMethod.hashCode()) * 31) + this.consentAcceptType.hashCode()) * 31) + this.consentVersion.hashCode()) * 31) + this.attachmentNames.hashCode()) * 31) + this.identityPhotoName.hashCode()) * 31) + this.profileImage.hashCode()) * 31) + this.existingHardwareNumber.hashCode()) * 31) + this.existingBrand.hashCode()) * 31) + this.existingModel.hashCode()) * 31) + this.offersPackage.hashCode()) * 31;
        String str = this.togglePrepaidEnable;
        int hashCode5 = (((((((hashCode4 + (str == null ? 0 : str.hashCode())) * 31) + this.requesterChannel.hashCode()) * 31) + this.requesterApplication.hashCode()) * 31) + this.requesterZone.hashCode()) * 31;
        String str2 = this.campaignID;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.offerPOID;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.requesterLocation;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z5 = this.updateConsent;
        return hashCode8 + (z5 ? 1 : z5 ? 1 : 0);
    }

    public final boolean isDtacDevice() {
        return this.isDtacDevice;
    }

    public final boolean isNewIMEI() {
        return this.isNewIMEI;
    }

    public final boolean isSmartCard() {
        return this.isSmartCard;
    }

    public final boolean isWithDevice() {
        return this.isWithDevice;
    }

    public final void setAttachmentNames(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.attachmentNames = list;
    }

    public final void setBirthDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.birthDate = str;
    }

    public final void setBrandCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.brandCode = str;
    }

    public final void setBrandName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.brandName = str;
    }

    public final void setChannel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.channel = str;
    }

    public final void setCompanyCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.companyCode = str;
    }

    public final void setConsentAcceptType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.consentAcceptType = str;
    }

    public final void setConsentVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.consentVersion = str;
    }

    public final void setContactNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.contactNumber = str;
    }

    public final void setCustomerNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.customerNumber = str;
    }

    public final void setDealerNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dealerNumber = str;
    }

    public final void setDeviceCampaignType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceCampaignType = str;
    }

    public final void setDtacDevice(boolean z) {
        this.isDtacDevice = z;
    }

    public final void setEmail(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email = str;
    }

    public final void setExistingBrand(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.existingBrand = str;
    }

    public final void setExistingHardwareNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.existingHardwareNumber = str;
    }

    public final void setExistingModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.existingModel = str;
    }

    public final void setExpiryDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.expiryDate = str;
    }

    public final void setFirstName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.firstName = str;
    }

    public final void setFirstNameEnglish(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.firstNameEnglish = str;
    }

    public final void setGender(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gender = str;
    }

    public final void setGroupCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.groupCode = str;
    }

    public final void setHardwareNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.hardwareNumber = str;
    }

    public final void setIdNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idNumber = str;
    }

    public final void setIdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idType = str;
    }

    public final void setIdentityPhotoName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.identityPhotoName = str;
    }

    public final void setInvoiceAlertLanguage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.invoiceAlertLanguage = str;
    }

    public final void setInvoiceAlertMethod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.invoiceAlertMethod = str;
    }

    public final void setIssueDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.issueDate = str;
    }

    public final void setLastName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastName = str;
    }

    public final void setLastNameEnglish(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastNameEnglish = str;
    }

    public final void setLegalAddress(@NotNull Address address) {
        Intrinsics.checkNotNullParameter(address, "<set-?>");
        this.legalAddress = address;
    }

    public final void setMailingAddress(@NotNull Address address) {
        Intrinsics.checkNotNullParameter(address, "<set-?>");
        this.mailingAddress = address;
    }

    public final void setManualReason(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.manualReason = str;
    }

    public final void setModelCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.modelCode = str;
    }

    public final void setModelName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.modelName = str;
    }

    public final void setNbtcConfidence(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nbtcConfidence = str;
    }

    public final void setNbtcMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nbtcMessage = str;
    }

    public final void setNbtcStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nbtcStatus = str;
    }

    public final void setNewIMEI(boolean z) {
        this.isNewIMEI = z;
    }

    public final void setOffersPackage(@NotNull List<OffersPackage> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.offersPackage = list;
    }

    public final void setOtpCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.otpCode = str;
    }

    public final void setPackageDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageDescription = str;
    }

    public final void setPackageGroupCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageGroupCode = str;
    }

    public final void setProfileImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.profileImage = str;
    }

    public final void setRequesterId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.requesterId = str;
    }

    public final void setRtrCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtrCode = str;
    }

    public final void setRtrName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtrName = str;
    }

    public final void setSimCardNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.simCardNumber = str;
    }

    public final void setSmartCard(boolean z) {
        this.isSmartCard = z;
    }

    public final void setSubChannel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subChannel = str;
    }

    public final void setSubscriberLastChangeDateTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberLastChangeDateTime = str;
    }

    public final void setSubscriberNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberNumber = str;
    }

    public final void setSubscriberStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberStatus = str;
    }

    public final void setSubscriberType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberType = str;
    }

    public final void setSwitchOffReasonCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.switchOffReasonCode = str;
    }

    public final void setSwitchOnReasonCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.switchOnReasonCode = str;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void setUserCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userCode = str;
    }

    public final void setUserFormatType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userFormatType = str;
    }

    public final void setUserLan(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userLan = str;
    }

    public final void setUserName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userName = str;
    }

    public final void setUserNameLogin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userNameLogin = str;
    }

    public final void setVerifyAttempt(int i) {
        this.verifyAttempt = i;
    }

    public final void setVerifyIDNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.verifyIDNumber = str;
    }

    public final void setVerifyType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.verifyType = str;
    }

    public final void setWithDevice(boolean z) {
        this.isWithDevice = z;
    }

    @NotNull
    public String toString() {
        String str = this.userFormatType;
        String str2 = this.userNameLogin;
        String str3 = this.userCode;
        String str4 = this.userLan;
        String str5 = this.userName;
        String str6 = this.channel;
        String str7 = this.subChannel;
        String str8 = this.rtrCode;
        String str9 = this.rtrName;
        boolean z = this.isWithDevice;
        String str10 = this.deviceCampaignType;
        String str11 = this.subscriberNumber;
        String str12 = this.otpCode;
        String str13 = this.customerNumber;
        String str14 = this.subscriberStatus;
        String str15 = this.subscriberLastChangeDateTime;
        String str16 = this.companyCode;
        String str17 = this.simCardNumber;
        String str18 = this.dealerNumber;
        String str19 = this.switchOffReasonCode;
        String str20 = this.groupCode;
        String str21 = this.subscriberType;
        String str22 = this.hardwareNumber;
        String str23 = this.brandName;
        String str24 = this.brandCode;
        String str25 = this.modelName;
        String str26 = this.modelCode;
        boolean z2 = this.isNewIMEI;
        boolean z3 = this.isDtacDevice;
        String str27 = this.idNumber;
        String str28 = this.idType;
        boolean z4 = this.isSmartCard;
        String str29 = this.verifyIDNumber;
        String str30 = this.verifyType;
        int i = this.verifyAttempt;
        String str31 = this.manualReason;
        String str32 = this.nbtcConfidence;
        String str33 = this.nbtcMessage;
        String str34 = this.nbtcStatus;
        String str35 = this.packageGroupCode;
        String str36 = this.packageDescription;
        String str37 = this.switchOnReasonCode;
        String str38 = this.requesterId;
        String str39 = this.firstName;
        String str40 = this.title;
        String str41 = this.firstNameEnglish;
        String str42 = this.lastName;
        String str43 = this.lastNameEnglish;
        String str44 = this.birthDate;
        String str45 = this.expiryDate;
        String str46 = this.issueDate;
        String str47 = this.gender;
        Address address = this.legalAddress;
        Address address2 = this.mailingAddress;
        String str48 = this.email;
        String str49 = this.contactNumber;
        String str50 = this.invoiceAlertLanguage;
        String str51 = this.invoiceAlertMethod;
        String str52 = this.consentAcceptType;
        String str53 = this.consentVersion;
        List<String> list = this.attachmentNames;
        String str54 = this.identityPhotoName;
        String str55 = this.profileImage;
        String str56 = this.existingHardwareNumber;
        String str57 = this.existingBrand;
        String str58 = this.existingModel;
        List<OffersPackage> list2 = this.offersPackage;
        String str59 = this.togglePrepaidEnable;
        String str60 = this.requesterChannel;
        String str61 = this.requesterApplication;
        String str62 = this.requesterZone;
        String str63 = this.campaignID;
        String str64 = this.offerPOID;
        String str65 = this.requesterLocation;
        boolean z5 = this.updateConsent;
        return "OnePre2PostSubmitRequest(userFormatType=" + str + ", userNameLogin=" + str2 + ", userCode=" + str3 + ", userLan=" + str4 + ", userName=" + str5 + ", channel=" + str6 + ", subChannel=" + str7 + ", rtrCode=" + str8 + ", rtrName=" + str9 + ", isWithDevice=" + z + ", deviceCampaignType=" + str10 + ", subscriberNumber=" + str11 + ", otpCode=" + str12 + ", customerNumber=" + str13 + ", subscriberStatus=" + str14 + ", subscriberLastChangeDateTime=" + str15 + ", companyCode=" + str16 + ", simCardNumber=" + str17 + ", dealerNumber=" + str18 + ", switchOffReasonCode=" + str19 + ", groupCode=" + str20 + ", subscriberType=" + str21 + ", hardwareNumber=" + str22 + ", brandName=" + str23 + ", brandCode=" + str24 + ", modelName=" + str25 + ", modelCode=" + str26 + ", isNewIMEI=" + z2 + ", isDtacDevice=" + z3 + ", idNumber=" + str27 + ", idType=" + str28 + ", isSmartCard=" + z4 + ", verifyIDNumber=" + str29 + ", verifyType=" + str30 + ", verifyAttempt=" + i + ", manualReason=" + str31 + ", nbtcConfidence=" + str32 + ", nbtcMessage=" + str33 + ", nbtcStatus=" + str34 + ", packageGroupCode=" + str35 + ", packageDescription=" + str36 + ", switchOnReasonCode=" + str37 + ", requesterId=" + str38 + ", firstName=" + str39 + ", title=" + str40 + ", firstNameEnglish=" + str41 + ", lastName=" + str42 + ", lastNameEnglish=" + str43 + ", birthDate=" + str44 + ", expiryDate=" + str45 + ", issueDate=" + str46 + ", gender=" + str47 + ", legalAddress=" + address + ", mailingAddress=" + address2 + ", email=" + str48 + ", contactNumber=" + str49 + ", invoiceAlertLanguage=" + str50 + ", invoiceAlertMethod=" + str51 + ", consentAcceptType=" + str52 + ", consentVersion=" + str53 + ", attachmentNames=" + list + ", identityPhotoName=" + str54 + ", profileImage=" + str55 + ", existingHardwareNumber=" + str56 + ", existingBrand=" + str57 + ", existingModel=" + str58 + ", offersPackage=" + list2 + ", togglePrepaidEnable=" + str59 + ", requesterChannel=" + str60 + ", requesterApplication=" + str61 + ", requesterZone=" + str62 + ", campaignID=" + str63 + ", offerPOID=" + str64 + ", requesterLocation=" + str65 + ", updateConsent=" + z5 + ")";
    }

    public /* synthetic */ OnePre2PostSubmitRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, boolean z2, boolean z3, String str27, String str28, boolean z4, String str29, String str30, int i, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, Address address, Address address2, String str48, String str49, String str50, String str51, String str52, String str53, List list, String str54, String str55, String str56, String str57, String str58, List list2, String str59, String str60, String str61, String str62, String str63, String str64, String str65, boolean z5, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, z, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, z2, z3, str27, str28, z4, str29, str30, i, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, address, address2, str48, str49, str50, str51, str52, str53, list, str54, str55, str56, str57, str58, list2, (i4 & 8) != 0 ? null : str59, (i4 & 16) != 0 ? "" : str60, (i4 & 32) != 0 ? "" : str61, (i4 & 64) != 0 ? "" : str62, (i4 & 128) != 0 ? "" : str63, (i4 & 256) != 0 ? "" : str64, (i4 & 512) != 0 ? "" : str65, (i4 & 1024) != 0 ? false : z5);
    }
}
