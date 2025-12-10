package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ActionProvider;
import androidx.core.view.MenuItemCompat;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class SupportMenuInflater extends MenuInflater {

    /* renamed from: e */
    public static final Class[] f9172e;

    /* renamed from: f */
    public static final Class[] f9173f;

    /* renamed from: a */
    public final Object[] f9174a;

    /* renamed from: b */
    public final Object[] f9175b;

    /* renamed from: c */
    public Context f9176c;

    /* renamed from: d */
    public Object f9177d;

    /* renamed from: androidx.appcompat.view.SupportMenuInflater$a */
    /* loaded from: classes.dex */
    public static class MenuItem$OnMenuItemClickListenerC2138a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        public static final Class[] f9178c = {MenuItem.class};

        /* renamed from: a */
        public Object f9179a;

        /* renamed from: b */
        public Method f9180b;

        public MenuItem$OnMenuItemClickListenerC2138a(Object obj, String str) {
            this.f9179a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f9180b = cls.getMethod(str, f9178c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f9180b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f9180b.invoke(this.f9179a, menuItem)).booleanValue();
                }
                this.f9180b.invoke(this.f9179a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.SupportMenuInflater$b */
    /* loaded from: classes.dex */
    public class C2139b {

        /* renamed from: A */
        public ActionProvider f9181A;

        /* renamed from: B */
        public CharSequence f9182B;

        /* renamed from: C */
        public CharSequence f9183C;

        /* renamed from: D */
        public ColorStateList f9184D = null;

        /* renamed from: E */
        public PorterDuff.Mode f9185E = null;

        /* renamed from: a */
        public Menu f9187a;

        /* renamed from: b */
        public int f9188b;

        /* renamed from: c */
        public int f9189c;

        /* renamed from: d */
        public int f9190d;

        /* renamed from: e */
        public int f9191e;

        /* renamed from: f */
        public boolean f9192f;

        /* renamed from: g */
        public boolean f9193g;

        /* renamed from: h */
        public boolean f9194h;

        /* renamed from: i */
        public int f9195i;

        /* renamed from: j */
        public int f9196j;

        /* renamed from: k */
        public CharSequence f9197k;

        /* renamed from: l */
        public CharSequence f9198l;

        /* renamed from: m */
        public int f9199m;

        /* renamed from: n */
        public char f9200n;

        /* renamed from: o */
        public int f9201o;

        /* renamed from: p */
        public char f9202p;

        /* renamed from: q */
        public int f9203q;

        /* renamed from: r */
        public int f9204r;

        /* renamed from: s */
        public boolean f9205s;

        /* renamed from: t */
        public boolean f9206t;

        /* renamed from: u */
        public boolean f9207u;

        /* renamed from: v */
        public int f9208v;

        /* renamed from: w */
        public int f9209w;

        /* renamed from: x */
        public String f9210x;

        /* renamed from: y */
        public String f9211y;

        /* renamed from: z */
        public String f9212z;

        public C2139b(Menu menu) {
            this.f9187a = menu;
            m64475h();
        }

        /* renamed from: a */
        public void m64482a() {
            this.f9194h = true;
            m64474i(this.f9187a.add(this.f9188b, this.f9195i, this.f9196j, this.f9197k));
        }

        /* renamed from: b */
        public SubMenu m64481b() {
            this.f9194h = true;
            SubMenu addSubMenu = this.f9187a.addSubMenu(this.f9188b, this.f9195i, this.f9196j, this.f9197k);
            m64474i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: c */
        public final char m64480c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* renamed from: d */
        public boolean m64479d() {
            return this.f9194h;
        }

        /* renamed from: e */
        public final Object m64478e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, SupportMenuInflater.this.f9176c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* renamed from: f */
        public void m64477f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = SupportMenuInflater.this.f9176c.obtainStyledAttributes(attributeSet, R.styleable.MenuGroup);
            this.f9188b = obtainStyledAttributes.getResourceId(R.styleable.MenuGroup_android_id, 0);
            this.f9189c = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_menuCategory, 0);
            this.f9190d = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_orderInCategory, 0);
            this.f9191e = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_checkableBehavior, 0);
            this.f9192f = obtainStyledAttributes.getBoolean(R.styleable.MenuGroup_android_visible, true);
            this.f9193g = obtainStyledAttributes.getBoolean(R.styleable.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: g */
        public void m64476g(AttributeSet attributeSet) {
            boolean z;
            TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(SupportMenuInflater.this.f9176c, attributeSet, R.styleable.MenuItem);
            this.f9195i = obtainStyledAttributes.getResourceId(R.styleable.MenuItem_android_id, 0);
            this.f9196j = (obtainStyledAttributes.getInt(R.styleable.MenuItem_android_menuCategory, this.f9189c) & SupportMenu.CATEGORY_MASK) | (obtainStyledAttributes.getInt(R.styleable.MenuItem_android_orderInCategory, this.f9190d) & 65535);
            this.f9197k = obtainStyledAttributes.getText(R.styleable.MenuItem_android_title);
            this.f9198l = obtainStyledAttributes.getText(R.styleable.MenuItem_android_titleCondensed);
            this.f9199m = obtainStyledAttributes.getResourceId(R.styleable.MenuItem_android_icon, 0);
            this.f9200n = m64480c(obtainStyledAttributes.getString(R.styleable.MenuItem_android_alphabeticShortcut));
            this.f9201o = obtainStyledAttributes.getInt(R.styleable.MenuItem_alphabeticModifiers, 4096);
            this.f9202p = m64480c(obtainStyledAttributes.getString(R.styleable.MenuItem_android_numericShortcut));
            this.f9203q = obtainStyledAttributes.getInt(R.styleable.MenuItem_numericModifiers, 4096);
            if (obtainStyledAttributes.hasValue(R.styleable.MenuItem_android_checkable)) {
                this.f9204r = obtainStyledAttributes.getBoolean(R.styleable.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.f9204r = this.f9191e;
            }
            this.f9205s = obtainStyledAttributes.getBoolean(R.styleable.MenuItem_android_checked, false);
            this.f9206t = obtainStyledAttributes.getBoolean(R.styleable.MenuItem_android_visible, this.f9192f);
            this.f9207u = obtainStyledAttributes.getBoolean(R.styleable.MenuItem_android_enabled, this.f9193g);
            this.f9208v = obtainStyledAttributes.getInt(R.styleable.MenuItem_showAsAction, -1);
            this.f9212z = obtainStyledAttributes.getString(R.styleable.MenuItem_android_onClick);
            this.f9209w = obtainStyledAttributes.getResourceId(R.styleable.MenuItem_actionLayout, 0);
            this.f9210x = obtainStyledAttributes.getString(R.styleable.MenuItem_actionViewClass);
            String string = obtainStyledAttributes.getString(R.styleable.MenuItem_actionProviderClass);
            this.f9211y = string;
            if (string != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.f9209w == 0 && this.f9210x == null) {
                this.f9181A = (ActionProvider) m64478e(string, SupportMenuInflater.f9173f, SupportMenuInflater.this.f9175b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f9181A = null;
            }
            this.f9182B = obtainStyledAttributes.getText(R.styleable.MenuItem_contentDescription);
            this.f9183C = obtainStyledAttributes.getText(R.styleable.MenuItem_tooltipText);
            if (obtainStyledAttributes.hasValue(R.styleable.MenuItem_iconTintMode)) {
                this.f9185E = DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(R.styleable.MenuItem_iconTintMode, -1), this.f9185E);
            } else {
                this.f9185E = null;
            }
            if (obtainStyledAttributes.hasValue(R.styleable.MenuItem_iconTint)) {
                this.f9184D = obtainStyledAttributes.getColorStateList(R.styleable.MenuItem_iconTint);
            } else {
                this.f9184D = null;
            }
            obtainStyledAttributes.recycle();
            this.f9194h = false;
        }

        /* renamed from: h */
        public void m64475h() {
            this.f9188b = 0;
            this.f9189c = 0;
            this.f9190d = 0;
            this.f9191e = 0;
            this.f9192f = true;
            this.f9193g = true;
        }

        /* renamed from: i */
        public final void m64474i(MenuItem menuItem) {
            boolean z;
            MenuItem enabled = menuItem.setChecked(this.f9205s).setVisible(this.f9206t).setEnabled(this.f9207u);
            boolean z2 = false;
            if (this.f9204r >= 1) {
                z = true;
            } else {
                z = false;
            }
            enabled.setCheckable(z).setTitleCondensed(this.f9198l).setIcon(this.f9199m);
            int i = this.f9208v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f9212z != null) {
                if (!SupportMenuInflater.this.f9176c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new MenuItem$OnMenuItemClickListenerC2138a(SupportMenuInflater.this.m64484b(), this.f9212z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f9204r >= 2) {
                if (menuItem instanceof MenuItemImpl) {
                    ((MenuItemImpl) menuItem).setExclusiveCheckable(true);
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    ((MenuItemWrapperICS) menuItem).setExclusiveCheckable(true);
                }
            }
            String str = this.f9210x;
            if (str != null) {
                menuItem.setActionView((View) m64478e(str, SupportMenuInflater.f9172e, SupportMenuInflater.this.f9174a));
                z2 = true;
            }
            int i2 = this.f9209w;
            if (i2 > 0) {
                if (!z2) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            ActionProvider actionProvider = this.f9181A;
            if (actionProvider != null) {
                MenuItemCompat.setActionProvider(menuItem, actionProvider);
            }
            MenuItemCompat.setContentDescription(menuItem, this.f9182B);
            MenuItemCompat.setTooltipText(menuItem, this.f9183C);
            MenuItemCompat.setAlphabeticShortcut(menuItem, this.f9200n, this.f9201o);
            MenuItemCompat.setNumericShortcut(menuItem, this.f9202p, this.f9203q);
            PorterDuff.Mode mode = this.f9185E;
            if (mode != null) {
                MenuItemCompat.setIconTintMode(menuItem, mode);
            }
            ColorStateList colorStateList = this.f9184D;
            if (colorStateList != null) {
                MenuItemCompat.setIconTintList(menuItem, colorStateList);
            }
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f9172e = clsArr;
        f9173f = clsArr;
    }

    public SupportMenuInflater(Context context) {
        super(context);
        this.f9176c = context;
        Object[] objArr = {context};
        this.f9174a = objArr;
        this.f9175b = objArr;
    }

    /* renamed from: a */
    public final Object m64485a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            return m64485a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* renamed from: b */
    public Object m64484b() {
        if (this.f9177d == null) {
            this.f9177d = m64485a(this.f9176c);
        }
        return this.f9177d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
        r8 = null;
        r6 = false;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r6 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (r15 == 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r15 == 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (r15 == 3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r7 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r15.equals(r8) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        r8 = null;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
        if (r15.equals("group") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
        r0.m64475h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
        if (r0.m64479d() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
        r15 = r0.f9181A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:
        if (r15.hasSubMenu() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
        r0.m64481b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
        r0.m64482a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
        if (r15.equals("menu") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008f, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0091, code lost:
        if (r7 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0094, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009c, code lost:
        if (r15.equals("group") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009e, code lost:
        r0.m64477f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a6, code lost:
        if (r15.equals("item") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a8, code lost:
        r0.m64476g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b0, code lost:
        if (r15.equals("menu") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b2, code lost:
        m64483c(r13, r14, r0.m64481b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ba, code lost:
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bc, code lost:
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c8, code lost:
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c9, code lost:
        return;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m64483c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) {
        /*
            r12 = this;
            androidx.appcompat.view.SupportMenuInflater$b r0 = new androidx.appcompat.view.SupportMenuInflater$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L36
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1f
            int r15 = r13.next()
            goto L3c
        L1f:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L36:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3c:
            r4 = 0
            r5 = 0
            r8 = r5
            r6 = 0
            r7 = 0
        L41:
            if (r6 != 0) goto Lc9
            if (r15 == r3) goto Lc1
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L91
            r11 = 3
            if (r15 == r11) goto L52
            goto Lbc
        L52:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L61
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L61
            r8 = r5
            r7 = 0
            goto Lbc
        L61:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L6b
            r0.m64475h()
            goto Lbc
        L6b:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L89
            boolean r15 = r0.m64479d()
            if (r15 != 0) goto Lbc
            androidx.core.view.ActionProvider r15 = r0.f9181A
            if (r15 == 0) goto L85
            boolean r15 = r15.hasSubMenu()
            if (r15 == 0) goto L85
            r0.m64481b()
            goto Lbc
        L85:
            r0.m64482a()
            goto Lbc
        L89:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lbc
            r6 = 1
            goto Lbc
        L91:
            if (r7 == 0) goto L94
            goto Lbc
        L94:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto La2
            r0.m64477f(r14)
            goto Lbc
        La2:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto Lac
            r0.m64476g(r14)
            goto Lbc
        Lac:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lba
            android.view.SubMenu r15 = r0.m64481b()
            r12.m64483c(r13, r14, r15)
            goto Lbc
        Lba:
            r8 = r15
            r7 = 1
        Lbc:
            int r15 = r13.next()
            goto L41
        Lc1:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.SupportMenuInflater.m64483c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    @Override // android.view.MenuInflater
    public void inflate(@LayoutRes int i, Menu menu) {
        if (!(menu instanceof SupportMenu)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f9176c.getResources().getLayout(i);
                    m64483c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (XmlPullParserException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
