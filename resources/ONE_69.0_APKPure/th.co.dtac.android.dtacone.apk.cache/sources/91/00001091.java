package p000;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.widget.SearchView;
import androidx.core.content.ContextCompat;
import androidx.cursoradapter.widget.ResourceCursorAdapter;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: RP1 */
/* loaded from: classes.dex */
public class RP1 extends ResourceCursorAdapter implements View.OnClickListener {

    /* renamed from: d */
    public final SearchView f5503d;

    /* renamed from: e */
    public final SearchableInfo f5504e;

    /* renamed from: f */
    public final Context f5505f;

    /* renamed from: g */
    public final WeakHashMap f5506g;

    /* renamed from: h */
    public final int f5507h;

    /* renamed from: i */
    public boolean f5508i;

    /* renamed from: j */
    public int f5509j;

    /* renamed from: k */
    public ColorStateList f5510k;

    /* renamed from: l */
    public int f5511l;

    /* renamed from: m */
    public int f5512m;

    /* renamed from: n */
    public int f5513n;

    /* renamed from: o */
    public int f5514o;

    /* renamed from: p */
    public int f5515p;

    /* renamed from: q */
    public int f5516q;

    /* renamed from: RP1$a */
    /* loaded from: classes.dex */
    public static final class C1226a {

        /* renamed from: a */
        public final TextView f5517a;

        /* renamed from: b */
        public final TextView f5518b;

        /* renamed from: c */
        public final ImageView f5519c;

        /* renamed from: d */
        public final ImageView f5520d;

        /* renamed from: e */
        public final ImageView f5521e;

        public C1226a(View view) {
            this.f5517a = (TextView) view.findViewById(16908308);
            this.f5518b = (TextView) view.findViewById(16908309);
            this.f5519c = (ImageView) view.findViewById(16908295);
            this.f5520d = (ImageView) view.findViewById(16908296);
            this.f5521e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    public RP1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f5508i = false;
        this.f5509j = 1;
        this.f5511l = -1;
        this.f5512m = -1;
        this.f5513n = -1;
        this.f5514o = -1;
        this.f5515p = -1;
        this.f5516q = -1;
        this.f5503d = searchView;
        this.f5504e = searchableInfo;
        this.f5507h = searchView.getSuggestionCommitIconResId();
        this.f5505f = context;
        this.f5506g = weakHashMap;
    }

