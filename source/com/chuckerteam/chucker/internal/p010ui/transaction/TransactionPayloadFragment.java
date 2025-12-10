package com.chuckerteam.chucker.internal.p010ui.transaction;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.chuckerteam.chucker.R;
import com.chuckerteam.chucker.databinding.ChuckerFragmentTransactionPayloadBinding;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.p010ui.transaction.TransactionBodyAdapter;
import com.chuckerteam.chucker.internal.p010ui.transaction.TransactionPayloadFragment;
import com.chuckerteam.chucker.internal.support.LiveDataUtilsKt;
import com.chuckerteam.chucker.internal.support.ViewUtilsKt;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 r2\u00020\u00012\u00020\u0002:\u0001rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b#\u0010!J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u001fH\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0007H\u0002¢\u0006\u0004\b'\u0010\u0004J\u000f\u0010(\u001a\u00020\u0007H\u0002¢\u0006\u0004\b(\u0010\u0004J\u0019\u0010+\u001a\u00020\u001f2\b\u0010*\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b+\u0010,J\u0019\u0010-\u001a\u00020\u001f2\b\u0010*\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b-\u0010,J\u000f\u0010.\u001a\u00020\u0007H\u0002¢\u0006\u0004\b.\u0010\u0004J\u0019\u00100\u001a\u00020\u00072\b\b\u0002\u0010/\u001a\u00020\u001fH\u0002¢\u0006\u0004\b0\u0010&J!\u00104\u001a\u00020\u00072\u0006\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u000201H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00072\u0006\u00106\u001a\u000201H\u0002¢\u0006\u0004\b7\u00108J1\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<2\u0006\u0010:\u001a\u0002092\u0006\u0010*\u001a\u00020)2\u0006\u0010;\u001a\u00020\u001fH\u0082@ø\u0001\u0000¢\u0006\u0004\b>\u0010?J+\u0010B\u001a\u00020\u001f2\u0006\u0010:\u001a\u0002092\u0006\u0010A\u001a\u00020@2\u0006\u0010*\u001a\u00020)H\u0082@ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u001f\u0010D\u001a\u00020\u001f2\u0006\u0010:\u001a\u0002092\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\bD\u0010EJ\u0019\u0010H\u001a\b\u0012\u0004\u0012\u00020F0G*\u00020FH\u0002¢\u0006\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001b\u0010S\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010L\u001a\u0004\bQ\u0010RR\"\u0010X\u001a\u0010\u0012\f\u0012\n U*\u0004\u0018\u00010\u001d0\u001d0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010\\\u001a\u00020Y8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010b\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010'R\u0016\u0010d\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010'R\u0016\u0010f\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010'R$\u0010l\u001a\u0012\u0012\u0004\u0012\u00020h0gj\b\u0012\u0004\u0012\u00020h`i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010n\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010'R\u0016\u0010q\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010p\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006s"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", Promotion.ACTION_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "onCreateOptionsMenu", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "(Landroid/content/Context;)V", "", SearchIntents.EXTRA_QUERY, "", "onQueryTextSubmit", "(Ljava/lang/String;)Z", "newText", "onQueryTextChange", "goNext", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "(Z)V", "I", OperatorName.SET_LINE_CAPSTYLE, "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", OperatorName.STROKING_COLOR_GRAY, "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)Z", "H", OperatorName.SAVE, "visible", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "", "searchResultsCount", "currentIndex", "K", "(II)V", "positionOfScrollableIndices", "F", "(I)V", "Lcom/chuckerteam/chucker/internal/ui/transaction/PayloadType;", "type", "formatRequestBody", "", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadItem;", "C", "(Lcom/chuckerteam/chucker/internal/ui/transaction/PayloadType;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Uri;", "uri", "D", "(Lcom/chuckerteam/chucker/internal/ui/transaction/PayloadType;Landroid/net/Uri;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "(Lcom/chuckerteam/chucker/internal/ui/transaction/PayloadType;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)Z", "", "", "u", "(Ljava/lang/CharSequence;)Ljava/util/List;", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionViewModel;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/Lazy;", OperatorName.CLOSE_AND_STROKE, "()Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionViewModel;", "viewModel", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, PDPageLabelRange.STYLE_ROMAN_LOWER, "()Lcom/chuckerteam/chucker/internal/ui/transaction/PayloadType;", "payloadType", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", OperatorName.CURVE_TO, "Landroidx/activity/result/ActivityResultLauncher;", "saveToFile", "Lcom/chuckerteam/chucker/databinding/ChuckerFragmentTransactionPayloadBinding;", "d", "Lcom/chuckerteam/chucker/databinding/ChuckerFragmentTransactionPayloadBinding;", "payloadBinding", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionBodyAdapter;", "e", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionBodyAdapter;", "payloadAdapter", OperatorName.FILL_NON_ZERO, "backgroundSpanColor", OperatorName.NON_STROKING_GRAY, "foregroundSpanColor", OperatorName.CLOSE_PATH, "backgroundSpanColorSearchItem", "Ljava/util/ArrayList;", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionBodyAdapter$SearchItemBodyLine;", "Lkotlin/collections/ArrayList;", "i", "Ljava/util/ArrayList;", "scrollableIndices", OperatorName.SET_LINE_JOINSTYLE, "currentSearchScrollIndex", OperatorName.NON_STROKING_CMYK, "Ljava/lang/String;", "currentSearchQuery", "Companion", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransactionPayloadFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionPayloadFragment.kt\ncom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n1#1,460:1\n172#2,9:461\n87#3:470\n74#3,4:471\n*S KotlinDebug\n*F\n+ 1 TransactionPayloadFragment.kt\ncom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadFragment\n*L\n48#1:461,9\n287#1:470\n287#1:471,4\n*E\n"})
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment */
/* loaded from: classes3.dex */
public final class TransactionPayloadFragment extends Fragment implements SearchView.OnQueryTextListener {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String DEFAULT_FILE_PREFIX = "chucker-export-";

