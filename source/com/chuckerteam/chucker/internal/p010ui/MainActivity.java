package com.chuckerteam.chucker.internal.p010ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.SearchView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;
import com.chuckerteam.chucker.R;
import com.chuckerteam.chucker.databinding.ChuckerActivityMainBinding;
import com.chuckerteam.chucker.internal.data.model.DialogData;
import com.chuckerteam.chucker.internal.p010ui.MainActivity;
import com.chuckerteam.chucker.internal.p010ui.transaction.TransactionAdapter;
import com.chuckerteam.chucker.internal.support.ContextExtKt;
import com.chuckerteam.chucker.internal.support.Logger;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.material.snackbar.Snackbar;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0005\b\u0000\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0001DB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0019\u0010\u0004J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJD\u0010$\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00132(\u0010#\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 \u0012\u0006\u0012\u0004\u0018\u00010\"0\u001dH\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\u00020&2\b\b\u0001\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\"\u0010?\u001a\u0010\u0012\f\u0012\n <*\u0004\u0018\u00010\u00130\u00130;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006E"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/ui/MainActivity;", "Lcom/chuckerteam/chucker/internal/ui/BaseChuckerActivity;", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", SearchIntents.EXTRA_QUERY, "onQueryTextSubmit", "(Ljava/lang/String;)Z", "newText", "onQueryTextChange", "C", "F", "(Landroid/view/Menu;)V", "fileName", "Lkotlin/Function2;", "", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "Lkotlin/coroutines/Continuation;", "Lcom/chuckerteam/chucker/internal/support/Sharable;", "", "block", "x", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Lcom/chuckerteam/chucker/internal/data/model/DialogData;", "z", "()Lcom/chuckerteam/chucker/internal/data/model/DialogData;", "", "dialogMessage", "A", "(I)Lcom/chuckerteam/chucker/internal/data/model/DialogData;", "Lcom/chuckerteam/chucker/internal/ui/MainViewModel;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/Lazy;", "B", "()Lcom/chuckerteam/chucker/internal/ui/MainViewModel;", "viewModel", "Lcom/chuckerteam/chucker/databinding/ChuckerActivityMainBinding;", OperatorName.CURVE_TO, "Lcom/chuckerteam/chucker/databinding/ChuckerActivityMainBinding;", "mainBinding", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionAdapter;", "d", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionAdapter;", "transactionsAdapter", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "e", "Landroidx/activity/result/ActivityResultLauncher;", "permissionRequest", "", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "()Ljava/lang/CharSequence;", "applicationName", "Companion", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/chuckerteam/chucker/internal/ui/MainActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,249:1\n75#2,13:250\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/chuckerteam/chucker/internal/ui/MainActivity\n*L\n45#1:250,13\n*E\n"})
/* renamed from: com.chuckerteam.chucker.internal.ui.MainActivity */
/* loaded from: classes3.dex */
public final class MainActivity extends BaseChuckerActivity implements SearchView.OnQueryTextListener {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public final Lazy f42993b = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MainViewModel.class), new MainActivity$special$$inlined$viewModels$default$2(this), new MainActivity$special$$inlined$viewModels$default$1(this), new MainActivity$special$$inlined$viewModels$default$3(null, this));

    /* renamed from: c */
    public ChuckerActivityMainBinding f42994c;

    /* renamed from: d */
    public TransactionAdapter f42995d;

    /* renamed from: e */
    public final ActivityResultLauncher f42996e;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/ui/MainActivity$Companion;", "", "()V", "EXPORT_HAR_FILE_NAME", "", "EXPORT_TXT_FILE_NAME", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: com.chuckerteam.chucker.internal.ui.MainActivity$Companion */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* renamed from: com.chuckerteam.chucker.internal.ui.MainActivity$a */
    /* loaded from: classes3.dex */
    public static final class C5977a implements Observer, FunctionAdapter {

        /* renamed from: a */
        public final /* synthetic */ Function1 f42997a;

        public C5977a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f42997a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f42997a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f42997a.invoke(obj);
        }
    }

    public MainActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: Bn0
            {
                MainActivity.this = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MainActivity.m49884w(MainActivity.this, ((Boolean) obj).booleanValue());
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…ns info\")\n        }\n    }");
        this.f42996e = registerForActivityResult;
    }

    /* renamed from: D */
    public static final void m49888D(MainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        intent.setData(Uri.fromParts("package", this$0.getPackageName(), null));
        this$0.startActivity(intent);
    }

    /* renamed from: E */
    public static final void m49887E(MainActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z) {
            String string = this$0.getApplicationContext().getString(R.string.chucker_notifications_permission_not_granted);
            Intrinsics.checkNotNullExpressionValue(string, "applicationContext.getSt…s_permission_not_granted)");
            this$0.showToast(string, 1);
            Logger.DefaultImpls.error$default(Logger.Companion, "Notification permission denied. Can't show transactions info", null, 2, null);
        }
    }

    /* renamed from: v */
    public static /* synthetic */ void m49885v(MainActivity mainActivity, View view) {
        m49888D(mainActivity, view);
    }

    /* renamed from: w */
    public static /* synthetic */ void m49884w(MainActivity mainActivity, boolean z) {
        m49887E(mainActivity, z);
    }

    /* renamed from: A */
    public final DialogData m49891A(int i) {
        String string = getString(R.string.chucker_export);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.chucker_export)");
        String string2 = getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(dialogMessage)");
        return new DialogData(string, string2, getString(R.string.chucker_export), getString(R.string.chucker_cancel));
    }

    /* renamed from: B */
    public final MainViewModel m49890B() {
        return (MainViewModel) this.f42993b.getValue();
    }

    /* renamed from: C */
    public final void m49889C() {
        boolean shouldShowRequestPermissionRationale;
        if (ContextCompat.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") != 0) {
            shouldShowRequestPermissionRationale = shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
            if (shouldShowRequestPermissionRationale) {
                ChuckerActivityMainBinding chuckerActivityMainBinding = this.f42994c;
                if (chuckerActivityMainBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mainBinding");
                    chuckerActivityMainBinding = null;
                }
                Snackbar.make(chuckerActivityMainBinding.getRoot(), getApplicationContext().getString(R.string.chucker_notifications_permission_not_granted), 0).setAction(getApplicationContext().getString(R.string.chucker_change), new View.OnClickListener() { // from class: An0
                    {
                        MainActivity.this = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MainActivity.m49885v(MainActivity.this, view);
                    }
                }).show();
                return;
            }
            this.f42996e.launch("android.permission.POST_NOTIFICATIONS");
        }
    }

    /* renamed from: F */
    public final void m49886F(Menu menu) {
        View actionView = menu.findItem(R.id.search).getActionView();
        Intrinsics.checkNotNull(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
        SearchView searchView = (SearchView) actionView;
        searchView.setOnQueryTextListener(this);
        searchView.setIconifiedByDefault(true);
    }

    @Override // com.chuckerteam.chucker.internal.p010ui.BaseChuckerActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ChuckerActivityMainBinding inflate = ChuckerActivityMainBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.f42994c = inflate;
        this.f42995d = new TransactionAdapter(this, new MainActivity$onCreate$1(this));
        ChuckerActivityMainBinding chuckerActivityMainBinding = this.f42994c;
        TransactionAdapter transactionAdapter = null;
        if (chuckerActivityMainBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainBinding");
            chuckerActivityMainBinding = null;
        }
        setContentView(chuckerActivityMainBinding.getRoot());
        setSupportActionBar(chuckerActivityMainBinding.toolbar);
        chuckerActivityMainBinding.toolbar.setSubtitle(m49882y());
        chuckerActivityMainBinding.tutorialLink.setMovementMethod(LinkMovementMethod.getInstance());
        RecyclerView recyclerView = chuckerActivityMainBinding.transactionsRecyclerView;
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, 1));
        TransactionAdapter transactionAdapter2 = this.f42995d;
        if (transactionAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("transactionsAdapter");
        } else {
            transactionAdapter = transactionAdapter2;
        }
        recyclerView.setAdapter(transactionAdapter);
        m49890B().getTransactions().observe(this, new C5977a(new MainActivity$onCreate$3(this)));
        if (Build.VERSION.SDK_INT >= 33) {
            m49889C();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(R.menu.chucker_transactions_list, menu);
        m49886F(menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        if (itemId == R.id.clear) {
            ContextExtKt.showDialog(this, m49881z(), new MainActivity$onOptionsItemSelected$1(this), null);
            return true;
        } else if (itemId == R.id.share_text) {
            ContextExtKt.showDialog(this, m49891A(R.string.chucker_export_text_http_confirmation), new MainActivity$onOptionsItemSelected$2(this), null);
            return true;
        } else if (itemId == R.id.share_har) {
            ContextExtKt.showDialog(this, m49891A(R.string.chucker_export_har_http_confirmation), new MainActivity$onOptionsItemSelected$3(this), null);
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextChange(@NotNull String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        m49890B().updateItemsFilter(newText);
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextSubmit(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return true;
    }

    /* renamed from: x */
    public final void m49883x(String str, Function2 function2) {
        AbstractC1552Vc.m65753e(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MainActivity$exportTransactions$1(this, getApplicationContext(), function2, str, null), 3, null);
    }

    /* renamed from: y */
    public final CharSequence m49882y() {
        CharSequence loadLabel = getApplicationInfo().loadLabel(getPackageManager());
        Intrinsics.checkNotNullExpressionValue(loadLabel, "applicationInfo.loadLabel(packageManager)");
        return loadLabel;
    }

    /* renamed from: z */
    public final DialogData m49881z() {
        String string = getString(R.string.chucker_clear);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.chucker_clear)");
        String string2 = getString(R.string.chucker_clear_http_confirmation);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.chuck…_clear_http_confirmation)");
        return new DialogData(string, string2, getString(R.string.chucker_clear), getString(R.string.chucker_cancel));
    }
}