    /* renamed from: f */
    public static String m66653f(Cursor cursor, String str) {
        return m66645n(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: n */
    public static String m66645n(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final Drawable m66657b(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f5506g.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public void bindView(View view, Context context, Cursor cursor) {
        int i;
        CharSequence m66645n;
        C1226a c1226a = (C1226a) view.getTag();
        int i2 = this.f5516q;
        if (i2 != -1) {
            i = cursor.getInt(i2);
        } else {
            i = 0;
        }
        if (c1226a.f5517a != null) {
            m66642q(c1226a.f5517a, m66645n(cursor, this.f5511l));
        }
        if (c1226a.f5518b != null) {
            String m66645n2 = m66645n(cursor, this.f5513n);
            if (m66645n2 != null) {
                m66645n = m66656c(m66645n2);
            } else {
                m66645n = m66645n(cursor, this.f5512m);
            }
            if (TextUtils.isEmpty(m66645n)) {
                TextView textView = c1226a.f5517a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    c1226a.f5517a.setMaxLines(2);
                }
            } else {
                TextView textView2 = c1226a.f5517a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    c1226a.f5517a.setMaxLines(1);
                }
            }
            m66642q(c1226a.f5518b, m66645n);
        }
        ImageView imageView = c1226a.f5519c;
        if (imageView != null) {
            m66643p(imageView, m66648k(cursor), 4);
        }
        ImageView imageView2 = c1226a.f5520d;
        if (imageView2 != null) {
            m66643p(imageView2, m66647l(cursor), 8);
        }
        int i3 = this.f5509j;
        if (i3 != 2 && (i3 != 1 || (i & 1) == 0)) {
            c1226a.f5521e.setVisibility(8);
            return;
        }
        c1226a.f5521e.setVisibility(0);
        c1226a.f5521e.setTag(c1226a.f5517a.getText());
        c1226a.f5521e.setOnClickListener(this);
    }

    /* renamed from: c */
    public final CharSequence m66656c(CharSequence charSequence) {
        if (this.f5510k == null) {
            TypedValue typedValue = new TypedValue();
            this.f5505f.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
            this.f5510k = this.f5505f.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f5510k, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.C4223a.InterfaceC4224a
    public void changeCursor(Cursor cursor) {
        if (this.f5508i) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.changeCursor(cursor);
            if (cursor != null) {
                this.f5511l = cursor.getColumnIndex("suggest_text_1");
                this.f5512m = cursor.getColumnIndex("suggest_text_2");
                this.f5513n = cursor.getColumnIndex("suggest_text_2_url");
                this.f5514o = cursor.getColumnIndex("suggest_icon_1");
                this.f5515p = cursor.getColumnIndex("suggest_icon_2");
                this.f5516q = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.C4223a.InterfaceC4224a
    public CharSequence convertToString(Cursor cursor) {
        String m66653f;
        String m66653f2;
        if (cursor == null) {
            return null;
        }
        String m66653f3 = m66653f(cursor, "suggest_intent_query");
        if (m66653f3 != null) {
            return m66653f3;
        }
        if (this.f5504e.shouldRewriteQueryFromData() && (m66653f2 = m66653f(cursor, "suggest_intent_data")) != null) {
            return m66653f2;
        }
        if (!this.f5504e.shouldRewriteQueryFromText() || (m66653f = m66653f(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return m66653f;
    }

    /* renamed from: d */
    public final Drawable m66655d(ComponentName componentName) {
        PackageManager packageManager = this.f5505f.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable == null) {
                Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
                return null;
            }
            return drawable;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("SuggestionsAdapter", e.toString());
            return null;
        }
    }

    /* renamed from: e */
    public final Drawable m66654e(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f5506g.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = (Drawable.ConstantState) this.f5506g.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f5505f.getResources());
        }
        Drawable m66655d = m66655d(componentName);
        if (m66655d != null) {
            constantState = m66655d.getConstantState();
        }
        this.f5506g.put(flattenToShortString, constantState);
        return m66655d;
    }

    /* renamed from: g */
    public final Drawable m66652g() {
        Drawable m66654e = m66654e(this.f5504e.getSearchActivity());
        if (m66654e != null) {
            return m66654e;
        }
        return this.f5505f.getPackageManager().getDefaultActivityIcon();
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View newDropDownView = newDropDownView(this.f5505f, getCursor(), viewGroup);
            if (newDropDownView != null) {
                ((C1226a) newDropDownView.getTag()).f5517a.setText(e.toString());
            }
            return newDropDownView;
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View newView = newView(this.f5505f, getCursor(), viewGroup);
            if (newView != null) {
                ((C1226a) newView.getTag()).f5517a.setText(e.toString());
            }
            return newView;
        }
    }

    /* renamed from: h */
    public final Drawable m66651h(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m66650i(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f5505f.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                try {
                    openInputStream.close();
                } catch (IOException unused2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error closing icon stream for ");
                    sb.append(uri);
                }
                return createFromStream;
            }
            throw new FileNotFoundException("Failed to open " + uri);
        } catch (FileNotFoundException e) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e.getMessage());
        return null;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    /* renamed from: i */
    public Drawable m66650i(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f5505f.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }

    /* renamed from: j */
    public final Drawable m66649j(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f5505f.getPackageName() + RemoteSettings.FORWARD_SLASH_STRING + parseInt;
            Drawable m66657b = m66657b(str2);
            if (m66657b != null) {
                return m66657b;
            }
            Drawable drawable = ContextCompat.getDrawable(this.f5505f, parseInt);
            m66641r(str2, drawable);
            return drawable;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable m66657b2 = m66657b(str);
            if (m66657b2 != null) {
                return m66657b2;
            }
            Drawable m66651h = m66651h(Uri.parse(str));
            m66641r(str, m66651h);
            return m66651h;
        }
    }

    /* renamed from: k */
    public final Drawable m66648k(Cursor cursor) {
        int i = this.f5514o;
        if (i == -1) {
            return null;
        }
        Drawable m66649j = m66649j(cursor.getString(i));
        if (m66649j != null) {
            return m66649j;
        }
        return m66652g();
    }

    /* renamed from: l */
    public final Drawable m66647l(Cursor cursor) {
        int i = this.f5515p;
        if (i == -1) {
            return null;
        }
        return m66649j(cursor.getString(i));
    }

    /* renamed from: m */
    public Cursor m66646m(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f5505f.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // androidx.cursoradapter.widget.ResourceCursorAdapter, androidx.cursoradapter.widget.CursorAdapter
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View newView = super.newView(context, cursor, viewGroup);
        newView.setTag(new C1226a(newView));
        ((ImageView) newView.findViewById(R.id.edit_query)).setImageResource(this.f5507h);
        return newView;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m66640s(getCursor());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m66640s(getCursor());
    }

    /* renamed from: o */
    public void m66644o(int i) {
        this.f5509j = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f5503d.onQueryRefine((CharSequence) tag);
        }
    }

    /* renamed from: p */
    public final void m66643p(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: q */
    public final void m66642q(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: r */
    public final void m66641r(String str, Drawable drawable) {
        if (drawable != null) {
            this.f5506g.put(str, drawable.getConstantState());
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.C4223a.InterfaceC4224a
    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        String charSequence2;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        if (this.f5503d.getVisibility() == 0 && this.f5503d.getWindowVisibility() == 0) {
            try {
                Cursor m66646m = m66646m(this.f5504e, charSequence2, 50);
                if (m66646m != null) {
                    m66646m.getCount();
                    return m66646m;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    /* renamed from: s */
    public final void m66640s(Cursor cursor) {
        Bundle bundle;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }
}