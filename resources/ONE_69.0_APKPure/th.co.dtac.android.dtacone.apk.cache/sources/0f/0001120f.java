package th.p047co.dtac.android.dtacone.app_one.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.font.OneTypefaceUtil;
import th.p047co.dtac.android.dtacone.manager.Contextor;
import th.p047co.dtac.android.dtacone.util.MultiLanguageUtil;
import th.p047co.dtac.android.dtacone.widget.DtacSaveState;

/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneRadioButton */
/* loaded from: classes7.dex */
public class OneRadioButton extends AppCompatRadioButton {
    public OneRadioButton(Context context) {
        super(context);
        OneTypefaceUtil.setTypeFace(this, Contextor.getInstance().getContext(), null);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        boolean z;
        DtacSaveState dtacSaveState = (DtacSaveState) parcelable;
        super.onRestoreInstanceState(dtacSaveState.getSuperState());
        boolean z2 = false;
        if (dtacSaveState.getIsChecked() == 1) {
            z = true;
        } else {
            z = false;
        }
        setChecked(z);
        if (dtacSaveState.getIsEnable() == 1) {
            z2 = true;
        }
        setEnabled(z2);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        DtacSaveState dtacSaveState = new DtacSaveState(super.onSaveInstanceState());
        dtacSaveState.setIsChecked(isChecked() ? 1 : 0);
        dtacSaveState.setIsEnable(isEnabled() ? 1 : 0);
        return dtacSaveState;
    }

    public OneRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        OneTypefaceUtil.setTypeFace(this, Contextor.getInstance().getContext(), attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.DtacFontTextView);
        try {
            MultiLanguageUtil.setLanguageToView(obtainStyledAttributes, this);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public OneRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        OneTypefaceUtil.setTypeFace(this, Contextor.getInstance().getContext(), attributeSet);
    }
}