    /* renamed from: a */
    public final Lazy f43021a;

    /* renamed from: b */
    public final Lazy f43022b;

    /* renamed from: c */
    public final ActivityResultLauncher f43023c;

    /* renamed from: d */
    public ChuckerFragmentTransactionPayloadBinding f43024d;

    /* renamed from: e */
    public final TransactionBodyAdapter f43025e;

    /* renamed from: f */
    public int f43026f;

    /* renamed from: g */
    public int f43027g;

    /* renamed from: h */
    public int f43028h;

    /* renamed from: i */
    public final ArrayList f43029i;

    /* renamed from: j */
    public int f43030j;

    /* renamed from: k */
    public String f43031k;

    @Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadFragment$Companion;", "", "()V", "ARG_TYPE", "", "DEFAULT_FILE_PREFIX", "DELAY_FOR_SEARCH_SCROLL", "", "NUMBER_OF_IGNORED_SYMBOLS", "", "TRANSACTION_EXCEPTION", "newInstance", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadFragment;", "type", "Lcom/chuckerteam/chucker/internal/ui/transaction/PayloadType;", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$Companion */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TransactionPayloadFragment newInstance(@NotNull PayloadType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            TransactionPayloadFragment transactionPayloadFragment = new TransactionPayloadFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("type", type);
            transactionPayloadFragment.setArguments(bundle);
            return transactionPayloadFragment;
        }

