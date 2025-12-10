package co.omise.android.p009ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import co.omise.android.CardNumber;
import co.omise.android.models.CardBrand;
import co.omise.android.p009ui.InputValidationException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, m28850d2 = {"Lco/omise/android/ui/CreditCardEditText;", "Lco/omise/android/ui/OmiseEditText;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cardBrand", "Lco/omise/android/models/CardBrand;", "getCardBrand", "()Lco/omise/android/models/CardBrand;", "cardBrandImage", "Landroid/graphics/Bitmap;", "cardBrandImagePaint", "Landroid/graphics/Paint;", "cardNumber", "", "getCardNumber", "()Ljava/lang/String;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "updateCardBrandImage", "validate", "Companion", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.CreditCardEditText */
/* loaded from: classes3.dex */
public final class CreditCardEditText extends OmiseEditText {
    private static final int CARD_NUMBER_WITH_SPACE_LENGTH = 19;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String SEPARATOR = " ";
    @NotNull
    public Map<Integer, View> _$_findViewCache;
    @Nullable
    private Bitmap cardBrandImage;
    @Nullable
    private Paint cardBrandImagePaint;

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28850d2 = {"Lco/omise/android/ui/CreditCardEditText$Companion;", "", "()V", "CARD_NUMBER_WITH_SPACE_LENGTH", "", "SEPARATOR", "", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.CreditCardEditText$Companion */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditCardEditText(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(19)});
        setInputType(3);
        addTextChangedListener(new TextWatcher() { // from class: co.omise.android.ui.CreditCardEditText.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@NotNull Editable e) {
                Intrinsics.checkNotNullParameter(e, "e");
                if (e.length() == 0 || e.length() % 5 != 0) {
                    return;
                }
                char charAt = e.charAt(e.length() - 1);
                if (Character.isDigit(charAt)) {
                    e.insert(e.length() - 1, " ");
                } else if (charAt == ' ') {
                    e.delete(e.length() - 1, e.length());
                }
                CreditCardEditText.this.updateCardBrandImage();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
                Intrinsics.checkNotNullParameter(charSequence, "charSequence");
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
                Intrinsics.checkNotNullParameter(charSequence, "charSequence");
            }
        });
        this.cardBrandImagePaint = new Paint(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCardBrandImage() {
        CardBrand brand;
        String valueOf = String.valueOf(getText());
        if (valueOf.length() > 6 && (brand = CardNumber.brand(valueOf)) != null && brand.getLogoResourceId() > -1) {
            this.cardBrandImage = BitmapFactory.decodeResource(getResources(), brand.getLogoResourceId());
        } else {
            this.cardBrandImage = null;
        }
    }

    @Override // co.omise.android.p009ui.OmiseEditText
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // co.omise.android.p009ui.OmiseEditText
    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view == null) {
            View findViewById = findViewById(i);
            if (findViewById != null) {
                map.put(Integer.valueOf(i), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Nullable
    public final CardBrand getCardBrand() {
        return CardNumber.brand(getCardNumber());
    }

    @NotNull
    public final String getCardNumber() {
        return AbstractC20204hN1.replace$default(StringsKt__StringsKt.trim(String.valueOf(getText())).toString(), " ", "", false, 4, (Object) null);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Bitmap bitmap = this.cardBrandImage;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (getWidth() - bitmap.getWidth()) - getPaddingRight(), (getHeight() - bitmap.getHeight()) / 2.0f, this.cardBrandImagePaint);
        }
    }

    @Override // co.omise.android.p009ui.OmiseEditText
    public void validate() {
        super.validate();
        CardBrand cardBrand = getCardBrand();
        if (cardBrand != null) {
            if (CardNumber.luhn(getCardNumber()) && cardBrand.valid(getCardNumber())) {
                return;
            }
            throw InputValidationException.InvalidInputException.INSTANCE;
        }
        throw InputValidationException.InvalidInputException.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditCardEditText(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this._$_findViewCache = new LinkedHashMap();
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(19)});
        setInputType(3);
        addTextChangedListener(new TextWatcher() { // from class: co.omise.android.ui.CreditCardEditText.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@NotNull Editable e) {
                Intrinsics.checkNotNullParameter(e, "e");
                if (e.length() == 0 || e.length() % 5 != 0) {
                    return;
                }
                char charAt = e.charAt(e.length() - 1);
                if (Character.isDigit(charAt)) {
                    e.insert(e.length() - 1, " ");
                } else if (charAt == ' ') {
                    e.delete(e.length() - 1, e.length());
                }
                CreditCardEditText.this.updateCardBrandImage();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
                Intrinsics.checkNotNullParameter(charSequence, "charSequence");
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
                Intrinsics.checkNotNullParameter(charSequence, "charSequence");
            }
        });
        this.cardBrandImagePaint = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditCardEditText(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this._$_findViewCache = new LinkedHashMap();
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(19)});
        setInputType(3);
        addTextChangedListener(new TextWatcher() { // from class: co.omise.android.ui.CreditCardEditText.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@NotNull Editable e) {
                Intrinsics.checkNotNullParameter(e, "e");
                if (e.length() == 0 || e.length() % 5 != 0) {
                    return;
                }
                char charAt = e.charAt(e.length() - 1);
                if (Character.isDigit(charAt)) {
                    e.insert(e.length() - 1, " ");
                } else if (charAt == ' ') {
                    e.delete(e.length() - 1, e.length());
                }
                CreditCardEditText.this.updateCardBrandImage();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@NotNull CharSequence charSequence, int i2, int i22, int i3) {
                Intrinsics.checkNotNullParameter(charSequence, "charSequence");
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@NotNull CharSequence charSequence, int i2, int i22, int i3) {
                Intrinsics.checkNotNullParameter(charSequence, "charSequence");
            }
        });
        this.cardBrandImagePaint = new Paint(1);
    }
}
