package th.p047co.dtac.android.dtacone.widget.view;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.annotation.RequiresApi;
import th.p047co.dtac.android.dtacone.widget.DtacSaveState;

/* renamed from: th.co.dtac.android.dtacone.widget.view.DtacRelativeLayout */
/* loaded from: classes9.dex */
public class DtacRelativeLayout extends RelativeLayout {
    public DtacRelativeLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        DtacSaveState dtacSaveState = (DtacSaveState) parcelable;
        super.onRestoreInstanceState(dtacSaveState.getSuperState());
        setVisibility(dtacSaveState.getVisible());
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        DtacSaveState dtacSaveState = new DtacSaveState(super.onSaveInstanceState());
        dtacSaveState.setVisible(getVisibility());
        return dtacSaveState;
    }

    public DtacRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DtacRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @RequiresApi(api = 21)
    public DtacRelativeLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}