        public Companion() {
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$WhenMappings */
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PayloadType.values().length];
            try {
                iArr[PayloadType.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PayloadType.RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$a */
    /* loaded from: classes3.dex */
    public static final class C5983a implements Observer, FunctionAdapter {

        /* renamed from: a */
        public final /* synthetic */ Function1 f43032a;

        public C5983a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f43032a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f43032a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43032a.invoke(obj);
        }
    }

    public TransactionPayloadFragment() {
        Function0 function0 = TransactionPayloadFragment$viewModel$2.INSTANCE;
        this.f43021a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TransactionViewModel.class), new C5985xeae6d896(this), new C5986xeae6d897(null, this), function0 == null ? new C5987xeae6d898(this) : function0);
        this.f43022b = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new TransactionPayloadFragment$payloadType$2(this));
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.CreateDocument(), new ActivityResultCallback() { // from class: UU1
            {
                TransactionPayloadFragment.this = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                TransactionPayloadFragment.m49841p(TransactionPayloadFragment.this, (Uri) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.f43023c = registerForActivityResult;
        this.f43025e = new TransactionBodyAdapter();
        this.f43026f = -256;
        this.f43027g = SupportMenu.CATEGORY_MASK;
        this.f43028h = -16711936;
        this.f43029i = new ArrayList();
        this.f43030j = -1;
        this.f43031k = "";
    }

    /* renamed from: A */
    public static final void m49856A(TransactionPayloadFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m49832y(true);
    }

    /* renamed from: B */
    public static final void m49855B(TransactionPayloadFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m49832y(false);
    }

    /* renamed from: E */
    public static final void m49852E(TransactionPayloadFragment this$0, Uri uri) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        HttpTransaction value = this$0.m49838s().getTransaction().getValue();
        Context applicationContext = this$0.requireContext().getApplicationContext();
        if (uri != null && value != null) {
            AbstractC1552Vc.m65753e(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new TransactionPayloadFragment$saveToFile$1$1(this$0, uri, value, applicationContext, null), 3, null);
        } else {
            Toast.makeText(applicationContext, R.string.chucker_save_failed_to_open_document, 0).show();
        }
    }

    /* renamed from: l */
    public static /* synthetic */ void m49845l(TransactionPayloadFragment transactionPayloadFragment, View view) {
        m49856A(transactionPayloadFragment, view);
    }

    /* renamed from: m */
    public static /* synthetic */ void m49844m(TransactionPayloadFragment transactionPayloadFragment, View view) {
        m49855B(transactionPayloadFragment, view);
    }

    /* renamed from: n */
    public static /* synthetic */ boolean m49843n(TransactionPayloadFragment transactionPayloadFragment, MenuItem menuItem) {
        return m49833x(transactionPayloadFragment, menuItem);
    }

    /* renamed from: o */
    public static /* synthetic */ void m49842o(TransactionPayloadFragment transactionPayloadFragment, Pair pair) {
        m49831z(transactionPayloadFragment, pair);
    }

    /* renamed from: p */
    public static /* synthetic */ void m49841p(TransactionPayloadFragment transactionPayloadFragment, Uri uri) {
        m49852E(transactionPayloadFragment, uri);
    }

    /* renamed from: s */
    private final TransactionViewModel m49838s() {
        return (TransactionViewModel) this.f43021a.getValue();
    }

    /* renamed from: w */
    public static /* synthetic */ void m49834w(TransactionPayloadFragment transactionPayloadFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        transactionPayloadFragment.m49835v(z);
    }

    /* renamed from: x */
    public static final boolean m49833x(TransactionPayloadFragment this$0, MenuItem it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.m49840q();
        return true;
    }

    /* renamed from: z */
    public static final void m49831z(TransactionPayloadFragment this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        HttpTransaction httpTransaction = (HttpTransaction) pair.component1();
        boolean booleanValue = ((Boolean) pair.component2()).booleanValue();
        if (httpTransaction != null) {
            AbstractC1552Vc.m65753e(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new TransactionPayloadFragment$onViewCreated$2$1(this$0, httpTransaction, booleanValue, null), 3, null);
        }
    }

    /* renamed from: C */
    public final Object m49854C(PayloadType payloadType, HttpTransaction httpTransaction, boolean z, Continuation continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new TransactionPayloadFragment$processPayload$2(payloadType, httpTransaction, z, this, null), continuation);
    }

    /* renamed from: D */
    public final Object m49853D(PayloadType payloadType, Uri uri, HttpTransaction httpTransaction, Continuation continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new TransactionPayloadFragment$saveToFile$3(this, uri, payloadType, httpTransaction, null), continuation);
    }

    /* renamed from: F */
    public final void m49851F(int i) {
        TransactionBodyAdapter.SearchItemBodyLine searchItemBodyLine = (TransactionBodyAdapter.SearchItemBodyLine) CollectionsKt___CollectionsKt.getOrNull(this.f43029i, this.f43030j);
        if (searchItemBodyLine != null) {
            this.f43025e.m49863xbb91ef2c(searchItemBodyLine.getIndexBodyLine(), searchItemBodyLine.getIndexStartOfQuerySubString(), this.f43031k, this.f43026f, this.f43027g);
        }
        this.f43030j = i;
        TransactionBodyAdapter.SearchItemBodyLine searchItemBodyLine2 = (TransactionBodyAdapter.SearchItemBodyLine) CollectionsKt___CollectionsKt.getOrNull(this.f43029i, i);
        if (searchItemBodyLine2 != null) {
            this.f43025e.m49863xbb91ef2c(searchItemBodyLine2.getIndexBodyLine(), searchItemBodyLine2.getIndexStartOfQuerySubString(), this.f43031k, this.f43028h, this.f43027g);
            m49846K(this.f43029i.size(), i + 1);
            ChuckerFragmentTransactionPayloadBinding chuckerFragmentTransactionPayloadBinding = null;
            m49834w(this, false, 1, null);
            ChuckerFragmentTransactionPayloadBinding chuckerFragmentTransactionPayloadBinding2 = this.f43024d;
            if (chuckerFragmentTransactionPayloadBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("payloadBinding");
            } else {
                chuckerFragmentTransactionPayloadBinding = chuckerFragmentTransactionPayloadBinding2;
            }
            chuckerFragmentTransactionPayloadBinding.payloadRecyclerView.smoothScrollToPosition(searchItemBodyLine2.getIndexBodyLine());
            this.f43030j = i;
        }
    }

    /* renamed from: G */
    public final boolean m49850G(HttpTransaction httpTransaction) {
        Long responsePayloadSize;
        Long requestPayloadSize;
        if (m49839r() == PayloadType.REQUEST) {
            if (httpTransaction != null && (requestPayloadSize = httpTransaction.getRequestPayloadSize()) != null && 0 == requestPayloadSize.longValue()) {
                return false;
            }
        } else if (m49839r() == PayloadType.RESPONSE && httpTransaction != null && (responsePayloadSize = httpTransaction.getResponsePayloadSize()) != null && 0 == responsePayloadSize.longValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: H */
    public final boolean m49849H(HttpTransaction httpTransaction) {
        int i = WhenMappings.$EnumSwitchMapping$0[m49839r().ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (httpTransaction == null || httpTransaction.isResponseBodyEncoded()) {
                    return false;
                }
                Long responsePayloadSize = httpTransaction.getResponsePayloadSize();
                if (responsePayloadSize != null && 0 == responsePayloadSize.longValue()) {
                    return false;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (httpTransaction == null || httpTransaction.isRequestBodyEncoded()) {
            return false;
        } else {
            Long requestPayloadSize = httpTransaction.getRequestPayloadSize();
            if (requestPayloadSize != null && 0 == requestPayloadSize.longValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: I */
    public final void m49848I() {
        String string;
        ChuckerFragmentTransactionPayloadBinding chuckerFragmentTransactionPayloadBinding = this.f43024d;
        if (chuckerFragmentTransactionPayloadBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payloadBinding");
            chuckerFragmentTransactionPayloadBinding = null;
        }
        TextView textView = chuckerFragmentTransactionPayloadBinding.emptyPayloadTextView;
        if (m49839r() == PayloadType.RESPONSE) {
            string = getString(R.string.chucker_response_is_empty);
        } else {
            string = getString(R.string.chucker_request_is_empty);
        }
        textView.setText(string);
        chuckerFragmentTransactionPayloadBinding.emptyStateGroup.setVisibility(0);
        chuckerFragmentTransactionPayloadBinding.payloadRecyclerView.setVisibility(8);
    }

    /* renamed from: J */
    public final void m49847J() {
        ChuckerFragmentTransactionPayloadBinding chuckerFragmentTransactionPayloadBinding = this.f43024d;
        if (chuckerFragmentTransactionPayloadBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payloadBinding");
            chuckerFragmentTransactionPayloadBinding = null;
        }
        chuckerFragmentTransactionPayloadBinding.emptyStateGroup.setVisibility(8);
        chuckerFragmentTransactionPayloadBinding.payloadRecyclerView.setVisibility(0);
    }

    /* renamed from: K */
    public final void m49846K(int i, int i2) {
        ChuckerFragmentTransactionPayloadBinding chuckerFragmentTransactionPayloadBinding = this.f43024d;
        if (chuckerFragmentTransactionPayloadBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payloadBinding");
            chuckerFragmentTransactionPayloadBinding = null;
        }
        TextView textView = chuckerFragmentTransactionPayloadBinding.searchSummary;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) (i2 + " / " + i));
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        textView.setText(spannableStringBuilder);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.f43026f = ContextCompat.getColor(context, R.color.chucker_background_span_color);
        this.f43027g = ContextCompat.getColor(context, R.color.chucker_foreground_span_color);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"NewApi"})
    public void onCreateOptionsMenu(@NotNull Menu menu, @NotNull MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        HttpTransaction value = m49838s().getTransaction().getValue();
        if (m49849H(value)) {
            MenuItem findItem = menu.findItem(R.id.search);
            findItem.setVisible(true);
            View actionView = findItem.getActionView();
            Intrinsics.checkNotNull(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
            SearchView searchView = (SearchView) actionView;
            searchView.setOnQueryTextListener(this);
            searchView.setIconifiedByDefault(true);
        }
        if (m49850G(value)) {
            MenuItem findItem2 = menu.findItem(R.id.save_body);
            findItem2.setVisible(true);
            findItem2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: TU1
                {
                    TransactionPayloadFragment.this = this;
                }

                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return TransactionPayloadFragment.m49843n(TransactionPayloadFragment.this, menuItem);
                }
            });
        }
        if (m49839r() == PayloadType.REQUEST) {
            m49838s().getDoesRequestBodyRequireEncoding().observe(getViewLifecycleOwner(), new C5983a(new TransactionPayloadFragment$onCreateOptionsMenu$2(menu)));
        } else {
            menu.findItem(R.id.encode_url).setVisible(false);
        }
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ChuckerFragmentTransactionPayloadBinding inflate = ChuckerFragmentTransactionPayloadBinding.inflate(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            inf…          false\n        )");
        this.f43024d = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payloadBinding");
            inflate = null;
        }
        ConstraintLayout root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "payloadBinding.root");
        return root;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextChange(@NotNull String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        this.f43029i.clear();
        this.f43031k = newText;
        this.f43030j = -1;
        if ((!AbstractC20204hN1.isBlank(newText)) && newText.length() > 1) {
            this.f43029i.addAll(this.f43025e.highlightQueryWithColors$com_github_ChuckerTeam_Chucker_library(newText, this.f43026f, this.f43027g));
        } else {
            this.f43025e.resetHighlight$com_github_ChuckerTeam_Chucker_library();
            m49835v(false);
        }
        AbstractC1552Vc.m65753e(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TransactionPayloadFragment$onQueryTextChange$1(this, null), 3, null);
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextSubmit(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ChuckerFragmentTransactionPayloadBinding chuckerFragmentTransactionPayloadBinding = this.f43024d;
        ChuckerFragmentTransactionPayloadBinding chuckerFragmentTransactionPayloadBinding2 = null;
        if (chuckerFragmentTransactionPayloadBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payloadBinding");
            chuckerFragmentTransactionPayloadBinding = null;
        }
        RecyclerView recyclerView = chuckerFragmentTransactionPayloadBinding.payloadRecyclerView;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(this.f43025e);
        LiveDataUtilsKt.combineLatest(m49838s().getTransaction(), m49838s().getFormatRequestBody()).observe(getViewLifecycleOwner(), new Observer() { // from class: QU1
            {
                TransactionPayloadFragment.this = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                TransactionPayloadFragment.m49842o(TransactionPayloadFragment.this, (Pair) obj);
            }
        });
        ChuckerFragmentTransactionPayloadBinding chuckerFragmentTransactionPayloadBinding3 = this.f43024d;
        if (chuckerFragmentTransactionPayloadBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payloadBinding");
            chuckerFragmentTransactionPayloadBinding3 = null;
        }
        chuckerFragmentTransactionPayloadBinding3.searchNavButton.setOnClickListener(new View.OnClickListener() { // from class: RU1
            {
                TransactionPayloadFragment.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TransactionPayloadFragment.m49845l(TransactionPayloadFragment.this, view2);
            }
        });
        ChuckerFragmentTransactionPayloadBinding chuckerFragmentTransactionPayloadBinding4 = this.f43024d;
        if (chuckerFragmentTransactionPayloadBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payloadBinding");
        } else {
            chuckerFragmentTransactionPayloadBinding2 = chuckerFragmentTransactionPayloadBinding4;
        }
        chuckerFragmentTransactionPayloadBinding2.searchNavButtonUp.setOnClickListener(new View.OnClickListener() { // from class: SU1
            {
                TransactionPayloadFragment.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TransactionPayloadFragment.m49844m(TransactionPayloadFragment.this, view2);
            }
        });
    }

    /* renamed from: q */
    public final void m49840q() {
        HttpTransaction value = m49838s().getTransaction().getValue();
        if (value != null && m49837t(m49839r(), value)) {
            Toast.makeText(getActivity(), R.string.chucker_file_not_saved_body_is_empty, 0).show();
            return;
        }
        ActivityResultLauncher activityResultLauncher = this.f43023c;
        long currentTimeMillis = System.currentTimeMillis();
        activityResultLauncher.launch(DEFAULT_FILE_PREFIX + currentTimeMillis);
    }

    /* renamed from: r */
    public final PayloadType m49839r() {
        return (PayloadType) this.f43022b.getValue();
    }

    /* renamed from: t */
    public final boolean m49837t(PayloadType payloadType, HttpTransaction httpTransaction) {
        if (payloadType == PayloadType.REQUEST && httpTransaction.getRequestBody() == null) {
            return true;
        }
        if (payloadType == PayloadType.RESPONSE && httpTransaction.getResponseBody() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final List m49836u(CharSequence charSequence) {
        List list = SequencesKt___SequencesKt.toList(StringsKt__StringsKt.lineSequence(charSequence));
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(charSequence.subSequence(i, ((String) list.get(i2)).length() + i));
            i += ((String) list.get(i2)).length() + 1;
        }
        if (arrayList.isEmpty()) {
            arrayList.add(charSequence.subSequence(0, charSequence.length()));
        }
        return arrayList;
    }

    /* renamed from: v */
    public final void m49835v(boolean z) {
        ChuckerFragmentTransactionPayloadBinding chuckerFragmentTransactionPayloadBinding = this.f43024d;
        if (chuckerFragmentTransactionPayloadBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payloadBinding");
            chuckerFragmentTransactionPayloadBinding = null;
        }
        LinearLayoutCompat makeToolbarSearchSummaryVisible$lambda$9 = chuckerFragmentTransactionPayloadBinding.rootSearchSummary;
        Intrinsics.checkNotNullExpressionValue(makeToolbarSearchSummaryVisible$lambda$9, "makeToolbarSearchSummaryVisible$lambda$9");
        if (z) {
            ViewUtilsKt.visible(makeToolbarSearchSummaryVisible$lambda$9);
        } else {
            ViewUtilsKt.gone(makeToolbarSearchSummaryVisible$lambda$9);
        }
    }

    /* renamed from: y */
    public final void m49832y(boolean z) {
        Object obj;
        int abs;
        View currentFocus;
        FragmentActivity activity = getActivity();
        IBinder iBinder = null;
        if (activity != null) {
            obj = activity.getSystemService("input_method");
        } else {
            obj = null;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) obj;
        if (inputMethodManager.isAcceptingText()) {
            FragmentActivity activity2 = getActivity();
            if (activity2 != null && (currentFocus = activity2.getCurrentFocus()) != null) {
                currentFocus.clearFocus();
            }
            View view = getView();
            if (view != null) {
                iBinder = view.getWindowToken();
            }
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
        }
        if (!this.f43029i.isEmpty()) {
            if (z) {
                abs = (this.f43030j + 1) % this.f43029i.size();
            } else {
                abs = Math.abs((this.f43030j - 1) + this.f43029i.size()) % this.f43029i.size();
            }
            m49851F(abs);
        }
    }
}
