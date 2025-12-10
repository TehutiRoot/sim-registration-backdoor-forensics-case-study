package com.chuckerteam.chucker.internal.p010ui.transaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.viewpager.widget.ViewPager;
import ch.qos.logback.core.CoreConstants;
import com.chuckerteam.chucker.R;
import com.chuckerteam.chucker.databinding.ChuckerActivityTransactionBinding;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.p010ui.BaseChuckerActivity;
import com.chuckerteam.chucker.internal.p010ui.transaction.TransactionActivity;
import com.chuckerteam.chucker.internal.support.Sharable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u00020\u000b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J>\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\"\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionActivity;", "Lcom/chuckerteam/chucker/internal/ui/BaseChuckerActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "A", "(Landroid/view/Menu;)V", "Lkotlin/Function1;", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "Lcom/chuckerteam/chucker/internal/support/Sharable;", "block", "F", "(Lkotlin/jvm/functions/Function1;)Z", "", "fileName", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", ExifInterface.LONGITUDE_EAST, "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Z", "Landroidx/viewpager/widget/ViewPager;", "viewPager", "D", "(Landroidx/viewpager/widget/ViewPager;)V", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionViewModel;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/Lazy;", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "()Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionViewModel;", "viewModel", "Lcom/chuckerteam/chucker/databinding/ChuckerActivityTransactionBinding;", OperatorName.CURVE_TO, "Lcom/chuckerteam/chucker/databinding/ChuckerActivityTransactionBinding;", "transactionBinding", "Companion", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransactionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionActivity.kt\ncom/chuckerteam/chucker/internal/ui/transaction/TransactionActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,174:1\n75#2,13:175\n*S KotlinDebug\n*F\n+ 1 TransactionActivity.kt\ncom/chuckerteam/chucker/internal/ui/transaction/TransactionActivity\n*L\n30#1:175,13\n*E\n"})
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity */
/* loaded from: classes3.dex */
public final class TransactionActivity extends BaseChuckerActivity {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: d */
    public static int f43002d;

    /* renamed from: b */
    public final Lazy f43003b = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TransactionViewModel.class), new TransactionActivity$special$$inlined$viewModels$default$2(this), new TransactionActivity$viewModel$2(this), new TransactionActivity$special$$inlined$viewModels$default$3(null, this));

    /* renamed from: c */
    public ChuckerActivityTransactionBinding f43004c;

    @Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionActivity$Companion;", "", "()V", "EXPORT_HAR_FILE_NAME", "", "EXPORT_TXT_FILE_NAME", "EXTRA_TRANSACTION_ID", "selectedTabPosition", "", "start", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "transactionId", "", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$Companion */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(@NotNull Context context, long j) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, TransactionActivity.class);
            intent.putExtra(FirebaseAnalytics.Param.TRANSACTION_ID, j);
            context.startActivity(intent);
        }

        public Companion() {
        }
    }

    /* renamed from: B */
    public static final boolean m49879B(TransactionActivity this$0, MenuItem it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.m49871y().switchUrlEncoding();
        return true;
    }

    /* renamed from: C */
    public static final void m49878C(MenuItem menuItem, Boolean encode) {
        int i;
        Intrinsics.checkNotNullExpressionValue(encode, "encode");
        if (encode.booleanValue()) {
            i = R.drawable.chucker_ic_encoded_url_white;
        } else {
            i = R.drawable.chucker_ic_decoded_url_white;
        }
        menuItem.setIcon(i);
    }

    public static final /* synthetic */ void access$setSelectedTabPosition$cp(int i) {
        f43002d = i;
    }

    /* renamed from: v */
    public static /* synthetic */ boolean m49874v(TransactionActivity transactionActivity, MenuItem menuItem) {
        return m49879B(transactionActivity, menuItem);
    }

    /* renamed from: w */
    public static /* synthetic */ void m49873w(TransactionActivity transactionActivity, String str) {
        m49870z(transactionActivity, str);
    }

    /* renamed from: x */
    public static /* synthetic */ void m49872x(MenuItem menuItem, Boolean bool) {
        m49878C(menuItem, bool);
    }

    /* renamed from: z */
    public static final void m49870z(TransactionActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ChuckerActivityTransactionBinding chuckerActivityTransactionBinding = this$0.f43004c;
        if (chuckerActivityTransactionBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("transactionBinding");
            chuckerActivityTransactionBinding = null;
        }
        chuckerActivityTransactionBinding.toolbarTitle.setText(str);
    }

    /* renamed from: A */
    public final void m49880A(Menu menu) {
        final MenuItem findItem = menu.findItem(R.id.encode_url);
        findItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: KU1
            {
                TransactionActivity.this = this;
            }

            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return TransactionActivity.m49874v(TransactionActivity.this, menuItem);
            }
        });
        m49871y().getEncodeUrl().observe(this, new Observer() { // from class: LU1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                TransactionActivity.m49872x(findItem, (Boolean) obj);
            }
        });
    }

    /* renamed from: D */
    public final void m49877D(ViewPager viewPager) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        viewPager.setAdapter(new TransactionPagerAdapter(this, supportFragmentManager));
        viewPager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() { // from class: com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$setupViewPager$1
            @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                TransactionActivity.access$setSelectedTabPosition$cp(i);
            }
        });
        viewPager.setCurrentItem(f43002d);
    }

    /* renamed from: E */
    public final boolean m49876E(String str, Function2 function2) {
        AbstractC1552Vc.m65753e(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TransactionActivity$shareTransactionAsFile$1(this, function2, str, null), 3, null);
        return true;
    }

    /* renamed from: F */
    public final boolean m49875F(Function1 function1) {
        HttpTransaction value = m49871y().getTransaction().getValue();
        if (value != null) {
            AbstractC1552Vc.m65753e(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TransactionActivity$shareTransactionAsText$1((Sharable) function1.invoke(value), this, null), 3, null);
            return true;
        }
        String string = getString(R.string.chucker_request_not_ready);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.chucker_request_not_ready)");
        BaseChuckerActivity.showToast$default(this, string, 0, 2, null);
        return true;
    }

    @Override // com.chuckerteam.chucker.internal.p010ui.BaseChuckerActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ChuckerActivityTransactionBinding inflate = ChuckerActivityTransactionBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.f43004c = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("transactionBinding");
            inflate = null;
        }
        setContentView(inflate.getRoot());
        setSupportActionBar(inflate.toolbar);
        ViewPager viewPager = inflate.viewPager;
        Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
        m49877D(viewPager);
        inflate.tabLayout.setupWithViewPager(inflate.viewPager);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        m49871y().getTransactionTitle().observe(this, new Observer() { // from class: JU1
            {
                TransactionActivity.this = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                TransactionActivity.m49873w(TransactionActivity.this, (String) obj);
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(R.menu.chucker_transaction, menu);
        m49880A(menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        if (itemId == R.id.share_text) {
            return m49875F(new TransactionActivity$onOptionsItemSelected$1(this));
        }
        if (itemId == R.id.share_curl) {
            return m49875F(TransactionActivity$onOptionsItemSelected$2.INSTANCE);
        }
        if (itemId == R.id.share_file) {
            return m49876E("transaction.txt", new TransactionActivity$onOptionsItemSelected$3(this, null));
        }
        if (itemId == R.id.share_har) {
            return m49876E("transaction.har", new TransactionActivity$onOptionsItemSelected$4(this, null));
        }
        return super.onOptionsItemSelected(item);
    }

    /* renamed from: y */
    public final TransactionViewModel m49871y() {
        return (TransactionViewModel) this.f43003b.getValue();
    }
}
