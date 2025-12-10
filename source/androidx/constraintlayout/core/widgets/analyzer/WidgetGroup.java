package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.Chain;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import com.tom_roush.fontbox.ttf.OpenTypeScript;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes2.dex */
public class WidgetGroup {

    /* renamed from: g */
    public static int f32586g;

    /* renamed from: b */
    public int f32588b;

    /* renamed from: d */
    public int f32590d;

    /* renamed from: a */
    public ArrayList f32587a = new ArrayList();

    /* renamed from: c */
    public boolean f32589c = false;

    /* renamed from: e */
    public ArrayList f32591e = null;

    /* renamed from: f */
    public int f32592f = -1;

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.WidgetGroup$a */
    /* loaded from: classes2.dex */
    public class C3701a {

        /* renamed from: a */
        public WeakReference f32593a;

        /* renamed from: b */
        public int f32594b;

        /* renamed from: c */
        public int f32595c;

        /* renamed from: d */
        public int f32596d;

        /* renamed from: e */
        public int f32597e;

        /* renamed from: f */
        public int f32598f;

        /* renamed from: g */
        public int f32599g;

        public C3701a(ConstraintWidget constraintWidget, LinearSystem linearSystem, int i) {
            this.f32593a = new WeakReference(constraintWidget);
            this.f32594b = linearSystem.getObjectVariableValue(constraintWidget.mLeft);
            this.f32595c = linearSystem.getObjectVariableValue(constraintWidget.mTop);
            this.f32596d = linearSystem.getObjectVariableValue(constraintWidget.mRight);
            this.f32597e = linearSystem.getObjectVariableValue(constraintWidget.mBottom);
            this.f32598f = linearSystem.getObjectVariableValue(constraintWidget.mBaseline);
            this.f32599g = i;
        }

        /* renamed from: a */
        public void m58568a() {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.f32593a.get();
            if (constraintWidget != null) {
                constraintWidget.setFinalFrame(this.f32594b, this.f32595c, this.f32596d, this.f32597e, this.f32598f, this.f32599g);
            }
        }
    }

    public WidgetGroup(int i) {
        int i2 = f32586g;
        f32586g = i2 + 1;
        this.f32588b = i2;
        this.f32590d = i;
    }

    /* renamed from: a */
    public final boolean m58571a(ConstraintWidget constraintWidget) {
        return this.f32587a.contains(constraintWidget);
    }

    public boolean add(ConstraintWidget constraintWidget) {
        if (this.f32587a.contains(constraintWidget)) {
            return false;
        }
        this.f32587a.add(constraintWidget);
        return true;
    }

    public void apply() {
        if (this.f32591e == null || !this.f32589c) {
            return;
        }
        for (int i = 0; i < this.f32591e.size(); i++) {
            ((C3701a) this.f32591e.get(i)).m58568a();
        }
    }

    /* renamed from: b */
    public final String m58570b() {
        int i = this.f32590d;
        if (i == 0) {
            return "Horizontal";
        }
        if (i == 1) {
            return "Vertical";
        }
        if (i == 2) {
            return PDTableAttributeObject.SCOPE_BOTH;
        }
        return OpenTypeScript.UNKNOWN;
    }

    /* renamed from: c */
    public final int m58569c(LinearSystem linearSystem, ArrayList arrayList, int i) {
        int objectVariableValue;
        int objectVariableValue2;
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) ((ConstraintWidget) arrayList.get(0)).getParent();
        linearSystem.reset();
        constraintWidgetContainer.addToSolver(linearSystem, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((ConstraintWidget) arrayList.get(i2)).addToSolver(linearSystem, false);
        }
        if (i == 0 && constraintWidgetContainer.mHorizontalChainsSize > 0) {
            Chain.applyChainConstraints(constraintWidgetContainer, linearSystem, arrayList, 0);
        }
        if (i == 1 && constraintWidgetContainer.mVerticalChainsSize > 0) {
            Chain.applyChainConstraints(constraintWidgetContainer, linearSystem, arrayList, 1);
        }
        try {
            linearSystem.minimize();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f32591e = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f32591e.add(new C3701a((ConstraintWidget) arrayList.get(i3), linearSystem, i));
        }
        if (i == 0) {
            objectVariableValue = linearSystem.getObjectVariableValue(constraintWidgetContainer.mLeft);
            objectVariableValue2 = linearSystem.getObjectVariableValue(constraintWidgetContainer.mRight);
            linearSystem.reset();
        } else {
            objectVariableValue = linearSystem.getObjectVariableValue(constraintWidgetContainer.mTop);
            objectVariableValue2 = linearSystem.getObjectVariableValue(constraintWidgetContainer.mBottom);
            linearSystem.reset();
        }
        return objectVariableValue2 - objectVariableValue;
    }

    public void cleanup(ArrayList<WidgetGroup> arrayList) {
        int size = this.f32587a.size();
        if (this.f32592f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                WidgetGroup widgetGroup = arrayList.get(i);
                if (this.f32592f == widgetGroup.f32588b) {
                    moveTo(this.f32590d, widgetGroup);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public void clear() {
        this.f32587a.clear();
    }

    public int getId() {
        return this.f32588b;
    }

    public int getOrientation() {
        return this.f32590d;
    }

    public boolean intersectWith(WidgetGroup widgetGroup) {
        for (int i = 0; i < this.f32587a.size(); i++) {
            if (widgetGroup.m58571a((ConstraintWidget) this.f32587a.get(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean isAuthoritative() {
        return this.f32589c;
    }

    public int measureWrap(LinearSystem linearSystem, int i) {
        if (this.f32587a.size() == 0) {
            return 0;
        }
        return m58569c(linearSystem, this.f32587a, i);
    }

    public void moveTo(int i, WidgetGroup widgetGroup) {
        Iterator it = this.f32587a.iterator();
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            widgetGroup.add(constraintWidget);
            if (i == 0) {
                constraintWidget.horizontalGroup = widgetGroup.getId();
            } else {
                constraintWidget.verticalGroup = widgetGroup.getId();
            }
        }
        this.f32592f = widgetGroup.f32588b;
    }

    public void setAuthoritative(boolean z) {
        this.f32589c = z;
    }

    public void setOrientation(int i) {
        this.f32590d = i;
    }

    public int size() {
        return this.f32587a.size();
    }

    public String toString() {
        Iterator it;
        String str = m58570b() + " [" + this.f32588b + "] <";
        while (this.f32587a.iterator().hasNext()) {
            str = str + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + ((ConstraintWidget) it.next()).getDebugName();
        }
        return str + " >";
    }
}
