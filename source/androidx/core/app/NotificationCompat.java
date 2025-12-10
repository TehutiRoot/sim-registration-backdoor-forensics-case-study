package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.R;
import androidx.core.app.Person;
import androidx.core.content.ContextCompat;
import androidx.core.content.LocusIdCompat;
import androidx.core.content.p004pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.GravityCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.bouncycastle.i18n.TextBundle;

/* loaded from: classes2.dex */
public class NotificationCompat {
    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final String CATEGORY_ALARM = "alarm";
    public static final String CATEGORY_CALL = "call";
    public static final String CATEGORY_EMAIL = "email";
    public static final String CATEGORY_ERROR = "err";
    public static final String CATEGORY_EVENT = "event";
    public static final String CATEGORY_LOCATION_SHARING = "location_sharing";
    public static final String CATEGORY_MESSAGE = "msg";
    public static final String CATEGORY_MISSED_CALL = "missed_call";
    public static final String CATEGORY_NAVIGATION = "navigation";
    public static final String CATEGORY_PROGRESS = "progress";
    public static final String CATEGORY_PROMO = "promo";
    public static final String CATEGORY_RECOMMENDATION = "recommendation";
    public static final String CATEGORY_REMINDER = "reminder";
    public static final String CATEGORY_SERVICE = "service";
    public static final String CATEGORY_SOCIAL = "social";
    public static final String CATEGORY_STATUS = "status";
    public static final String CATEGORY_STOPWATCH = "stopwatch";
    public static final String CATEGORY_SYSTEM = "sys";
    public static final String CATEGORY_TRANSPORT = "transport";
    public static final String CATEGORY_WORKOUT = "workout";
    @ColorInt
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_ANSWER_COLOR = "android.answerColor";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_ANSWER_INTENT = "android.answerIntent";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_BIG_TEXT = "android.bigText";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_IS_VIDEO = "android.callIsVideo";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_PERSON = "android.callPerson";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_PERSON_COMPAT = "android.callPersonCompat";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_TYPE = "android.callType";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_COLORIZED = "android.colorized";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_DECLINE_COLOR = "android.declineColor";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_DECLINE_INTENT = "android.declineIntent";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HANG_UP_INTENT = "android.hangUpIntent";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_INFO_TEXT = "android.infoText";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_LARGE_ICON = "android.largeIcon";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MESSAGES = "android.messages";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";
    @SuppressLint({"ActionValue"})
    @Deprecated
    public static final String EXTRA_PEOPLE = "android.people";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PEOPLE_LIST = "android.people.list";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE = "android.picture";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE_ICON = "android.pictureIcon";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS = "android.progress";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_WHEN = "android.showWhen";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SMALL_ICON = "android.icon";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SUB_TEXT = "android.subText";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEMPLATE = "android.template";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEXT = "android.text";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEXT_LINES = "android.textLines";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TITLE = "android.title";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TITLE_BIG = "android.title.big";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_ICON = "android.verificationIcon";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_ICON_COMPAT = "android.verificationIconCompat";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_TEXT = "android.verificationText";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_BUBBLE = 4096;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;
    @Deprecated
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int FOREGROUND_SERVICE_DEFAULT = 0;
    public static final int FOREGROUND_SERVICE_DEFERRED = 2;
    public static final int FOREGROUND_SERVICE_IMMEDIATE = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final String GROUP_KEY_SILENT = "silent";
    @SuppressLint({"ActionValue"})
    public static final String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int MAX_ACTION_BUTTONS = 3;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    /* loaded from: classes2.dex */
    public static class Action {
        public static final int SEMANTIC_ACTION_ARCHIVE = 5;
        public static final int SEMANTIC_ACTION_CALL = 10;
        public static final int SEMANTIC_ACTION_DELETE = 4;
        public static final int SEMANTIC_ACTION_MARK_AS_READ = 2;
        public static final int SEMANTIC_ACTION_MARK_AS_UNREAD = 3;
        public static final int SEMANTIC_ACTION_MUTE = 6;
        public static final int SEMANTIC_ACTION_NONE = 0;
        public static final int SEMANTIC_ACTION_REPLY = 1;
        public static final int SEMANTIC_ACTION_THUMBS_DOWN = 9;
        public static final int SEMANTIC_ACTION_THUMBS_UP = 8;
        public static final int SEMANTIC_ACTION_UNMUTE = 7;

        /* renamed from: a */
        public final Bundle f33513a;
        @Nullable
        public PendingIntent actionIntent;

        /* renamed from: b */
        public IconCompat f33514b;

        /* renamed from: c */
        public final RemoteInput[] f33515c;

        /* renamed from: d */
        public final RemoteInput[] f33516d;

        /* renamed from: e */
        public boolean f33517e;

        /* renamed from: f */
        public boolean f33518f;

        /* renamed from: g */
        public final int f33519g;

        /* renamed from: h */
        public final boolean f33520h;

        /* renamed from: i */
        public boolean f33521i;
        @Deprecated
        public int icon;
        public CharSequence title;

        /* loaded from: classes2.dex */
        public static final class Builder {

            /* renamed from: a */
            public final IconCompat f33522a;

            /* renamed from: b */
            public final CharSequence f33523b;

            /* renamed from: c */
            public final PendingIntent f33524c;

            /* renamed from: d */
            public boolean f33525d;

            /* renamed from: e */
            public final Bundle f33526e;

            /* renamed from: f */
            public ArrayList f33527f;

            /* renamed from: g */
            public int f33528g;

            /* renamed from: h */
            public boolean f33529h;

            /* renamed from: i */
            public boolean f33530i;

            /* renamed from: j */
            public boolean f33531j;

            /* renamed from: androidx.core.app.NotificationCompat$Action$Builder$a */
            /* loaded from: classes2.dex */
            public static class C3858a {
                @DoNotInline
                /* renamed from: a */
                public static android.app.RemoteInput[] m57855a(Notification.Action action) {
                    return action.getRemoteInputs();
                }
            }

            /* renamed from: androidx.core.app.NotificationCompat$Action$Builder$b */
            /* loaded from: classes2.dex */
            public static class C3859b {
                @DoNotInline
                /* renamed from: a */
                public static Icon m57854a(Notification.Action action) {
                    return action.getIcon();
                }
            }

            /* renamed from: androidx.core.app.NotificationCompat$Action$Builder$c */
            /* loaded from: classes2.dex */
            public static class C3860c {
                @DoNotInline
                /* renamed from: a */
                public static boolean m57853a(Notification.Action action) {
                    return action.getAllowGeneratedReplies();
                }
            }

            /* renamed from: androidx.core.app.NotificationCompat$Action$Builder$d */
            /* loaded from: classes2.dex */
            public static class C3861d {
                @DoNotInline
                /* renamed from: a */
                public static int m57852a(Notification.Action action) {
                    return action.getSemanticAction();
                }
            }

            /* renamed from: androidx.core.app.NotificationCompat$Action$Builder$e */
            /* loaded from: classes2.dex */
            public static class C3862e {
                @DoNotInline
                /* renamed from: a */
                public static boolean m57851a(Notification.Action action) {
                    return action.isContextual();
                }
            }

            /* renamed from: androidx.core.app.NotificationCompat$Action$Builder$f */
            /* loaded from: classes2.dex */
            public static class C3863f {
                @DoNotInline
                /* renamed from: a */
                public static boolean m57850a(Notification.Action action) {
                    return action.isAuthenticationRequired();
                }
            }

            public Builder(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            @NonNull
            @RequiresApi(19)
            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
            public static Builder fromAndroidAction(@NonNull Notification.Action action) {
                Builder builder;
                if (Build.VERSION.SDK_INT >= 23 && C3859b.m57854a(action) != null) {
                    builder = new Builder(IconCompat.createFromIconOrNullIfZeroResId(C3859b.m57854a(action)), action.title, action.actionIntent);
                } else {
                    builder = new Builder(action.icon, action.title, action.actionIntent);
                }
                android.app.RemoteInput[] m57855a = C3858a.m57855a(action);
                if (m57855a != null && m57855a.length != 0) {
                    for (android.app.RemoteInput remoteInput : m57855a) {
                        builder.addRemoteInput(RemoteInput.m57645c(remoteInput));
                    }
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    builder.f33525d = C3860c.m57853a(action);
                }
                if (i >= 28) {
                    builder.setSemanticAction(C3861d.m57852a(action));
                }
                if (i >= 29) {
                    builder.setContextual(C3862e.m57851a(action));
                }
                if (i >= 31) {
                    builder.setAuthenticationRequired(C3863f.m57850a(action));
                }
                return builder;
            }

            /* renamed from: a */
            public final void m57856a() {
                if (!this.f33530i || this.f33524c != null) {
                    return;
                }
                throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
            }

            @NonNull
            public Builder addExtras(@Nullable Bundle bundle) {
                if (bundle != null) {
                    this.f33526e.putAll(bundle);
                }
                return this;
            }

            @NonNull
            public Builder addRemoteInput(@Nullable RemoteInput remoteInput) {
                if (this.f33527f == null) {
                    this.f33527f = new ArrayList();
                }
                if (remoteInput != null) {
                    this.f33527f.add(remoteInput);
                }
                return this;
            }

            @NonNull
            public Action build() {
                RemoteInput[] remoteInputArr;
                m57856a();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = this.f33527f;
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        RemoteInput remoteInput = (RemoteInput) it.next();
                        if (remoteInput.isDataOnly()) {
                            arrayList.add(remoteInput);
                        } else {
                            arrayList2.add(remoteInput);
                        }
                    }
                }
                RemoteInput[] remoteInputArr2 = null;
                if (arrayList.isEmpty()) {
                    remoteInputArr = null;
                } else {
                    remoteInputArr = (RemoteInput[]) arrayList.toArray(new RemoteInput[arrayList.size()]);
                }
                if (!arrayList2.isEmpty()) {
                    remoteInputArr2 = (RemoteInput[]) arrayList2.toArray(new RemoteInput[arrayList2.size()]);
                }
                return new Action(this.f33522a, this.f33523b, this.f33524c, this.f33526e, remoteInputArr2, remoteInputArr, this.f33525d, this.f33528g, this.f33529h, this.f33530i, this.f33531j);
            }

            @NonNull
            public Builder extend(@NonNull Extender extender) {
                extender.extend(this);
                return this;
            }

            @NonNull
            public Bundle getExtras() {
                return this.f33526e;
            }

            @NonNull
            public Builder setAllowGeneratedReplies(boolean z) {
                this.f33525d = z;
                return this;
            }

            @NonNull
            public Builder setAuthenticationRequired(boolean z) {
                this.f33531j = z;
                return this;
            }

            @NonNull
            public Builder setContextual(boolean z) {
                this.f33530i = z;
                return this;
            }

            @NonNull
            public Builder setSemanticAction(int i) {
                this.f33528g = i;
                return this;
            }

            @NonNull
            public Builder setShowsUserInterface(boolean z) {
                this.f33529h = z;
                return this;
            }

            public Builder(int i, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
                this(i != 0 ? IconCompat.createWithResource(null, "", i) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public Builder(@NonNull Action action) {
                this(action.getIconCompat(), action.title, action.actionIntent, new Bundle(action.f33513a), action.getRemoteInputs(), action.getAllowGeneratedReplies(), action.getSemanticAction(), action.f33518f, action.isContextual(), action.isAuthenticationRequired());
            }

            public Builder(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, boolean z, int i, boolean z2, boolean z3, boolean z4) {
                this.f33525d = true;
                this.f33529h = true;
                this.f33522a = iconCompat;
                this.f33523b = Builder.limitCharSequenceLength(charSequence);
                this.f33524c = pendingIntent;
                this.f33526e = bundle;
                this.f33527f = remoteInputArr == null ? null : new ArrayList(Arrays.asList(remoteInputArr));
                this.f33525d = z;
                this.f33528g = i;
                this.f33529h = z2;
                this.f33530i = z3;
                this.f33531j = z4;
            }
        }

        /* loaded from: classes2.dex */
        public interface Extender {
            @NonNull
            Builder extend(@NonNull Builder builder);
        }

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes2.dex */
        public @interface SemanticAction {
        }

        /* loaded from: classes2.dex */
        public static final class WearableExtender implements Extender {

            /* renamed from: a */
            public int f33532a;

            /* renamed from: b */
            public CharSequence f33533b;

            /* renamed from: c */
            public CharSequence f33534c;

            /* renamed from: d */
            public CharSequence f33535d;

            public WearableExtender() {
                this.f33532a = 1;
            }

            /* renamed from: a */
            public final void m57849a(int i, boolean z) {
                if (z) {
                    this.f33532a = i | this.f33532a;
                    return;
                }
                this.f33532a = (~i) & this.f33532a;
            }

            @Override // androidx.core.app.NotificationCompat.Action.Extender
            @NonNull
            public Builder extend(@NonNull Builder builder) {
                Bundle bundle = new Bundle();
                int i = this.f33532a;
                if (i != 1) {
                    bundle.putInt("flags", i);
                }
                CharSequence charSequence = this.f33533b;
                if (charSequence != null) {
                    bundle.putCharSequence("inProgressLabel", charSequence);
                }
                CharSequence charSequence2 = this.f33534c;
                if (charSequence2 != null) {
                    bundle.putCharSequence("confirmLabel", charSequence2);
                }
                CharSequence charSequence3 = this.f33535d;
                if (charSequence3 != null) {
                    bundle.putCharSequence("cancelLabel", charSequence3);
                }
                builder.getExtras().putBundle("android.wearable.EXTENSIONS", bundle);
                return builder;
            }

            @Nullable
            @Deprecated
            public CharSequence getCancelLabel() {
                return this.f33535d;
            }

            @Nullable
            @Deprecated
            public CharSequence getConfirmLabel() {
                return this.f33534c;
            }

            public boolean getHintDisplayActionInline() {
                if ((this.f33532a & 4) != 0) {
                    return true;
                }
                return false;
            }

            public boolean getHintLaunchesActivity() {
                if ((this.f33532a & 2) != 0) {
                    return true;
                }
                return false;
            }

            @Nullable
            @Deprecated
            public CharSequence getInProgressLabel() {
                return this.f33533b;
            }

            public boolean isAvailableOffline() {
                if ((this.f33532a & 1) != 0) {
                    return true;
                }
                return false;
            }

            @NonNull
            public WearableExtender setAvailableOffline(boolean z) {
                m57849a(1, z);
                return this;
            }

            @NonNull
            @Deprecated
            public WearableExtender setCancelLabel(@Nullable CharSequence charSequence) {
                this.f33535d = charSequence;
                return this;
            }

            @NonNull
            @Deprecated
            public WearableExtender setConfirmLabel(@Nullable CharSequence charSequence) {
                this.f33534c = charSequence;
                return this;
            }

            @NonNull
            public WearableExtender setHintDisplayActionInline(boolean z) {
                m57849a(4, z);
                return this;
            }

            @NonNull
            public WearableExtender setHintLaunchesActivity(boolean z) {
                m57849a(2, z);
                return this;
            }

            @NonNull
            @Deprecated
            public WearableExtender setInProgressLabel(@Nullable CharSequence charSequence) {
                this.f33533b = charSequence;
                return this;
            }

            @NonNull
            /* renamed from: clone */
            public WearableExtender m73905clone() {
                WearableExtender wearableExtender = new WearableExtender();
                wearableExtender.f33532a = this.f33532a;
                wearableExtender.f33533b = this.f33533b;
                wearableExtender.f33534c = this.f33534c;
                wearableExtender.f33535d = this.f33535d;
                return wearableExtender;
            }

            public WearableExtender(@NonNull Action action) {
                this.f33532a = 1;
                Bundle bundle = action.getExtras().getBundle("android.wearable.EXTENSIONS");
                if (bundle != null) {
                    this.f33532a = bundle.getInt("flags", 1);
                    this.f33533b = bundle.getCharSequence("inProgressLabel");
                    this.f33534c = bundle.getCharSequence("confirmLabel");
                    this.f33535d = bundle.getCharSequence("cancelLabel");
                }
            }
        }

        public Action(int i, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.createWithResource(null, "", i) : null, charSequence, pendingIntent);
        }

        @Nullable
        public PendingIntent getActionIntent() {
            return this.actionIntent;
        }

        public boolean getAllowGeneratedReplies() {
            return this.f33517e;
        }

        @Nullable
        public RemoteInput[] getDataOnlyRemoteInputs() {
            return this.f33516d;
        }

        @NonNull
        public Bundle getExtras() {
            return this.f33513a;
        }

        @Deprecated
        public int getIcon() {
            return this.icon;
        }

        @Nullable
        public IconCompat getIconCompat() {
            int i;
            if (this.f33514b == null && (i = this.icon) != 0) {
                this.f33514b = IconCompat.createWithResource(null, "", i);
            }
            return this.f33514b;
        }

        @Nullable
        public RemoteInput[] getRemoteInputs() {
            return this.f33515c;
        }

        public int getSemanticAction() {
            return this.f33519g;
        }

        public boolean getShowsUserInterface() {
            return this.f33518f;
        }

        @Nullable
        public CharSequence getTitle() {
            return this.title;
        }

        public boolean isAuthenticationRequired() {
            return this.f33521i;
        }

        public boolean isContextual() {
            return this.f33520h;
        }

        public Action(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (RemoteInput[]) null, (RemoteInput[]) null, true, 0, true, false, false);
        }

        public Action(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, RemoteInput[] remoteInputArr2, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
            this(i != 0 ? IconCompat.createWithResource(null, "", i) : null, charSequence, pendingIntent, bundle, remoteInputArr, remoteInputArr2, z, i2, z2, z3, z4);
        }

        public Action(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, RemoteInput[] remoteInputArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.f33518f = true;
            this.f33514b = iconCompat;
            if (iconCompat != null && iconCompat.getType() == 2) {
                this.icon = iconCompat.getResId();
            }
            this.title = Builder.limitCharSequenceLength(charSequence);
            this.actionIntent = pendingIntent;
            this.f33513a = bundle == null ? new Bundle() : bundle;
            this.f33515c = remoteInputArr;
            this.f33516d = remoteInputArr2;
            this.f33517e = z;
            this.f33519g = i;
            this.f33518f = z2;
            this.f33520h = z3;
            this.f33521i = z4;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface BadgeIconType {
    }

    /* loaded from: classes2.dex */
    public static class BigPictureStyle extends Style {

        /* renamed from: d */
        public IconCompat f33536d;

        /* renamed from: e */
        public IconCompat f33537e;

        /* renamed from: f */
        public boolean f33538f;

        /* renamed from: g */
        public CharSequence f33539g;

        /* renamed from: h */
        public boolean f33540h;

        /* renamed from: androidx.core.app.NotificationCompat$BigPictureStyle$a */
        /* loaded from: classes2.dex */
        public static class C3864a {
            @DoNotInline
            /* renamed from: a */
            public static Notification.BigPictureStyle m57847a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                return bigPictureStyle.bigPicture(bitmap);
            }

            @DoNotInline
            /* renamed from: b */
            public static Notification.BigPictureStyle m57846b(Notification.Builder builder) {
                return new Notification.BigPictureStyle(builder);
            }

            @DoNotInline
            /* renamed from: c */
            public static Notification.BigPictureStyle m57845c(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                return bigPictureStyle.setBigContentTitle(charSequence);
            }

            @RequiresApi(16)
            /* renamed from: d */
            public static void m57844d(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            @RequiresApi(16)
            /* renamed from: e */
            public static void m57843e(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$BigPictureStyle$b */
        /* loaded from: classes2.dex */
        public static class C3865b {
            @RequiresApi(23)
            /* renamed from: a */
            public static void m57842a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$BigPictureStyle$c */
        /* loaded from: classes2.dex */
        public static class C3866c {
            @RequiresApi(31)
            /* renamed from: a */
            public static void m57841a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            @RequiresApi(31)
            /* renamed from: b */
            public static void m57840b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            @RequiresApi(31)
            /* renamed from: c */
            public static void m57839c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        public BigPictureStyle() {
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static IconCompat getPictureIcon(@Nullable Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable(NotificationCompat.EXTRA_PICTURE);
            if (parcelable != null) {
                return m57848l(parcelable);
            }
            return m57848l(bundle.getParcelable(NotificationCompat.EXTRA_PICTURE_ICON));
        }

        /* renamed from: l */
        public static IconCompat m57848l(Parcelable parcelable) {
            if (parcelable != null) {
                if (Build.VERSION.SDK_INT >= 23 && XI0.m65526a(parcelable)) {
                    return IconCompat.createFromIcon(YI0.m65369a(parcelable));
                }
                if (parcelable instanceof Bitmap) {
                    return IconCompat.createWithBitmap((Bitmap) parcelable);
                }
                return null;
            }
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Context context;
            int i = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle m57845c = C3864a.m57845c(C3864a.m57846b(notificationBuilderWithBuilderAccessor.getBuilder()), this.f33639a);
            IconCompat iconCompat = this.f33536d;
            Context context2 = null;
            if (iconCompat != null) {
                if (i >= 31) {
                    if (notificationBuilderWithBuilderAccessor instanceof C3929a) {
                        context = ((C3929a) notificationBuilderWithBuilderAccessor).m57613e();
                    } else {
                        context = null;
                    }
                    C3866c.m57841a(m57845c, this.f33536d.toIcon(context));
                } else if (iconCompat.getType() == 1) {
                    m57845c = C3864a.m57847a(m57845c, this.f33536d.getBitmap());
                }
            }
            if (this.f33538f) {
                IconCompat iconCompat2 = this.f33537e;
                if (iconCompat2 == null) {
                    C3864a.m57844d(m57845c, null);
                } else if (i >= 23) {
                    if (notificationBuilderWithBuilderAccessor instanceof C3929a) {
                        context2 = ((C3929a) notificationBuilderWithBuilderAccessor).m57613e();
                    }
                    C3865b.m57842a(m57845c, this.f33537e.toIcon(context2));
                } else if (iconCompat2.getType() == 1) {
                    C3864a.m57844d(m57845c, this.f33537e.getBitmap());
                } else {
                    C3864a.m57844d(m57845c, null);
                }
            }
            if (this.f33641c) {
                C3864a.m57843e(m57845c, this.f33640b);
            }
            if (i >= 31) {
                C3866c.m57839c(m57845c, this.f33540h);
                C3866c.m57840b(m57845c, this.f33539g);
            }
        }

        @NonNull
        public BigPictureStyle bigLargeIcon(@Nullable Bitmap bitmap) {
            this.f33537e = bitmap == null ? null : IconCompat.createWithBitmap(bitmap);
            this.f33538f = true;
            return this;
        }

        @NonNull
        public BigPictureStyle bigPicture(@Nullable Bitmap bitmap) {
            this.f33536d = bitmap == null ? null : IconCompat.createWithBitmap(bitmap);
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_LARGE_ICON_BIG);
            bundle.remove(NotificationCompat.EXTRA_PICTURE);
            bundle.remove(NotificationCompat.EXTRA_PICTURE_ICON);
            bundle.remove(NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            if (bundle.containsKey(NotificationCompat.EXTRA_LARGE_ICON_BIG)) {
                this.f33537e = m57848l(bundle.getParcelable(NotificationCompat.EXTRA_LARGE_ICON_BIG));
                this.f33538f = true;
            }
            this.f33536d = getPictureIcon(bundle);
            this.f33540h = bundle.getBoolean(NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }

        @NonNull
        public BigPictureStyle setBigContentTitle(@Nullable CharSequence charSequence) {
            this.f33639a = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        @RequiresApi(31)
        public BigPictureStyle setContentDescription(@Nullable CharSequence charSequence) {
            this.f33539g = charSequence;
            return this;
        }

        @NonNull
        public BigPictureStyle setSummaryText(@Nullable CharSequence charSequence) {
            this.f33640b = Builder.limitCharSequenceLength(charSequence);
            this.f33641c = true;
            return this;
        }

        @NonNull
        @RequiresApi(31)
        public BigPictureStyle showBigPictureWhenCollapsed(boolean z) {
            this.f33540h = z;
            return this;
        }

        public BigPictureStyle(@Nullable Builder builder) {
            setBuilder(builder);
        }

        @NonNull
        @RequiresApi(31)
        public BigPictureStyle bigPicture(@Nullable Icon icon) {
            this.f33536d = IconCompat.createFromIcon(icon);
            return this;
        }

        @NonNull
        @RequiresApi(23)
        public BigPictureStyle bigLargeIcon(@Nullable Icon icon) {
            this.f33537e = icon == null ? null : IconCompat.createFromIcon(icon);
            this.f33538f = true;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static class BigTextStyle extends Style {

        /* renamed from: d */
        public CharSequence f33541d;

        /* renamed from: androidx.core.app.NotificationCompat$BigTextStyle$a */
        /* loaded from: classes2.dex */
        public static class C3867a {
            @DoNotInline
            /* renamed from: a */
            public static Notification.BigTextStyle m57838a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            @DoNotInline
            /* renamed from: b */
            public static Notification.BigTextStyle m57837b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            @DoNotInline
            /* renamed from: c */
            public static Notification.BigTextStyle m57836c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            @DoNotInline
            /* renamed from: d */
            public static Notification.BigTextStyle m57835d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setSummaryText(charSequence);
            }
        }

        public BigTextStyle() {
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void addCompatExtras(@NonNull Bundle bundle) {
            super.addCompatExtras(bundle);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.BigTextStyle m57838a = C3867a.m57838a(C3867a.m57836c(C3867a.m57837b(notificationBuilderWithBuilderAccessor.getBuilder()), this.f33639a), this.f33541d);
            if (this.f33641c) {
                C3867a.m57835d(m57838a, this.f33640b);
            }
        }

        @NonNull
        public BigTextStyle bigText(@Nullable CharSequence charSequence) {
            this.f33541d = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_BIG_TEXT);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.f33541d = bundle.getCharSequence(NotificationCompat.EXTRA_BIG_TEXT);
        }

        @NonNull
        public BigTextStyle setBigContentTitle(@Nullable CharSequence charSequence) {
            this.f33639a = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public BigTextStyle setSummaryText(@Nullable CharSequence charSequence) {
            this.f33640b = Builder.limitCharSequenceLength(charSequence);
            this.f33641c = true;
            return this;
        }

        public BigTextStyle(@Nullable Builder builder) {
            setBuilder(builder);
        }
    }

    /* loaded from: classes2.dex */
    public static final class BubbleMetadata {

        /* renamed from: a */
        public PendingIntent f33542a;

        /* renamed from: b */
        public PendingIntent f33543b;

        /* renamed from: c */
        public IconCompat f33544c;

        /* renamed from: d */
        public int f33545d;

        /* renamed from: e */
        public int f33546e;

        /* renamed from: f */
        public int f33547f;

        /* renamed from: g */
        public String f33548g;

        /* loaded from: classes2.dex */
        public static final class Builder {

            /* renamed from: a */
            public PendingIntent f33549a;

            /* renamed from: b */
            public IconCompat f33550b;

            /* renamed from: c */
            public int f33551c;

            /* renamed from: d */
            public int f33552d;

            /* renamed from: e */
            public int f33553e;

            /* renamed from: f */
            public PendingIntent f33554f;

            /* renamed from: g */
            public String f33555g;

            @Deprecated
            public Builder() {
            }

            /* renamed from: a */
            public final Builder m57834a(int i, boolean z) {
                if (z) {
                    this.f33553e = i | this.f33553e;
                } else {
                    this.f33553e = (~i) & this.f33553e;
                }
                return this;
            }

            @NonNull
            @SuppressLint({"SyntheticAccessor"})
            public BubbleMetadata build() {
                String str = this.f33555g;
                if (str == null && this.f33549a == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if (str == null && this.f33550b == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                BubbleMetadata bubbleMetadata = new BubbleMetadata(this.f33549a, this.f33554f, this.f33550b, this.f33551c, this.f33552d, this.f33553e, str);
                bubbleMetadata.setFlags(this.f33553e);
                return bubbleMetadata;
            }

            @NonNull
            public Builder setAutoExpandBubble(boolean z) {
                m57834a(1, z);
                return this;
            }

            @NonNull
            public Builder setDeleteIntent(@Nullable PendingIntent pendingIntent) {
                this.f33554f = pendingIntent;
                return this;
            }

            @NonNull
            public Builder setDesiredHeight(@Dimension(unit = 0) int i) {
                this.f33551c = Math.max(i, 0);
                this.f33552d = 0;
                return this;
            }

            @NonNull
            public Builder setDesiredHeightResId(@DimenRes int i) {
                this.f33552d = i;
                this.f33551c = 0;
                return this;
            }

            @NonNull
            public Builder setIcon(@NonNull IconCompat iconCompat) {
                if (this.f33555g == null) {
                    if (iconCompat != null) {
                        this.f33550b = iconCompat;
                        return this;
                    }
                    throw new NullPointerException("Bubbles require non-null icon");
                }
                throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
            }

            @NonNull
            public Builder setIntent(@NonNull PendingIntent pendingIntent) {
                if (this.f33555g == null) {
                    if (pendingIntent != null) {
                        this.f33549a = pendingIntent;
                        return this;
                    }
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
            }

            @NonNull
            public Builder setSuppressNotification(boolean z) {
                m57834a(2, z);
                return this;
            }

            @RequiresApi(30)
            public Builder(@NonNull String str) {
                if (!TextUtils.isEmpty(str)) {
                    this.f33555g = str;
                    return;
                }
                throw new NullPointerException("Bubble requires a non-null shortcut id");
            }

            public Builder(@NonNull PendingIntent pendingIntent, @NonNull IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                if (iconCompat != null) {
                    this.f33549a = pendingIntent;
                    this.f33550b = iconCompat;
                    return;
                }
                throw new NullPointerException("Bubbles require non-null icon");
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$BubbleMetadata$a */
        /* loaded from: classes2.dex */
        public static class C3868a {
            @Nullable
            @RequiresApi(29)
            /* renamed from: a */
            public static BubbleMetadata m57833a(@Nullable Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                Builder suppressNotification = new Builder(bubbleMetadata.getIntent(), IconCompat.createFromIcon(bubbleMetadata.getIcon())).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    suppressNotification.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    suppressNotification.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return suppressNotification.build();
            }

            @Nullable
            @RequiresApi(29)
            /* renamed from: b */
            public static Notification.BubbleMetadata m57832b(@Nullable BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(bubbleMetadata.getIcon().toIcon()).setIntent(bubbleMetadata.getIntent()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    suppressNotification.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    suppressNotification.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return suppressNotification.build();
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$BubbleMetadata$b */
        /* loaded from: classes2.dex */
        public static class C3869b {
            @Nullable
            @RequiresApi(30)
            /* renamed from: a */
            public static BubbleMetadata m57831a(@Nullable Notification.BubbleMetadata bubbleMetadata) {
                Builder builder;
                if (bubbleMetadata == null) {
                    return null;
                }
                if (bubbleMetadata.getShortcutId() != null) {
                    builder = new Builder(bubbleMetadata.getShortcutId());
                } else {
                    builder = new Builder(bubbleMetadata.getIntent(), IconCompat.createFromIcon(bubbleMetadata.getIcon()));
                }
                builder.setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    builder.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    builder.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return builder.build();
            }

            @Nullable
            @RequiresApi(30)
            /* renamed from: b */
            public static Notification.BubbleMetadata m57830b(@Nullable BubbleMetadata bubbleMetadata) {
                Notification.BubbleMetadata.Builder builder;
                if (bubbleMetadata == null) {
                    return null;
                }
                if (bubbleMetadata.getShortcutId() != null) {
                    builder = new Notification.BubbleMetadata.Builder(bubbleMetadata.getShortcutId());
                } else {
                    builder = new Notification.BubbleMetadata.Builder(bubbleMetadata.getIntent(), bubbleMetadata.getIcon().toIcon());
                }
                builder.setDeleteIntent(bubbleMetadata.getDeleteIntent()).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    builder.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    builder.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return builder.build();
            }
        }

        @Nullable
        public static BubbleMetadata fromPlatform(@Nullable Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return C3869b.m57831a(bubbleMetadata);
            }
            if (i != 29) {
                return null;
            }
            return C3868a.m57833a(bubbleMetadata);
        }

        @Nullable
        public static Notification.BubbleMetadata toPlatform(@Nullable BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return C3869b.m57830b(bubbleMetadata);
            }
            if (i != 29) {
                return null;
            }
            return C3868a.m57832b(bubbleMetadata);
        }

        public boolean getAutoExpandBubble() {
            if ((this.f33547f & 1) != 0) {
                return true;
            }
            return false;
        }

        @Nullable
        public PendingIntent getDeleteIntent() {
            return this.f33543b;
        }

        @Dimension(unit = 0)
        public int getDesiredHeight() {
            return this.f33545d;
        }

        @DimenRes
        public int getDesiredHeightResId() {
            return this.f33546e;
        }

        @Nullable
        @SuppressLint({"InvalidNullConversion"})
        public IconCompat getIcon() {
            return this.f33544c;
        }

        @Nullable
        @SuppressLint({"InvalidNullConversion"})
        public PendingIntent getIntent() {
            return this.f33542a;
        }

        @Nullable
        public String getShortcutId() {
            return this.f33548g;
        }

        public boolean isNotificationSuppressed() {
            if ((this.f33547f & 2) != 0) {
                return true;
            }
            return false;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void setFlags(int i) {
            this.f33547f = i;
        }

        public BubbleMetadata(PendingIntent pendingIntent, PendingIntent pendingIntent2, IconCompat iconCompat, int i, int i2, int i3, String str) {
            this.f33542a = pendingIntent;
            this.f33544c = iconCompat;
            this.f33545d = i;
            this.f33546e = i2;
            this.f33543b = pendingIntent2;
            this.f33547f = i3;
            this.f33548g = str;
        }
    }

    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: A */
        public String f33556A;

        /* renamed from: B */
        public Bundle f33557B;

        /* renamed from: C */
        public int f33558C;

        /* renamed from: D */
        public int f33559D;

        /* renamed from: E */
        public Notification f33560E;

        /* renamed from: F */
        public RemoteViews f33561F;

        /* renamed from: G */
        public RemoteViews f33562G;

        /* renamed from: H */
        public RemoteViews f33563H;

        /* renamed from: I */
        public String f33564I;

        /* renamed from: J */
        public int f33565J;

        /* renamed from: K */
        public String f33566K;

        /* renamed from: L */
        public LocusIdCompat f33567L;

        /* renamed from: M */
        public long f33568M;

        /* renamed from: N */
        public int f33569N;

        /* renamed from: O */
        public int f33570O;

        /* renamed from: P */
        public boolean f33571P;

        /* renamed from: Q */
        public BubbleMetadata f33572Q;

        /* renamed from: R */
        public Notification f33573R;

        /* renamed from: S */
        public boolean f33574S;

        /* renamed from: T */
        public Object f33575T;

        /* renamed from: a */
        public ArrayList f33576a;

        /* renamed from: b */
        public CharSequence f33577b;

        /* renamed from: c */
        public CharSequence f33578c;

        /* renamed from: d */
        public PendingIntent f33579d;

        /* renamed from: e */
        public PendingIntent f33580e;

        /* renamed from: f */
        public RemoteViews f33581f;

        /* renamed from: g */
        public Bitmap f33582g;

        /* renamed from: h */
        public CharSequence f33583h;

        /* renamed from: i */
        public int f33584i;

        /* renamed from: j */
        public int f33585j;

        /* renamed from: k */
        public boolean f33586k;

        /* renamed from: l */
        public boolean f33587l;

        /* renamed from: m */
        public boolean f33588m;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<Action> mActions;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Context mContext;
        @Deprecated
        public ArrayList<String> mPeople;
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<Person> mPersonList;

        /* renamed from: n */
        public Style f33589n;

        /* renamed from: o */
        public CharSequence f33590o;

        /* renamed from: p */
        public CharSequence f33591p;

        /* renamed from: q */
        public CharSequence[] f33592q;

        /* renamed from: r */
        public int f33593r;

        /* renamed from: s */
        public int f33594s;

        /* renamed from: t */
        public boolean f33595t;

        /* renamed from: u */
        public String f33596u;

        /* renamed from: v */
        public boolean f33597v;

        /* renamed from: w */
        public String f33598w;

        /* renamed from: x */
        public boolean f33599x;

        /* renamed from: y */
        public boolean f33600y;

        /* renamed from: z */
        public boolean f33601z;

        /* renamed from: androidx.core.app.NotificationCompat$Builder$a */
        /* loaded from: classes2.dex */
        public static class C3870a {
            @DoNotInline
            /* renamed from: a */
            public static AudioAttributes m57825a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            @DoNotInline
            /* renamed from: b */
            public static AudioAttributes.Builder m57824b() {
                return new AudioAttributes.Builder();
            }

            @DoNotInline
            /* renamed from: c */
            public static AudioAttributes.Builder m57823c(AudioAttributes.Builder builder, int i) {
                return builder.setContentType(i);
            }

            @DoNotInline
            /* renamed from: d */
            public static AudioAttributes.Builder m57822d(AudioAttributes.Builder builder, int i) {
                return builder.setLegacyStreamType(i);
            }

            @DoNotInline
            /* renamed from: e */
            public static AudioAttributes.Builder m57821e(AudioAttributes.Builder builder, int i) {
                return builder.setUsage(i);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$Builder$b */
        /* loaded from: classes2.dex */
        public static class C3871b {
            @DoNotInline
            /* renamed from: a */
            public static Icon m57820a(Notification notification) {
                return notification.getSmallIcon();
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$Builder$c */
        /* loaded from: classes2.dex */
        public static class C3872c {
            @DoNotInline
            /* renamed from: a */
            public static RemoteViews m57819a(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            @DoNotInline
            /* renamed from: b */
            public static RemoteViews m57818b(Notification.Builder builder) {
                return builder.createContentView();
            }

            @DoNotInline
            /* renamed from: c */
            public static RemoteViews m57817c(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            @DoNotInline
            /* renamed from: d */
            public static Notification.Builder m57816d(Context context, Notification notification) {
                return Notification.Builder.recoverBuilder(context, notification);
            }
        }

        @RequiresApi(19)
        public Builder(@NonNull Context context, @NonNull Notification notification) {
            this(context, NotificationCompat.getChannelId(notification));
            ArrayList parcelableArrayList;
            Bundle bundle = notification.extras;
            Style extractStyleFromNotification = Style.extractStyleFromNotification(notification);
            setContentTitle(NotificationCompat.getContentTitle(notification)).setContentText(NotificationCompat.getContentText(notification)).setContentInfo(NotificationCompat.getContentInfo(notification)).setSubText(NotificationCompat.getSubText(notification)).setSettingsText(NotificationCompat.getSettingsText(notification)).setStyle(extractStyleFromNotification).setContentIntent(notification.contentIntent).setGroup(NotificationCompat.getGroup(notification)).setGroupSummary(NotificationCompat.isGroupSummary(notification)).setLocusId(NotificationCompat.getLocusId(notification)).setWhen(notification.when).setShowWhen(NotificationCompat.getShowWhen(notification)).setUsesChronometer(NotificationCompat.getUsesChronometer(notification)).setAutoCancel(NotificationCompat.getAutoCancel(notification)).setOnlyAlertOnce(NotificationCompat.getOnlyAlertOnce(notification)).setOngoing(NotificationCompat.getOngoing(notification)).setLocalOnly(NotificationCompat.getLocalOnly(notification)).setLargeIcon(notification.largeIcon).setBadgeIconType(NotificationCompat.getBadgeIconType(notification)).setCategory(NotificationCompat.getCategory(notification)).setBubbleMetadata(NotificationCompat.getBubbleMetadata(notification)).setNumber(notification.number).setTicker(notification.tickerText).setContentIntent(notification.contentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(notification.fullScreenIntent, NotificationCompat.m57858b(notification)).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setDefaults(notification.defaults).setPriority(notification.priority).setColor(NotificationCompat.getColor(notification)).setVisibility(NotificationCompat.getVisibility(notification)).setPublicVersion(NotificationCompat.getPublicVersion(notification)).setSortKey(NotificationCompat.getSortKey(notification)).setTimeoutAfter(NotificationCompat.getTimeoutAfter(notification)).setShortcutId(NotificationCompat.getShortcutId(notification)).setProgress(bundle.getInt(NotificationCompat.EXTRA_PROGRESS_MAX), bundle.getInt(NotificationCompat.EXTRA_PROGRESS), bundle.getBoolean(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE)).setAllowSystemGeneratedContextualActions(NotificationCompat.getAllowSystemGeneratedContextualActions(notification)).setSmallIcon(notification.icon, notification.iconLevel).addExtras(m57829a(notification, extractStyleFromNotification));
            if (Build.VERSION.SDK_INT >= 23) {
                this.f33575T = C3871b.m57820a(notification);
            }
            Notification.Action[] actionArr = notification.actions;
            if (actionArr != null && actionArr.length != 0) {
                for (Notification.Action action : actionArr) {
                    addAction(Action.Builder.fromAndroidAction(action).build());
                }
            }
            List<Action> invisibleActions = NotificationCompat.getInvisibleActions(notification);
            if (!invisibleActions.isEmpty()) {
                for (Action action2 : invisibleActions) {
                    addInvisibleAction(action2);
                }
            }
            String[] stringArray = notification.extras.getStringArray(NotificationCompat.EXTRA_PEOPLE);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    addPerson(str);
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList(NotificationCompat.EXTRA_PEOPLE_LIST)) != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    addPerson(Person.fromAndroidPerson(WI0.m65642a(it.next())));
                }
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24 && bundle.containsKey(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN)) {
                setChronometerCountDown(bundle.getBoolean(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN));
            }
            if (i < 26 || !bundle.containsKey(NotificationCompat.EXTRA_COLORIZED)) {
                return;
            }
            setColorized(bundle.getBoolean(NotificationCompat.EXTRA_COLORIZED));
        }

        /* renamed from: a */
        public static Bundle m57829a(Notification notification, Style style) {
            if (notification.extras == null) {
                return null;
            }
            Bundle bundle = new Bundle(notification.extras);
            bundle.remove(NotificationCompat.EXTRA_TITLE);
            bundle.remove(NotificationCompat.EXTRA_TEXT);
            bundle.remove(NotificationCompat.EXTRA_INFO_TEXT);
            bundle.remove(NotificationCompat.EXTRA_SUB_TEXT);
            bundle.remove(NotificationCompat.EXTRA_CHANNEL_ID);
            bundle.remove(NotificationCompat.EXTRA_CHANNEL_GROUP_ID);
            bundle.remove(NotificationCompat.EXTRA_SHOW_WHEN);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS_MAX);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE);
            bundle.remove(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN);
            bundle.remove(NotificationCompat.EXTRA_COLORIZED);
            bundle.remove(NotificationCompat.EXTRA_PEOPLE_LIST);
            bundle.remove(NotificationCompat.EXTRA_PEOPLE);
            bundle.remove(NotificationCompatExtras.EXTRA_SORT_KEY);
            bundle.remove(NotificationCompatExtras.EXTRA_GROUP_KEY);
            bundle.remove(NotificationCompatExtras.EXTRA_GROUP_SUMMARY);
            bundle.remove(NotificationCompatExtras.EXTRA_LOCAL_ONLY);
            bundle.remove(NotificationCompatExtras.EXTRA_ACTION_EXTRAS);
            Bundle bundle2 = bundle.getBundle("android.car.EXTENSIONS");
            if (bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove("invisible_actions");
                bundle.putBundle("android.car.EXTENSIONS", bundle3);
            }
            if (style != null) {
                style.clearCompatExtraKeys(bundle);
            }
            return bundle;
        }

        @Nullable
        public static CharSequence limitCharSequenceLength(@Nullable CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > 5120) {
                return charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        @NonNull
        public Builder addAction(int i, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this.mActions.add(new Action(i, charSequence, pendingIntent));
            return this;
        }

        @NonNull
        public Builder addExtras(@Nullable Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.f33557B;
                if (bundle2 == null) {
                    this.f33557B = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        @NonNull
        @RequiresApi(21)
        public Builder addInvisibleAction(int i, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this.f33576a.add(new Action(i, charSequence, pendingIntent));
            return this;
        }

        @NonNull
        @Deprecated
        public Builder addPerson(@Nullable String str) {
            if (str != null && !str.isEmpty()) {
                this.mPeople.add(str);
            }
            return this;
        }

        /* renamed from: b */
        public final Bitmap m57828b(Bitmap bitmap) {
            if (bitmap != null && Build.VERSION.SDK_INT < 27) {
                Resources resources = this.mContext.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                    return bitmap;
                }
                double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
            }
            return bitmap;
        }

        @NonNull
        public Notification build() {
            return new C3929a(this).m57616b();
        }

        /* renamed from: c */
        public final void m57827c(int i, boolean z) {
            if (z) {
                Notification notification = this.f33573R;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.f33573R;
            notification2.flags = (~i) & notification2.flags;
        }

        @NonNull
        public Builder clearActions() {
            this.mActions.clear();
            return this;
        }

        @NonNull
        public Builder clearInvisibleActions() {
            this.f33576a.clear();
            Bundle bundle = this.f33557B.getBundle("android.car.EXTENSIONS");
            if (bundle != null) {
                Bundle bundle2 = new Bundle(bundle);
                bundle2.remove("invisible_actions");
                this.f33557B.putBundle("android.car.EXTENSIONS", bundle2);
            }
            return this;
        }

        @NonNull
        public Builder clearPeople() {
            this.mPersonList.clear();
            this.mPeople.clear();
            return this;
        }

        @Nullable
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews createBigContentView() {
            RemoteViews makeBigContentView;
            int i = Build.VERSION.SDK_INT;
            if (this.f33562G != null && m57826d()) {
                return this.f33562G;
            }
            C3929a c3929a = new C3929a(this);
            Style style = this.f33589n;
            if (style != null && (makeBigContentView = style.makeBigContentView(c3929a)) != null) {
                return makeBigContentView;
            }
            Notification m57616b = c3929a.m57616b();
            if (i >= 24) {
                return C3872c.m57819a(C3872c.m57816d(this.mContext, m57616b));
            }
            return m57616b.bigContentView;
        }

        @Nullable
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews createContentView() {
            RemoteViews makeContentView;
            if (this.f33561F != null && m57826d()) {
                return this.f33561F;
            }
            C3929a c3929a = new C3929a(this);
            Style style = this.f33589n;
            if (style != null && (makeContentView = style.makeContentView(c3929a)) != null) {
                return makeContentView;
            }
            Notification m57616b = c3929a.m57616b();
            if (Build.VERSION.SDK_INT >= 24) {
                return C3872c.m57818b(C3872c.m57816d(this.mContext, m57616b));
            }
            return m57616b.contentView;
        }

        @Nullable
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews createHeadsUpContentView() {
            RemoteViews makeHeadsUpContentView;
            int i = Build.VERSION.SDK_INT;
            if (this.f33563H != null && m57826d()) {
                return this.f33563H;
            }
            C3929a c3929a = new C3929a(this);
            Style style = this.f33589n;
            if (style != null && (makeHeadsUpContentView = style.makeHeadsUpContentView(c3929a)) != null) {
                return makeHeadsUpContentView;
            }
            Notification m57616b = c3929a.m57616b();
            if (i >= 24) {
                return C3872c.m57817c(C3872c.m57816d(this.mContext, m57616b));
            }
            return m57616b.headsUpContentView;
        }

        /* renamed from: d */
        public final boolean m57826d() {
            Style style = this.f33589n;
            if (style != null && style.displayCustomViewInline()) {
                return false;
            }
            return true;
        }

        @NonNull
        public Builder extend(@NonNull Extender extender) {
            extender.extend(this);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews getBigContentView() {
            return this.f33562G;
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public BubbleMetadata getBubbleMetadata() {
            return this.f33572Q;
        }

        @ColorInt
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public int getColor() {
            return this.f33558C;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews getContentView() {
            return this.f33561F;
        }

        @NonNull
        public Bundle getExtras() {
            if (this.f33557B == null) {
                this.f33557B = new Bundle();
            }
            return this.f33557B;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public int getForegroundServiceBehavior() {
            return this.f33570O;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews getHeadsUpContentView() {
            return this.f33563H;
        }

        @NonNull
        @Deprecated
        public Notification getNotification() {
            return build();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public int getPriority() {
            return this.f33585j;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public long getWhenIfShowing() {
            if (this.f33586k) {
                return this.f33573R.when;
            }
            return 0L;
        }

        @NonNull
        public Builder setAllowSystemGeneratedContextualActions(boolean z) {
            this.f33571P = z;
            return this;
        }

        @NonNull
        public Builder setAutoCancel(boolean z) {
            m57827c(16, z);
            return this;
        }

        @NonNull
        public Builder setBadgeIconType(int i) {
            this.f33565J = i;
            return this;
        }

        @NonNull
        public Builder setBubbleMetadata(@Nullable BubbleMetadata bubbleMetadata) {
            this.f33572Q = bubbleMetadata;
            return this;
        }

        @NonNull
        public Builder setCategory(@Nullable String str) {
            this.f33556A = str;
            return this;
        }

        @NonNull
        public Builder setChannelId(@NonNull String str) {
            this.f33564I = str;
            return this;
        }

        @NonNull
        @RequiresApi(24)
        public Builder setChronometerCountDown(boolean z) {
            this.f33588m = z;
            getExtras().putBoolean(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN, z);
            return this;
        }

        @NonNull
        public Builder setColor(@ColorInt int i) {
            this.f33558C = i;
            return this;
        }

        @NonNull
        public Builder setColorized(boolean z) {
            this.f33600y = z;
            this.f33601z = true;
            return this;
        }

        @NonNull
        public Builder setContent(@Nullable RemoteViews remoteViews) {
            this.f33573R.contentView = remoteViews;
            return this;
        }

        @NonNull
        public Builder setContentInfo(@Nullable CharSequence charSequence) {
            this.f33583h = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setContentIntent(@Nullable PendingIntent pendingIntent) {
            this.f33579d = pendingIntent;
            return this;
        }

        @NonNull
        public Builder setContentText(@Nullable CharSequence charSequence) {
            this.f33578c = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setContentTitle(@Nullable CharSequence charSequence) {
            this.f33577b = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setCustomBigContentView(@Nullable RemoteViews remoteViews) {
            this.f33562G = remoteViews;
            return this;
        }

        @NonNull
        public Builder setCustomContentView(@Nullable RemoteViews remoteViews) {
            this.f33561F = remoteViews;
            return this;
        }

        @NonNull
        public Builder setCustomHeadsUpContentView(@Nullable RemoteViews remoteViews) {
            this.f33563H = remoteViews;
            return this;
        }

        @NonNull
        public Builder setDefaults(int i) {
            Notification notification = this.f33573R;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        @NonNull
        public Builder setDeleteIntent(@Nullable PendingIntent pendingIntent) {
            this.f33573R.deleteIntent = pendingIntent;
            return this;
        }

        @NonNull
        public Builder setExtras(@Nullable Bundle bundle) {
            this.f33557B = bundle;
            return this;
        }

        @NonNull
        public Builder setForegroundServiceBehavior(int i) {
            this.f33570O = i;
            return this;
        }

        @NonNull
        public Builder setFullScreenIntent(@Nullable PendingIntent pendingIntent, boolean z) {
            this.f33580e = pendingIntent;
            m57827c(128, z);
            return this;
        }

        @NonNull
        public Builder setGroup(@Nullable String str) {
            this.f33596u = str;
            return this;
        }

        @NonNull
        public Builder setGroupAlertBehavior(int i) {
            this.f33569N = i;
            return this;
        }

        @NonNull
        public Builder setGroupSummary(boolean z) {
            this.f33597v = z;
            return this;
        }

        @NonNull
        public Builder setLargeIcon(@Nullable Bitmap bitmap) {
            this.f33582g = m57828b(bitmap);
            return this;
        }

        @NonNull
        public Builder setLights(@ColorInt int i, int i2, int i3) {
            int i4;
            Notification notification = this.f33573R;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            if (i2 != 0 && i3 != 0) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            notification.flags = i4 | (notification.flags & (-2));
            return this;
        }

        @NonNull
        public Builder setLocalOnly(boolean z) {
            this.f33599x = z;
            return this;
        }

        @NonNull
        public Builder setLocusId(@Nullable LocusIdCompat locusIdCompat) {
            this.f33567L = locusIdCompat;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setNotificationSilent() {
            this.f33574S = true;
            return this;
        }

        @NonNull
        public Builder setNumber(int i) {
            this.f33584i = i;
            return this;
        }

        @NonNull
        public Builder setOngoing(boolean z) {
            m57827c(2, z);
            return this;
        }

        @NonNull
        public Builder setOnlyAlertOnce(boolean z) {
            m57827c(8, z);
            return this;
        }

        @NonNull
        public Builder setPriority(int i) {
            this.f33585j = i;
            return this;
        }

        @NonNull
        public Builder setProgress(int i, int i2, boolean z) {
            this.f33593r = i;
            this.f33594s = i2;
            this.f33595t = z;
            return this;
        }

        @NonNull
        public Builder setPublicVersion(@Nullable Notification notification) {
            this.f33560E = notification;
            return this;
        }

        @NonNull
        public Builder setRemoteInputHistory(@Nullable CharSequence[] charSequenceArr) {
            this.f33592q = charSequenceArr;
            return this;
        }

        @NonNull
        public Builder setSettingsText(@Nullable CharSequence charSequence) {
            this.f33591p = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setShortcutId(@Nullable String str) {
            this.f33566K = str;
            return this;
        }

        @NonNull
        public Builder setShortcutInfo(@Nullable ShortcutInfoCompat shortcutInfoCompat) {
            if (shortcutInfoCompat == null) {
                return this;
            }
            this.f33566K = shortcutInfoCompat.getId();
            if (this.f33567L == null) {
                if (shortcutInfoCompat.getLocusId() != null) {
                    this.f33567L = shortcutInfoCompat.getLocusId();
                } else if (shortcutInfoCompat.getId() != null) {
                    this.f33567L = new LocusIdCompat(shortcutInfoCompat.getId());
                }
            }
            if (this.f33577b == null) {
                setContentTitle(shortcutInfoCompat.getShortLabel());
            }
            return this;
        }

        @NonNull
        public Builder setShowWhen(boolean z) {
            this.f33586k = z;
            return this;
        }

        @NonNull
        public Builder setSilent(boolean z) {
            this.f33574S = z;
            return this;
        }

        @NonNull
        @RequiresApi(23)
        public Builder setSmallIcon(@NonNull IconCompat iconCompat) {
            this.f33575T = iconCompat.toIcon(this.mContext);
            return this;
        }

        @NonNull
        public Builder setSortKey(@Nullable String str) {
            this.f33598w = str;
            return this;
        }

        @NonNull
        public Builder setSound(@Nullable Uri uri) {
            Notification notification = this.f33573R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder m57821e = C3870a.m57821e(C3870a.m57823c(C3870a.m57824b(), 4), 5);
            this.f33573R.audioAttributes = C3870a.m57825a(m57821e);
            return this;
        }

        @NonNull
        public Builder setStyle(@Nullable Style style) {
            if (this.f33589n != style) {
                this.f33589n = style;
                if (style != null) {
                    style.setBuilder(this);
                }
            }
            return this;
        }

        @NonNull
        public Builder setSubText(@Nullable CharSequence charSequence) {
            this.f33590o = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setTicker(@Nullable CharSequence charSequence) {
            this.f33573R.tickerText = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setTimeoutAfter(long j) {
            this.f33568M = j;
            return this;
        }

        @NonNull
        public Builder setUsesChronometer(boolean z) {
            this.f33587l = z;
            return this;
        }

        @NonNull
        public Builder setVibrate(@Nullable long[] jArr) {
            this.f33573R.vibrate = jArr;
            return this;
        }

        @NonNull
        public Builder setVisibility(int i) {
            this.f33559D = i;
            return this;
        }

        @NonNull
        public Builder setWhen(long j) {
            this.f33573R.when = j;
            return this;
        }

        @NonNull
        public Builder addAction(@Nullable Action action) {
            if (action != null) {
                this.mActions.add(action);
            }
            return this;
        }

        @NonNull
        @RequiresApi(21)
        public Builder addInvisibleAction(@Nullable Action action) {
            if (action != null) {
                this.f33576a.add(action);
            }
            return this;
        }

        @NonNull
        public Builder setSmallIcon(int i) {
            this.f33573R.icon = i;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setTicker(@Nullable CharSequence charSequence, @Nullable RemoteViews remoteViews) {
            this.f33573R.tickerText = limitCharSequenceLength(charSequence);
            this.f33581f = remoteViews;
            return this;
        }

        @NonNull
        public Builder addPerson(@Nullable Person person) {
            if (person != null) {
                this.mPersonList.add(person);
            }
            return this;
        }

        @NonNull
        public Builder setSmallIcon(int i, int i2) {
            Notification notification = this.f33573R;
            notification.icon = i;
            notification.iconLevel = i2;
            return this;
        }

        @NonNull
        public Builder setSound(@Nullable Uri uri, int i) {
            Notification notification = this.f33573R;
            notification.sound = uri;
            notification.audioStreamType = i;
            AudioAttributes.Builder m57822d = C3870a.m57822d(C3870a.m57823c(C3870a.m57824b(), 4), i);
            this.f33573R.audioAttributes = C3870a.m57825a(m57822d);
            return this;
        }

        public Builder(@NonNull Context context, @NonNull String str) {
            this.mActions = new ArrayList<>();
            this.mPersonList = new ArrayList<>();
            this.f33576a = new ArrayList();
            this.f33586k = true;
            this.f33599x = false;
            this.f33558C = 0;
            this.f33559D = 0;
            this.f33565J = 0;
            this.f33569N = 0;
            this.f33570O = 0;
            Notification notification = new Notification();
            this.f33573R = notification;
            this.mContext = context;
            this.f33564I = str;
            notification.when = System.currentTimeMillis();
            this.f33573R.audioStreamType = -1;
            this.f33585j = 0;
            this.mPeople = new ArrayList<>();
            this.f33571P = true;
        }

        @Deprecated
        public Builder(@NonNull Context context) {
            this(context, (String) null);
        }
    }

    /* loaded from: classes2.dex */
    public static class CallStyle extends Style {
        public static final int CALL_TYPE_INCOMING = 1;
        public static final int CALL_TYPE_ONGOING = 2;
        public static final int CALL_TYPE_SCREENING = 3;
        public static final int CALL_TYPE_UNKNOWN = 0;

        /* renamed from: d */
        public int f33602d;

        /* renamed from: e */
        public Person f33603e;

        /* renamed from: f */
        public PendingIntent f33604f;

        /* renamed from: g */
        public PendingIntent f33605g;

        /* renamed from: h */
        public PendingIntent f33606h;

        /* renamed from: i */
        public boolean f33607i;

        /* renamed from: j */
        public Integer f33608j;

        /* renamed from: k */
        public Integer f33609k;

        /* renamed from: l */
        public IconCompat f33610l;

        /* renamed from: m */
        public CharSequence f33611m;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* loaded from: classes2.dex */
        public @interface CallType {
        }

        /* renamed from: androidx.core.app.NotificationCompat$CallStyle$a */
        /* loaded from: classes2.dex */
        public static class C3873a {
            @DoNotInline
            /* renamed from: a */
            public static void m57809a(Notification.CallStyle callStyle, Notification.Builder builder) {
                callStyle.setBuilder(builder);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$CallStyle$b */
        /* loaded from: classes2.dex */
        public static class C3874b {
            @DoNotInline
            /* renamed from: a */
            public static Notification.Builder m57808a(Notification.Builder builder, Notification.Action action) {
                return builder.addAction(action);
            }

            @DoNotInline
            /* renamed from: b */
            public static Notification.Action.Builder m57807b(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            @DoNotInline
            /* renamed from: c */
            public static Notification.Action.Builder m57806c(Notification.Action.Builder builder, android.app.RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            @DoNotInline
            /* renamed from: d */
            public static Notification.Action m57805d(Notification.Action.Builder builder) {
                return builder.build();
            }

            @DoNotInline
            /* renamed from: e */
            public static Notification.Action.Builder m57804e(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i, charSequence, pendingIntent);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$CallStyle$c */
        /* loaded from: classes2.dex */
        public static class C3875c {
            @DoNotInline
            /* renamed from: a */
            public static Notification.Builder m57803a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            @DoNotInline
            /* renamed from: b */
            public static Notification.Builder m57802b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$CallStyle$d */
        /* loaded from: classes2.dex */
        public static class C3876d {
            @DoNotInline
            /* renamed from: a */
            public static Notification.Action.Builder m57801a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            @DoNotInline
            /* renamed from: b */
            public static void m57800b(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$CallStyle$e */
        /* loaded from: classes2.dex */
        public static class C3877e {
            @DoNotInline
            /* renamed from: a */
            public static Notification.Builder m57799a(Notification.Builder builder) {
                return builder.setActions(new Notification.Action[0]);
            }

            @DoNotInline
            /* renamed from: b */
            public static Notification.Action.Builder m57798b(Notification.Action.Builder builder, boolean z) {
                return builder.setAllowGeneratedReplies(z);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$CallStyle$f */
        /* loaded from: classes2.dex */
        public static class C3878f {
            @DoNotInline
            /* renamed from: a */
            public static Notification.Builder m57797a(Notification.Builder builder, android.app.Person person) {
                return builder.addPerson(person);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$CallStyle$g */
        /* loaded from: classes2.dex */
        public static class C3879g {
            @DoNotInline
            /* renamed from: a */
            public static Notification.CallStyle m57796a(@NonNull android.app.Person person, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            @DoNotInline
            /* renamed from: b */
            public static Notification.CallStyle m57795b(@NonNull android.app.Person person, @NonNull PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            @DoNotInline
            /* renamed from: c */
            public static Notification.CallStyle m57794c(@NonNull android.app.Person person, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            @DoNotInline
            /* renamed from: d */
            public static Notification.CallStyle m57793d(Notification.CallStyle callStyle, @ColorInt int i) {
                return callStyle.setAnswerButtonColorHint(i);
            }

            @DoNotInline
            /* renamed from: e */
            public static Notification.Action.Builder m57792e(Notification.Action.Builder builder, boolean z) {
                return builder.setAuthenticationRequired(z);
            }

            @DoNotInline
            /* renamed from: f */
            public static Notification.CallStyle m57791f(Notification.CallStyle callStyle, @ColorInt int i) {
                return callStyle.setDeclineButtonColorHint(i);
            }

            @DoNotInline
            /* renamed from: g */
            public static Notification.CallStyle m57790g(Notification.CallStyle callStyle, boolean z) {
                return callStyle.setIsVideo(z);
            }

            @DoNotInline
            /* renamed from: h */
            public static Notification.CallStyle m57789h(Notification.CallStyle callStyle, @Nullable Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            @DoNotInline
            /* renamed from: i */
            public static Notification.CallStyle m57788i(Notification.CallStyle callStyle, @Nullable CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        public CallStyle() {
        }

        @NonNull
        public static CallStyle forIncomingCall(@NonNull Person person, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "declineIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new CallStyle(1, person, null, pendingIntent, pendingIntent2);
        }

        @NonNull
        public static CallStyle forOngoingCall(@NonNull Person person, @NonNull PendingIntent pendingIntent) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            return new CallStyle(2, person, pendingIntent, null, null);
        }

        @NonNull
        public static CallStyle forScreeningCall(@NonNull Person person, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new CallStyle(3, person, pendingIntent, null, pendingIntent2);
        }

        /* renamed from: l */
        public static Notification.Action m57815l(Action action) {
            int i;
            Notification.Action.Builder m57804e;
            Bundle bundle;
            Icon icon;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                IconCompat iconCompat = action.getIconCompat();
                if (iconCompat == null) {
                    icon = null;
                } else {
                    icon = iconCompat.toIcon();
                }
                m57804e = C3876d.m57801a(icon, action.getTitle(), action.getActionIntent());
            } else {
                IconCompat iconCompat2 = action.getIconCompat();
                if (iconCompat2 != null && iconCompat2.getType() == 2) {
                    i = iconCompat2.getResId();
                } else {
                    i = 0;
                }
                m57804e = C3874b.m57804e(i, action.getTitle(), action.getActionIntent());
            }
            if (action.getExtras() != null) {
                bundle = new Bundle(action.getExtras());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
            if (i2 >= 24) {
                C3877e.m57798b(m57804e, action.getAllowGeneratedReplies());
            }
            if (i2 >= 31) {
                C3879g.m57792e(m57804e, action.isAuthenticationRequired());
            }
            C3874b.m57807b(m57804e, bundle);
            RemoteInput[] remoteInputs = action.getRemoteInputs();
            if (remoteInputs != null) {
                for (android.app.RemoteInput remoteInput : RemoteInput.m57646b(remoteInputs)) {
                    C3874b.m57806c(m57804e, remoteInput);
                }
            }
            return C3874b.m57805d(m57804e);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void addCompatExtras(@NonNull Bundle bundle) {
            super.addCompatExtras(bundle);
            bundle.putInt(NotificationCompat.EXTRA_CALL_TYPE, this.f33602d);
            bundle.putBoolean(NotificationCompat.EXTRA_CALL_IS_VIDEO, this.f33607i);
            Person person = this.f33603e;
            if (person != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable(NotificationCompat.EXTRA_CALL_PERSON, person.toAndroidPerson());
                } else {
                    bundle.putParcelable(NotificationCompat.EXTRA_CALL_PERSON_COMPAT, person.toBundle());
                }
            }
            IconCompat iconCompat = this.f33610l;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    bundle.putParcelable(NotificationCompat.EXTRA_VERIFICATION_ICON, iconCompat.toIcon(this.mBuilder.mContext));
                } else {
                    bundle.putParcelable(NotificationCompat.EXTRA_VERIFICATION_ICON_COMPAT, iconCompat.toBundle());
                }
            }
            bundle.putCharSequence(NotificationCompat.EXTRA_VERIFICATION_TEXT, this.f33611m);
            bundle.putParcelable(NotificationCompat.EXTRA_ANSWER_INTENT, this.f33604f);
            bundle.putParcelable(NotificationCompat.EXTRA_DECLINE_INTENT, this.f33605g);
            bundle.putParcelable(NotificationCompat.EXTRA_HANG_UP_INTENT, this.f33606h);
            Integer num = this.f33608j;
            if (num != null) {
                bundle.putInt(NotificationCompat.EXTRA_ANSWER_COLOR, num.intValue());
            }
            Integer num2 = this.f33609k;
            if (num2 != null) {
                bundle.putInt(NotificationCompat.EXTRA_DECLINE_COLOR, num2.intValue());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            CharSequence charSequence;
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequence2 = null;
            r2 = null;
            Notification.CallStyle m57796a = null;
            charSequence2 = null;
            if (i >= 31) {
                int i2 = this.f33602d;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (Log.isLoggable("NotifCompat", 3)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Unrecognized call type in CallStyle: ");
                                sb.append(String.valueOf(this.f33602d));
                            }
                        } else {
                            m57796a = C3879g.m57794c(this.f33603e.toAndroidPerson(), this.f33606h, this.f33604f);
                        }
                    } else {
                        m57796a = C3879g.m57795b(this.f33603e.toAndroidPerson(), this.f33606h);
                    }
                } else {
                    m57796a = C3879g.m57796a(this.f33603e.toAndroidPerson(), this.f33605g, this.f33604f);
                }
                if (m57796a != null) {
                    C3877e.m57799a(notificationBuilderWithBuilderAccessor.getBuilder());
                    C3873a.m57809a(m57796a, notificationBuilderWithBuilderAccessor.getBuilder());
                    Integer num = this.f33608j;
                    if (num != null) {
                        C3879g.m57793d(m57796a, num.intValue());
                    }
                    Integer num2 = this.f33609k;
                    if (num2 != null) {
                        C3879g.m57791f(m57796a, num2.intValue());
                    }
                    C3879g.m57788i(m57796a, this.f33611m);
                    IconCompat iconCompat = this.f33610l;
                    if (iconCompat != null) {
                        C3879g.m57789h(m57796a, iconCompat.toIcon(this.mBuilder.mContext));
                    }
                    C3879g.m57790g(m57796a, this.f33607i);
                    return;
                }
                return;
            }
            Notification.Builder builder = notificationBuilderWithBuilderAccessor.getBuilder();
            Person person = this.f33603e;
            if (person != null) {
                charSequence = person.getName();
            } else {
                charSequence = null;
            }
            builder.setContentTitle(charSequence);
            Bundle bundle = this.mBuilder.f33557B;
            if (bundle != null && bundle.containsKey(NotificationCompat.EXTRA_TEXT)) {
                charSequence2 = this.mBuilder.f33557B.getCharSequence(NotificationCompat.EXTRA_TEXT);
            }
            if (charSequence2 == null) {
                charSequence2 = m57814m();
            }
            builder.setContentText(charSequence2);
            Person person2 = this.f33603e;
            if (person2 != null) {
                if (i >= 23 && person2.getIcon() != null) {
                    C3876d.m57800b(builder, this.f33603e.getIcon().toIcon(this.mBuilder.mContext));
                }
                if (i >= 28) {
                    C3878f.m57797a(builder, this.f33603e.toAndroidPerson());
                } else {
                    C3875c.m57803a(builder, this.f33603e.getUri());
                }
            }
            ArrayList<Action> actionsListWithSystemActions = getActionsListWithSystemActions();
            if (i >= 24) {
                C3877e.m57799a(builder);
            }
            for (Action action : actionsListWithSystemActions) {
                C3874b.m57808a(builder, m57815l(action));
            }
            C3875c.m57802b(builder, NotificationCompat.CATEGORY_CALL);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean displayCustomViewInline() {
            return true;
        }

        @NonNull
        @RequiresApi(20)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<Action> getActionsListWithSystemActions() {
            Action m57810q = m57810q();
            Action m57811p = m57811p();
            ArrayList<Action> arrayList = new ArrayList<>(3);
            arrayList.add(m57810q);
            ArrayList<Action> arrayList2 = this.mBuilder.mActions;
            int i = 2;
            if (arrayList2 != null) {
                for (Action action : arrayList2) {
                    if (action.isContextual()) {
                        arrayList.add(action);
                    } else if (!m57813n(action) && i > 1) {
                        arrayList.add(action);
                        i--;
                    }
                    if (m57811p != null && i == 1) {
                        arrayList.add(m57811p);
                        i--;
                    }
                }
            }
            if (m57811p != null && i >= 1) {
                arrayList.add(m57811p);
            }
            return arrayList;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        /* renamed from: m */
        public final String m57814m() {
            int i = this.f33602d;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return this.mBuilder.mContext.getResources().getString(R.string.call_notification_screening_text);
                }
                return this.mBuilder.mContext.getResources().getString(R.string.call_notification_ongoing_text);
            }
            return this.mBuilder.mContext.getResources().getString(R.string.call_notification_incoming_text);
        }

        /* renamed from: n */
        public final boolean m57813n(Action action) {
            if (action != null && action.getExtras().getBoolean("key_action_priority")) {
                return true;
            }
            return false;
        }

        /* renamed from: o */
        public final Action m57812o(int i, int i2, Integer num, int i3, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(ContextCompat.getColor(this.mBuilder.mContext, i3));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.mBuilder.mContext.getResources().getString(i2));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            Action build = new Action.Builder(IconCompat.createWithResource(this.mBuilder.mContext, i), spannableStringBuilder, pendingIntent).build();
            build.getExtras().putBoolean("key_action_priority", true);
            return build;
        }

        /* renamed from: p */
        public final Action m57811p() {
            int i;
            int i2;
            int i3 = R.drawable.ic_call_answer_video;
            int i4 = R.drawable.ic_call_answer;
            PendingIntent pendingIntent = this.f33604f;
            if (pendingIntent == null) {
                return null;
            }
            boolean z = this.f33607i;
            if (z) {
                i = i3;
            } else {
                i = i4;
            }
            if (z) {
                i2 = R.string.call_notification_answer_video_action;
            } else {
                i2 = R.string.call_notification_answer_action;
            }
            return m57812o(i, i2, this.f33608j, R.color.call_notification_answer_color, pendingIntent);
        }

        /* renamed from: q */
        public final Action m57810q() {
            int i = R.drawable.ic_call_decline;
            PendingIntent pendingIntent = this.f33605g;
            if (pendingIntent == null) {
                return m57812o(i, R.string.call_notification_hang_up_action, this.f33609k, R.color.call_notification_decline_color, this.f33606h);
            }
            return m57812o(i, R.string.call_notification_decline_action, this.f33609k, R.color.call_notification_decline_color, pendingIntent);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            Integer num;
            super.restoreFromCompatExtras(bundle);
            this.f33602d = bundle.getInt(NotificationCompat.EXTRA_CALL_TYPE);
            this.f33607i = bundle.getBoolean(NotificationCompat.EXTRA_CALL_IS_VIDEO);
            int i = Build.VERSION.SDK_INT;
            if (i >= 28 && bundle.containsKey(NotificationCompat.EXTRA_CALL_PERSON)) {
                this.f33603e = Person.fromAndroidPerson(WI0.m65642a(bundle.getParcelable(NotificationCompat.EXTRA_CALL_PERSON)));
            } else if (bundle.containsKey(NotificationCompat.EXTRA_CALL_PERSON_COMPAT)) {
                this.f33603e = Person.fromBundle(bundle.getBundle(NotificationCompat.EXTRA_CALL_PERSON_COMPAT));
            }
            if (i >= 23 && bundle.containsKey(NotificationCompat.EXTRA_VERIFICATION_ICON)) {
                this.f33610l = IconCompat.createFromIcon(YI0.m65369a(bundle.getParcelable(NotificationCompat.EXTRA_VERIFICATION_ICON)));
            } else if (bundle.containsKey(NotificationCompat.EXTRA_VERIFICATION_ICON_COMPAT)) {
                this.f33610l = IconCompat.createFromBundle(bundle.getBundle(NotificationCompat.EXTRA_VERIFICATION_ICON_COMPAT));
            }
            this.f33611m = bundle.getCharSequence(NotificationCompat.EXTRA_VERIFICATION_TEXT);
            this.f33604f = (PendingIntent) bundle.getParcelable(NotificationCompat.EXTRA_ANSWER_INTENT);
            this.f33605g = (PendingIntent) bundle.getParcelable(NotificationCompat.EXTRA_DECLINE_INTENT);
            this.f33606h = (PendingIntent) bundle.getParcelable(NotificationCompat.EXTRA_HANG_UP_INTENT);
            Integer num2 = null;
            if (bundle.containsKey(NotificationCompat.EXTRA_ANSWER_COLOR)) {
                num = Integer.valueOf(bundle.getInt(NotificationCompat.EXTRA_ANSWER_COLOR));
            } else {
                num = null;
            }
            this.f33608j = num;
            if (bundle.containsKey(NotificationCompat.EXTRA_DECLINE_COLOR)) {
                num2 = Integer.valueOf(bundle.getInt(NotificationCompat.EXTRA_DECLINE_COLOR));
            }
            this.f33609k = num2;
        }

        @NonNull
        public CallStyle setAnswerButtonColorHint(@ColorInt int i) {
            this.f33608j = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public CallStyle setDeclineButtonColorHint(@ColorInt int i) {
            this.f33609k = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public CallStyle setIsVideo(boolean z) {
            this.f33607i = z;
            return this;
        }

        @NonNull
        @RequiresApi(23)
        public CallStyle setVerificationIcon(@Nullable Icon icon) {
            this.f33610l = icon == null ? null : IconCompat.createFromIcon(icon);
            return this;
        }

        @NonNull
        public CallStyle setVerificationText(@Nullable CharSequence charSequence) {
            this.f33611m = charSequence;
            return this;
        }

        public CallStyle(@Nullable Builder builder) {
            setBuilder(builder);
        }

        @NonNull
        public CallStyle setVerificationIcon(@Nullable Bitmap bitmap) {
            this.f33610l = IconCompat.createWithBitmap(bitmap);
            return this;
        }

        public CallStyle(int i, Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
            if (person != null && !TextUtils.isEmpty(person.getName())) {
                this.f33602d = i;
                this.f33603e = person;
                this.f33604f = pendingIntent3;
                this.f33605g = pendingIntent2;
                this.f33606h = pendingIntent;
                return;
            }
            throw new IllegalArgumentException("person must have a non-empty a name");
        }
    }

    /* loaded from: classes2.dex */
    public static class DecoratedCustomViewStyle extends Style {

        /* renamed from: androidx.core.app.NotificationCompat$DecoratedCustomViewStyle$a */
        /* loaded from: classes2.dex */
        public static class C3882a {
            @DoNotInline
            /* renamed from: a */
            public static void m57770a(RemoteViews remoteViews, int i, CharSequence charSequence) {
                remoteViews.setContentDescription(i, charSequence);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$DecoratedCustomViewStyle$b */
        /* loaded from: classes2.dex */
        public static class C3883b {
            @DoNotInline
            /* renamed from: a */
            public static Notification.Builder m57769a(Notification.Builder builder, Object obj) {
                return builder.setStyle((Notification.Style) obj);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$DecoratedCustomViewStyle$c */
        /* loaded from: classes2.dex */
        public static class C3884c {
            @DoNotInline
            /* renamed from: a */
            public static Notification.DecoratedCustomViewStyle m57768a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        /* renamed from: n */
        public static List m57771n(List list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Action action = (Action) it.next();
                if (!action.isContextual()) {
                    arrayList.add(action);
                }
            }
            return arrayList;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 24) {
                C3883b.m57769a(notificationBuilderWithBuilderAccessor.getBuilder(), C3884c.m57768a());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean displayCustomViewInline() {
            return true;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        /* renamed from: l */
        public final RemoteViews m57773l(RemoteViews remoteViews, boolean z) {
            int min;
            int i = 0;
            RemoteViews applyStandardTemplate = applyStandardTemplate(true, R.layout.notification_template_custom_big, false);
            applyStandardTemplate.removeAllViews(R.id.actions);
            List m57771n = m57771n(this.mBuilder.mActions);
            if (z && m57771n != null && (min = Math.min(m57771n.size(), 3)) > 0) {
                for (int i2 = 0; i2 < min; i2++) {
                    applyStandardTemplate.addView(R.id.actions, m57772m((Action) m57771n.get(i2)));
                }
            } else {
                i = 8;
            }
            applyStandardTemplate.setViewVisibility(R.id.actions, i);
            applyStandardTemplate.setViewVisibility(R.id.action_divider, i);
            buildIntoRemoteViews(applyStandardTemplate, remoteViews);
            return applyStandardTemplate;
        }

        /* renamed from: m */
        public final RemoteViews m57772m(Action action) {
            boolean z;
            int i;
            if (action.actionIntent == null) {
                z = true;
            } else {
                z = false;
            }
            String packageName = this.mBuilder.mContext.getPackageName();
            if (z) {
                i = R.layout.notification_action_tombstone;
            } else {
                i = R.layout.notification_action;
            }
            RemoteViews remoteViews = new RemoteViews(packageName, i);
            IconCompat iconCompat = action.getIconCompat();
            if (iconCompat != null) {
                remoteViews.setImageViewBitmap(R.id.action_image, m57734h(iconCompat, R.color.notification_action_color_filter));
            }
            remoteViews.setTextViewText(R.id.action_text, action.title);
            if (!z) {
                remoteViews.setOnClickPendingIntent(R.id.action_container, action.actionIntent);
            }
            C3882a.m57770a(remoteViews, R.id.action_container, action.title);
            return remoteViews;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews bigContentView = this.mBuilder.getBigContentView();
            if (bigContentView == null) {
                bigContentView = this.mBuilder.getContentView();
            }
            if (bigContentView == null) {
                return null;
            }
            return m57773l(bigContentView, true);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 24 || this.mBuilder.getContentView() == null) {
                return null;
            }
            return m57773l(this.mBuilder.getContentView(), false);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            RemoteViews contentView;
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews headsUpContentView = this.mBuilder.getHeadsUpContentView();
            if (headsUpContentView != null) {
                contentView = headsUpContentView;
            } else {
                contentView = this.mBuilder.getContentView();
            }
            if (headsUpContentView == null) {
                return null;
            }
            return m57773l(contentView, true);
        }
    }

    /* loaded from: classes2.dex */
    public interface Extender {
        @NonNull
        Builder extend(@NonNull Builder builder);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface GroupAlertBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface NotificationVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface ServiceNotificationBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface StreamType {
    }

    /* loaded from: classes2.dex */
    public static abstract class Style {

        /* renamed from: a */
        public CharSequence f33639a;

        /* renamed from: b */
        public CharSequence f33640b;

        /* renamed from: c */
        public boolean f33641c = false;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected Builder mBuilder;

        /* renamed from: androidx.core.app.NotificationCompat$Style$a */
        /* loaded from: classes2.dex */
        public static class C3892a {
            @DoNotInline
            /* renamed from: a */
            public static void m57730a(RemoteViews remoteViews, int i, int i2, float f) {
                remoteViews.setTextViewTextSize(i, i2, f);
            }

            @DoNotInline
            /* renamed from: b */
            public static void m57729b(RemoteViews remoteViews, int i, int i2, int i3, int i4, int i5) {
                remoteViews.setViewPadding(i, i2, i3, i4, i5);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$Style$b */
        /* loaded from: classes2.dex */
        public static class C3893b {
            @DoNotInline
            /* renamed from: a */
            public static void m57728a(RemoteViews remoteViews, int i, boolean z) {
                remoteViews.setChronometerCountDown(i, z);
            }
        }

        /* renamed from: b */
        public static float m57740b(float f, float f2, float f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }

        /* renamed from: c */
        public static Style m57739c(String str) {
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -716705180:
                        if (str.equals("androidx.core.app.NotificationCompat$DecoratedCustomViewStyle")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -171946061:
                        if (str.equals("androidx.core.app.NotificationCompat$BigPictureStyle")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 714386739:
                        if (str.equals("androidx.core.app.NotificationCompat$CallStyle")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 912942987:
                        if (str.equals("androidx.core.app.NotificationCompat$InboxStyle")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 919595044:
                        if (str.equals("androidx.core.app.NotificationCompat$BigTextStyle")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 2090799565:
                        if (str.equals("androidx.core.app.NotificationCompat$MessagingStyle")) {
                            c = 5;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new DecoratedCustomViewStyle();
                    case 1:
                        return new BigPictureStyle();
                    case 2:
                        return new CallStyle();
                    case 3:
                        return new InboxStyle();
                    case 4:
                        return new BigTextStyle();
                    case 5:
                        return new MessagingStyle();
                    default:
                        return null;
                }
            }
            return null;
        }

        /* renamed from: d */
        public static Style m57738d(String str) {
            if (str == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new BigPictureStyle();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new BigTextStyle();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new InboxStyle();
            }
            if (i >= 24) {
                if (str.equals(AbstractC19332cJ0.m51697a().getName())) {
                    return new MessagingStyle();
                }
                if (str.equals(AbstractC19504dJ0.m31907a().getName())) {
                    return new DecoratedCustomViewStyle();
                }
            }
            return null;
        }

        /* renamed from: e */
        public static Style m57737e(Bundle bundle) {
            Style m57739c = m57739c(bundle.getString(NotificationCompat.EXTRA_COMPAT_TEMPLATE));
            if (m57739c != null) {
                return m57739c;
            }
            if (!bundle.containsKey(NotificationCompat.EXTRA_SELF_DISPLAY_NAME) && !bundle.containsKey(NotificationCompat.EXTRA_MESSAGING_STYLE_USER)) {
                if (!bundle.containsKey(NotificationCompat.EXTRA_PICTURE) && !bundle.containsKey(NotificationCompat.EXTRA_PICTURE_ICON)) {
                    if (bundle.containsKey(NotificationCompat.EXTRA_BIG_TEXT)) {
                        return new BigTextStyle();
                    }
                    if (bundle.containsKey(NotificationCompat.EXTRA_TEXT_LINES)) {
                        return new InboxStyle();
                    }
                    if (bundle.containsKey(NotificationCompat.EXTRA_CALL_TYPE)) {
                        return new CallStyle();
                    }
                    return m57738d(bundle.getString(NotificationCompat.EXTRA_TEMPLATE));
                }
                return new BigPictureStyle();
            }
            return new MessagingStyle();
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static Style extractStyleFromNotification(@NonNull Notification notification) {
            Bundle extras = NotificationCompat.getExtras(notification);
            if (extras == null) {
                return null;
            }
            return m57736f(extras);
        }

        /* renamed from: f */
        public static Style m57736f(Bundle bundle) {
            Style m57737e = m57737e(bundle);
            if (m57737e == null) {
                return null;
            }
            try {
                m57737e.restoreFromCompatExtras(bundle);
                return m57737e;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        /* renamed from: a */
        public final int m57741a() {
            Resources resources = this.mBuilder.mContext.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_top_pad);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.notification_top_pad_large_text);
            float m57740b = (m57740b(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - m57740b) * dimensionPixelSize) + (m57740b * dimensionPixelSize2));
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void addCompatExtras(@NonNull Bundle bundle) {
            if (this.f33641c) {
                bundle.putCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT, this.f33640b);
            }
            CharSequence charSequence = this.f33639a;
            if (charSequence != null) {
                bundle.putCharSequence(NotificationCompat.EXTRA_TITLE_BIG, charSequence);
            }
            String className = getClassName();
            if (className != null) {
                bundle.putString(NotificationCompat.EXTRA_COMPAT_TEMPLATE, className);
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0191  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0196  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0198  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01a2  */
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.widget.RemoteViews applyStandardTemplate(boolean r13, int r14, boolean r15) {
            /*
                Method dump skipped, instructions count: 424
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat.Style.applyStandardTemplate(boolean, int, boolean):android.widget.RemoteViews");
        }

        @Nullable
        public Notification build() {
            Builder builder = this.mBuilder;
            if (builder != null) {
                return builder.build();
            }
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void buildIntoRemoteViews(RemoteViews remoteViews, RemoteViews remoteViews2) {
            m57731k(remoteViews);
            remoteViews.removeAllViews(R.id.notification_main_column);
            remoteViews.addView(R.id.notification_main_column, remoteViews2.clone());
            remoteViews.setViewVisibility(R.id.notification_main_column, 0);
            C3892a.m57729b(remoteViews, R.id.notification_main_column_container, 0, m57741a(), 0, 0);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle) {
            bundle.remove(NotificationCompat.EXTRA_SUMMARY_TEXT);
            bundle.remove(NotificationCompat.EXTRA_TITLE_BIG);
            bundle.remove(NotificationCompat.EXTRA_COMPAT_TEMPLATE);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Bitmap createColoredBitmap(int i, int i2) {
            return m57735g(i, i2, 0);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean displayCustomViewInline() {
            return false;
        }

        /* renamed from: g */
        public final Bitmap m57735g(int i, int i2, int i3) {
            return m57733i(IconCompat.createWithResource(this.mBuilder.mContext, i), i2, i3);
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return null;
        }

        /* renamed from: h */
        public Bitmap m57734h(IconCompat iconCompat, int i) {
            return m57733i(iconCompat, i, 0);
        }

        /* renamed from: i */
        public final Bitmap m57733i(IconCompat iconCompat, int i, int i2) {
            int i3;
            Drawable loadDrawable = iconCompat.loadDrawable(this.mBuilder.mContext);
            if (i2 == 0) {
                i3 = loadDrawable.getIntrinsicWidth();
            } else {
                i3 = i2;
            }
            if (i2 == 0) {
                i2 = loadDrawable.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
            loadDrawable.setBounds(0, 0, i3, i2);
            if (i != 0) {
                loadDrawable.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            loadDrawable.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        /* renamed from: j */
        public final Bitmap m57732j(int i, int i2, int i3, int i4) {
            int i5 = R.drawable.notification_icon_background;
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap m57735g = m57735g(i5, i4, i2);
            Canvas canvas = new Canvas(m57735g);
            Drawable mutate = this.mBuilder.mContext.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            mutate.setBounds(i6, i6, i7, i7);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return m57735g;
        }

        /* renamed from: k */
        public final void m57731k(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(R.id.title, 8);
            remoteViews.setViewVisibility(R.id.text2, 8);
            remoteViews.setViewVisibility(R.id.text, 8);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            if (bundle.containsKey(NotificationCompat.EXTRA_SUMMARY_TEXT)) {
                this.f33640b = bundle.getCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT);
                this.f33641c = true;
            }
            this.f33639a = bundle.getCharSequence(NotificationCompat.EXTRA_TITLE_BIG);
        }

        public void setBuilder(@Nullable Builder builder) {
            if (this.mBuilder != builder) {
                this.mBuilder = builder;
                if (builder != null) {
                    builder.setStyle(this);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class WearableExtender implements Extender {
        @Deprecated
        public static final int SCREEN_TIMEOUT_LONG = -1;
        @Deprecated
        public static final int SCREEN_TIMEOUT_SHORT = 0;
        @Deprecated
        public static final int SIZE_DEFAULT = 0;
        @Deprecated
        public static final int SIZE_FULL_SCREEN = 5;
        @Deprecated
        public static final int SIZE_LARGE = 4;
        @Deprecated
        public static final int SIZE_MEDIUM = 3;
        @Deprecated
        public static final int SIZE_SMALL = 2;
        @Deprecated
        public static final int SIZE_XSMALL = 1;
        public static final int UNSET_ACTION_INDEX = -1;

        /* renamed from: a */
        public ArrayList f33642a;

        /* renamed from: b */
        public int f33643b;

        /* renamed from: c */
        public PendingIntent f33644c;

        /* renamed from: d */
        public ArrayList f33645d;

        /* renamed from: e */
        public Bitmap f33646e;

        /* renamed from: f */
        public int f33647f;

        /* renamed from: g */
        public int f33648g;

        /* renamed from: h */
        public int f33649h;

        /* renamed from: i */
        public int f33650i;

        /* renamed from: j */
        public int f33651j;

        /* renamed from: k */
        public int f33652k;

        /* renamed from: l */
        public int f33653l;

        /* renamed from: m */
        public String f33654m;

        /* renamed from: n */
        public String f33655n;

        /* renamed from: androidx.core.app.NotificationCompat$WearableExtender$a */
        /* loaded from: classes2.dex */
        public static class C3894a {
            @DoNotInline
            /* renamed from: a */
            public static Notification.Action.Builder m57725a(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            @DoNotInline
            /* renamed from: b */
            public static Notification.Action.Builder m57724b(Notification.Action.Builder builder, android.app.RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            @DoNotInline
            /* renamed from: c */
            public static Notification.Action m57723c(Notification.Action.Builder builder) {
                return builder.build();
            }

            @DoNotInline
            /* renamed from: d */
            public static Notification.Action.Builder m57722d(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i, charSequence, pendingIntent);
            }

            @DoNotInline
            /* renamed from: e */
            public static Action m57721e(ArrayList<Parcelable> arrayList, int i) {
                return NotificationCompat.m57859a((Notification.Action) arrayList.get(i));
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$WearableExtender$b */
        /* loaded from: classes2.dex */
        public static class C3895b {
            @DoNotInline
            /* renamed from: a */
            public static Notification.Action.Builder m57720a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$WearableExtender$c */
        /* loaded from: classes2.dex */
        public static class C3896c {
            @DoNotInline
            /* renamed from: a */
            public static Notification.Action.Builder m57719a(Notification.Action.Builder builder, boolean z) {
                return builder.setAllowGeneratedReplies(z);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$WearableExtender$d */
        /* loaded from: classes2.dex */
        public static class C3897d {
            @DoNotInline
            /* renamed from: a */
            public static Notification.Action.Builder m57718a(Notification.Action.Builder builder, boolean z) {
                return builder.setAuthenticationRequired(z);
            }
        }

        public WearableExtender() {
            this.f33642a = new ArrayList();
            this.f33643b = 1;
            this.f33645d = new ArrayList();
            this.f33648g = GravityCompat.END;
            this.f33649h = -1;
            this.f33650i = 0;
            this.f33652k = 80;
        }

        /* renamed from: a */
        public static Notification.Action m57727a(Action action) {
            int i;
            Notification.Action.Builder m57722d;
            Bundle bundle;
            Icon icon;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                IconCompat iconCompat = action.getIconCompat();
                if (iconCompat == null) {
                    icon = null;
                } else {
                    icon = iconCompat.toIcon();
                }
                m57722d = C3895b.m57720a(icon, action.getTitle(), action.getActionIntent());
            } else {
                IconCompat iconCompat2 = action.getIconCompat();
                if (iconCompat2 != null && iconCompat2.getType() == 2) {
                    i = iconCompat2.getResId();
                } else {
                    i = 0;
                }
                m57722d = C3894a.m57722d(i, action.getTitle(), action.getActionIntent());
            }
            if (action.getExtras() != null) {
                bundle = new Bundle(action.getExtras());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
            if (i2 >= 24) {
                C3896c.m57719a(m57722d, action.getAllowGeneratedReplies());
            }
            if (i2 >= 31) {
                C3897d.m57718a(m57722d, action.isAuthenticationRequired());
            }
            C3894a.m57725a(m57722d, bundle);
            RemoteInput[] remoteInputs = action.getRemoteInputs();
            if (remoteInputs != null) {
                for (android.app.RemoteInput remoteInput : RemoteInput.m57646b(remoteInputs)) {
                    C3894a.m57724b(m57722d, remoteInput);
                }
            }
            return C3894a.m57723c(m57722d);
        }

        @NonNull
        public WearableExtender addAction(@NonNull Action action) {
            this.f33642a.add(action);
            return this;
        }

        @NonNull
        public WearableExtender addActions(@NonNull List<Action> list) {
            this.f33642a.addAll(list);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender addPage(@NonNull Notification notification) {
            this.f33645d.add(notification);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender addPages(@NonNull List<Notification> list) {
            this.f33645d.addAll(list);
            return this;
        }

        /* renamed from: b */
        public final void m57726b(int i, boolean z) {
            if (z) {
                this.f33643b = i | this.f33643b;
                return;
            }
            this.f33643b = (~i) & this.f33643b;
        }

        @NonNull
        public WearableExtender clearActions() {
            this.f33642a.clear();
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender clearPages() {
            this.f33645d.clear();
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        @NonNull
        public Builder extend(@NonNull Builder builder) {
            Bundle bundle = new Bundle();
            if (!this.f33642a.isEmpty()) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f33642a.size());
                Iterator it = this.f33642a.iterator();
                while (it.hasNext()) {
                    arrayList.add(m57727a((Action) it.next()));
                }
                bundle.putParcelableArrayList("actions", arrayList);
            }
            int i = this.f33643b;
            if (i != 1) {
                bundle.putInt("flags", i);
            }
            PendingIntent pendingIntent = this.f33644c;
            if (pendingIntent != null) {
                bundle.putParcelable("displayIntent", pendingIntent);
            }
            if (!this.f33645d.isEmpty()) {
                ArrayList arrayList2 = this.f33645d;
                bundle.putParcelableArray("pages", (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            Bitmap bitmap = this.f33646e;
            if (bitmap != null) {
                bundle.putParcelable("background", bitmap);
            }
            int i2 = this.f33647f;
            if (i2 != 0) {
                bundle.putInt("contentIcon", i2);
            }
            int i3 = this.f33648g;
            if (i3 != 8388613) {
                bundle.putInt("contentIconGravity", i3);
            }
            int i4 = this.f33649h;
            if (i4 != -1) {
                bundle.putInt("contentActionIndex", i4);
            }
            int i5 = this.f33650i;
            if (i5 != 0) {
                bundle.putInt("customSizePreset", i5);
            }
            int i6 = this.f33651j;
            if (i6 != 0) {
                bundle.putInt("customContentHeight", i6);
            }
            int i7 = this.f33652k;
            if (i7 != 80) {
                bundle.putInt("gravity", i7);
            }
            int i8 = this.f33653l;
            if (i8 != 0) {
                bundle.putInt("hintScreenTimeout", i8);
            }
            String str = this.f33654m;
            if (str != null) {
                bundle.putString("dismissalId", str);
            }
            String str2 = this.f33655n;
            if (str2 != null) {
                bundle.putString("bridgeTag", str2);
            }
            builder.getExtras().putBundle("android.wearable.EXTENSIONS", bundle);
            return builder;
        }

        @NonNull
        public List<Action> getActions() {
            return this.f33642a;
        }

        @Nullable
        @Deprecated
        public Bitmap getBackground() {
            return this.f33646e;
        }

        @Nullable
        public String getBridgeTag() {
            return this.f33655n;
        }

        public int getContentAction() {
            return this.f33649h;
        }

        @Deprecated
        public int getContentIcon() {
            return this.f33647f;
        }

        @Deprecated
        public int getContentIconGravity() {
            return this.f33648g;
        }

        public boolean getContentIntentAvailableOffline() {
            if ((this.f33643b & 1) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public int getCustomContentHeight() {
            return this.f33651j;
        }

        @Deprecated
        public int getCustomSizePreset() {
            return this.f33650i;
        }

        @Nullable
        public String getDismissalId() {
            return this.f33654m;
        }

        @Nullable
        @Deprecated
        public PendingIntent getDisplayIntent() {
            return this.f33644c;
        }

        @Deprecated
        public int getGravity() {
            return this.f33652k;
        }

        @Deprecated
        public boolean getHintAmbientBigPicture() {
            if ((this.f33643b & 32) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public boolean getHintAvoidBackgroundClipping() {
            if ((this.f33643b & 16) != 0) {
                return true;
            }
            return false;
        }

        public boolean getHintContentIntentLaunchesActivity() {
            if ((this.f33643b & 64) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public boolean getHintHideIcon() {
            if ((this.f33643b & 2) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public int getHintScreenTimeout() {
            return this.f33653l;
        }

        @Deprecated
        public boolean getHintShowBackgroundOnly() {
            if ((this.f33643b & 4) != 0) {
                return true;
            }
            return false;
        }

        @NonNull
        @Deprecated
        public List<Notification> getPages() {
            return this.f33645d;
        }

        public boolean getStartScrollBottom() {
            if ((this.f33643b & 8) != 0) {
                return true;
            }
            return false;
        }

        @NonNull
        @Deprecated
        public WearableExtender setBackground(@Nullable Bitmap bitmap) {
            this.f33646e = bitmap;
            return this;
        }

        @NonNull
        public WearableExtender setBridgeTag(@Nullable String str) {
            this.f33655n = str;
            return this;
        }

        @NonNull
        public WearableExtender setContentAction(int i) {
            this.f33649h = i;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setContentIcon(int i) {
            this.f33647f = i;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setContentIconGravity(int i) {
            this.f33648g = i;
            return this;
        }

        @NonNull
        public WearableExtender setContentIntentAvailableOffline(boolean z) {
            m57726b(1, z);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setCustomContentHeight(int i) {
            this.f33651j = i;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setCustomSizePreset(int i) {
            this.f33650i = i;
            return this;
        }

        @NonNull
        public WearableExtender setDismissalId(@Nullable String str) {
            this.f33654m = str;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setDisplayIntent(@Nullable PendingIntent pendingIntent) {
            this.f33644c = pendingIntent;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setGravity(int i) {
            this.f33652k = i;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setHintAmbientBigPicture(boolean z) {
            m57726b(32, z);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setHintAvoidBackgroundClipping(boolean z) {
            m57726b(16, z);
            return this;
        }

        @NonNull
        public WearableExtender setHintContentIntentLaunchesActivity(boolean z) {
            m57726b(64, z);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setHintHideIcon(boolean z) {
            m57726b(2, z);
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setHintScreenTimeout(int i) {
            this.f33653l = i;
            return this;
        }

        @NonNull
        @Deprecated
        public WearableExtender setHintShowBackgroundOnly(boolean z) {
            m57726b(4, z);
            return this;
        }

        @NonNull
        public WearableExtender setStartScrollBottom(boolean z) {
            m57726b(8, z);
            return this;
        }

        @NonNull
        /* renamed from: clone */
        public WearableExtender m73906clone() {
            WearableExtender wearableExtender = new WearableExtender();
            wearableExtender.f33642a = new ArrayList(this.f33642a);
            wearableExtender.f33643b = this.f33643b;
            wearableExtender.f33644c = this.f33644c;
            wearableExtender.f33645d = new ArrayList(this.f33645d);
            wearableExtender.f33646e = this.f33646e;
            wearableExtender.f33647f = this.f33647f;
            wearableExtender.f33648g = this.f33648g;
            wearableExtender.f33649h = this.f33649h;
            wearableExtender.f33650i = this.f33650i;
            wearableExtender.f33651j = this.f33651j;
            wearableExtender.f33652k = this.f33652k;
            wearableExtender.f33653l = this.f33653l;
            wearableExtender.f33654m = this.f33654m;
            wearableExtender.f33655n = this.f33655n;
            return wearableExtender;
        }

        public WearableExtender(@NonNull Notification notification) {
            this.f33642a = new ArrayList();
            this.f33643b = 1;
            this.f33645d = new ArrayList();
            this.f33648g = GravityCompat.END;
            this.f33649h = -1;
            this.f33650i = 0;
            this.f33652k = 80;
            Bundle extras = NotificationCompat.getExtras(notification);
            Bundle bundle = extras != null ? extras.getBundle("android.wearable.EXTENSIONS") : null;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("actions");
                if (parcelableArrayList != null) {
                    int size = parcelableArrayList.size();
                    Action[] actionArr = new Action[size];
                    for (int i = 0; i < size; i++) {
                        actionArr[i] = C3894a.m57721e(parcelableArrayList, i);
                    }
                    Collections.addAll(this.f33642a, actionArr);
                }
                this.f33643b = bundle.getInt("flags", 1);
                this.f33644c = (PendingIntent) bundle.getParcelable("displayIntent");
                Notification[] m57857c = NotificationCompat.m57857c(bundle, "pages");
                if (m57857c != null) {
                    Collections.addAll(this.f33645d, m57857c);
                }
                this.f33646e = (Bitmap) bundle.getParcelable("background");
                this.f33647f = bundle.getInt("contentIcon");
                this.f33648g = bundle.getInt("contentIconGravity", GravityCompat.END);
                this.f33649h = bundle.getInt("contentActionIndex", -1);
                this.f33650i = bundle.getInt("customSizePreset", 0);
                this.f33651j = bundle.getInt("customContentHeight");
                this.f33652k = bundle.getInt("gravity", 80);
                this.f33653l = bundle.getInt("hintScreenTimeout");
                this.f33654m = bundle.getString("dismissalId");
                this.f33655n = bundle.getString("bridgeTag");
            }
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$b */
    /* loaded from: classes2.dex */
    public static class C3899b {
        @DoNotInline
        /* renamed from: a */
        public static boolean m57717a(android.app.RemoteInput remoteInput) {
            return remoteInput.getAllowFreeFormInput();
        }

        @DoNotInline
        /* renamed from: b */
        public static CharSequence[] m57716b(android.app.RemoteInput remoteInput) {
            return remoteInput.getChoices();
        }

        @DoNotInline
        /* renamed from: c */
        public static Bundle m57715c(Notification.Action action) {
            return action.getExtras();
        }

        @DoNotInline
        /* renamed from: d */
        public static Bundle m57714d(android.app.RemoteInput remoteInput) {
            return remoteInput.getExtras();
        }

        @DoNotInline
        /* renamed from: e */
        public static String m57713e(Notification notification) {
            return notification.getGroup();
        }

        @DoNotInline
        /* renamed from: f */
        public static CharSequence m57712f(android.app.RemoteInput remoteInput) {
            return remoteInput.getLabel();
        }

        @DoNotInline
        /* renamed from: g */
        public static android.app.RemoteInput[] m57711g(Notification.Action action) {
            return action.getRemoteInputs();
        }

        @DoNotInline
        /* renamed from: h */
        public static String m57710h(android.app.RemoteInput remoteInput) {
            return remoteInput.getResultKey();
        }

        @DoNotInline
        /* renamed from: i */
        public static String m57709i(Notification notification) {
            return notification.getSortKey();
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$c */
    /* loaded from: classes2.dex */
    public static class C3900c {
        @DoNotInline
        /* renamed from: a */
        public static Icon m57708a(Notification.Action action) {
            return action.getIcon();
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$d */
    /* loaded from: classes2.dex */
    public static class C3901d {
        @DoNotInline
        /* renamed from: a */
        public static boolean m57707a(Notification.Action action) {
            return action.getAllowGeneratedReplies();
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$e */
    /* loaded from: classes2.dex */
    public static class C3902e {
        @DoNotInline
        /* renamed from: a */
        public static int m57706a(Notification notification) {
            return notification.getBadgeIconType();
        }

        @DoNotInline
        /* renamed from: b */
        public static String m57705b(Notification notification) {
            return notification.getChannelId();
        }

        @DoNotInline
        /* renamed from: c */
        public static int m57704c(Notification notification) {
            return notification.getGroupAlertBehavior();
        }

        @DoNotInline
        /* renamed from: d */
        public static CharSequence m57703d(Notification notification) {
            return notification.getSettingsText();
        }

        @DoNotInline
        /* renamed from: e */
        public static String m57702e(Notification notification) {
            return notification.getShortcutId();
        }

        @DoNotInline
        /* renamed from: f */
        public static long m57701f(Notification notification) {
            return notification.getTimeoutAfter();
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$f */
    /* loaded from: classes2.dex */
    public static class C3903f {
        @DoNotInline
        /* renamed from: a */
        public static int m57700a(Notification.Action action) {
            return action.getSemanticAction();
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$g */
    /* loaded from: classes2.dex */
    public static class C3904g {
        @DoNotInline
        /* renamed from: a */
        public static boolean m57699a(Notification notification) {
            return notification.getAllowSystemGeneratedContextualActions();
        }

        @DoNotInline
        /* renamed from: b */
        public static Notification.BubbleMetadata m57698b(Notification notification) {
            return notification.getBubbleMetadata();
        }

        @DoNotInline
        /* renamed from: c */
        public static int m57697c(android.app.RemoteInput remoteInput) {
            return remoteInput.getEditChoicesBeforeSending();
        }

        @DoNotInline
        /* renamed from: d */
        public static LocusId m57696d(Notification notification) {
            return notification.getLocusId();
        }

        @DoNotInline
        /* renamed from: e */
        public static boolean m57695e(Notification.Action action) {
            return action.isContextual();
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$h */
    /* loaded from: classes2.dex */
    public static class C3905h {
        @DoNotInline
        /* renamed from: a */
        public static boolean m57694a(Notification.Action action) {
            return action.isAuthenticationRequired();
        }
    }

    /* renamed from: a */
    public static Action m57859a(Notification.Action action) {
        RemoteInput[] remoteInputArr;
        int i;
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        android.app.RemoteInput[] m57711g = C3899b.m57711g(action);
        IconCompat iconCompat = null;
        if (m57711g == null) {
            remoteInputArr = null;
        } else {
            RemoteInput[] remoteInputArr2 = new RemoteInput[m57711g.length];
            for (int i4 = 0; i4 < m57711g.length; i4++) {
                android.app.RemoteInput remoteInput = m57711g[i4];
                String m57710h = C3899b.m57710h(remoteInput);
                CharSequence m57712f = C3899b.m57712f(remoteInput);
                CharSequence[] m57716b = C3899b.m57716b(remoteInput);
                boolean m57717a = C3899b.m57717a(remoteInput);
                if (Build.VERSION.SDK_INT >= 29) {
                    i = C3904g.m57697c(remoteInput);
                } else {
                    i = 0;
                }
                remoteInputArr2[i4] = new RemoteInput(m57710h, m57712f, m57716b, m57717a, i, C3899b.m57714d(remoteInput), null);
            }
            remoteInputArr = remoteInputArr2;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 24) {
            if (!C3899b.m57715c(action).getBoolean("android.support.allowGeneratedReplies") && !C3901d.m57707a(action)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = C3899b.m57715c(action).getBoolean("android.support.allowGeneratedReplies");
        }
        boolean z4 = z;
        boolean z5 = C3899b.m57715c(action).getBoolean("android.support.action.showsUserInterface", true);
        if (i5 >= 28) {
            i2 = C3903f.m57700a(action);
        } else {
            i2 = C3899b.m57715c(action).getInt("android.support.action.semanticAction", 0);
        }
        int i6 = i2;
        if (i5 >= 29) {
            z2 = C3904g.m57695e(action);
        } else {
            z2 = false;
        }
        if (i5 >= 31) {
            z3 = C3905h.m57694a(action);
        } else {
            z3 = false;
        }
        if (i5 >= 23) {
            if (C3900c.m57708a(action) == null && (i3 = action.icon) != 0) {
                return new Action(i3, action.title, action.actionIntent, C3899b.m57715c(action), remoteInputArr, (RemoteInput[]) null, z4, i6, z5, z2, z3);
            }
            if (C3900c.m57708a(action) != null) {
                iconCompat = IconCompat.createFromIconOrNullIfZeroResId(C3900c.m57708a(action));
            }
            return new Action(iconCompat, action.title, action.actionIntent, C3899b.m57715c(action), remoteInputArr, (RemoteInput[]) null, z4, i6, z5, z2, z3);
        }
        return new Action(action.icon, action.title, action.actionIntent, C3899b.m57715c(action), remoteInputArr, (RemoteInput[]) null, z4, i6, z5, z2, z3);
    }

    /* renamed from: b */
    public static boolean m57858b(Notification notification) {
        if ((notification.flags & 128) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static Notification[] m57857c(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if (!(parcelableArray instanceof Notification[]) && parcelableArray != null) {
            Notification[] notificationArr = new Notification[parcelableArray.length];
            for (int i = 0; i < parcelableArray.length; i++) {
                notificationArr[i] = (Notification) parcelableArray[i];
            }
            bundle.putParcelableArray(str, notificationArr);
            return notificationArr;
        }
        return (Notification[]) parcelableArray;
    }

    @Nullable
    public static Action getAction(@NonNull Notification notification, int i) {
        return m57859a(notification.actions[i]);
    }

    public static int getActionCount(@NonNull Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    public static boolean getAllowSystemGeneratedContextualActions(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C3904g.m57699a(notification);
        }
        return false;
    }

    public static boolean getAutoCancel(@NonNull Notification notification) {
        if ((notification.flags & 16) != 0) {
            return true;
        }
        return false;
    }

    public static int getBadgeIconType(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C3902e.m57706a(notification);
        }
        return 0;
    }

    @Nullable
    public static BubbleMetadata getBubbleMetadata(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return BubbleMetadata.fromPlatform(C3904g.m57698b(notification));
        }
        return null;
    }

    @Nullable
    public static String getCategory(@NonNull Notification notification) {
        return notification.category;
    }

    @Nullable
    public static String getChannelId(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C3902e.m57705b(notification);
        }
        return null;
    }

    public static int getColor(@NonNull Notification notification) {
        return notification.color;
    }

    @Nullable
    @RequiresApi(19)
    public static CharSequence getContentInfo(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_INFO_TEXT);
    }

    @Nullable
    @RequiresApi(19)
    public static CharSequence getContentText(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TEXT);
    }

    @Nullable
    @RequiresApi(19)
    public static CharSequence getContentTitle(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TITLE);
    }

    @Nullable
    public static Bundle getExtras(@NonNull Notification notification) {
        return notification.extras;
    }

    @Nullable
    public static String getGroup(@NonNull Notification notification) {
        return C3899b.m57713e(notification);
    }

    public static int getGroupAlertBehavior(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C3902e.m57704c(notification);
        }
        return 0;
    }

    @NonNull
    @RequiresApi(21)
    public static List<Action> getInvisibleActions(@NonNull Notification notification) {
        ArrayList arrayList = new ArrayList();
        Bundle bundle = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle == null) {
            return arrayList;
        }
        Bundle bundle2 = bundle.getBundle("invisible_actions");
        if (bundle2 != null) {
            for (int i = 0; i < bundle2.size(); i++) {
                arrayList.add(AbstractC3941b.m57564c(bundle2.getBundle(Integer.toString(i))));
            }
        }
        return arrayList;
    }

    public static boolean getLocalOnly(@NonNull Notification notification) {
        if ((notification.flags & 256) != 0) {
            return true;
        }
        return false;
    }

    @Nullable
    public static LocusIdCompat getLocusId(@NonNull Notification notification) {
        LocusId m57696d;
        if (Build.VERSION.SDK_INT < 29 || (m57696d = C3904g.m57696d(notification)) == null) {
            return null;
        }
        return LocusIdCompat.toLocusIdCompat(m57696d);
    }

    public static boolean getOngoing(@NonNull Notification notification) {
        if ((notification.flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public static boolean getOnlyAlertOnce(@NonNull Notification notification) {
        if ((notification.flags & 8) != 0) {
            return true;
        }
        return false;
    }

    @NonNull
    public static List<Person> getPeople(@NonNull Notification notification) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(EXTRA_PEOPLE_LIST);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(Person.fromAndroidPerson(WI0.m65642a(it.next())));
                }
            }
        } else {
            String[] stringArray = notification.extras.getStringArray(EXTRA_PEOPLE);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    arrayList.add(new Person.Builder().setUri(str).build());
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public static Notification getPublicVersion(@NonNull Notification notification) {
        return notification.publicVersion;
    }

    @Nullable
    public static CharSequence getSettingsText(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C3902e.m57703d(notification);
        }
        return null;
    }

    @Nullable
    public static String getShortcutId(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C3902e.m57702e(notification);
        }
        return null;
    }

    @RequiresApi(19)
    public static boolean getShowWhen(@NonNull Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_WHEN);
    }

    @Nullable
    public static String getSortKey(@NonNull Notification notification) {
        return C3899b.m57709i(notification);
    }

    @Nullable
    @RequiresApi(19)
    public static CharSequence getSubText(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_SUB_TEXT);
    }

    public static long getTimeoutAfter(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C3902e.m57701f(notification);
        }
        return 0L;
    }

    @RequiresApi(19)
    public static boolean getUsesChronometer(@NonNull Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_CHRONOMETER);
    }

    public static int getVisibility(@NonNull Notification notification) {
        return notification.visibility;
    }

    public static boolean isGroupSummary(@NonNull Notification notification) {
        if ((notification.flags & 512) != 0) {
            return true;
        }
        return false;
    }

    /* loaded from: classes2.dex */
    public static final class CarExtender implements Extender {

        /* renamed from: a */
        public Bitmap f33612a;

        /* renamed from: b */
        public UnreadConversation f33613b;

        /* renamed from: c */
        public int f33614c;

        @Deprecated
        /* loaded from: classes2.dex */
        public static class UnreadConversation {

            /* renamed from: a */
            public final String[] f33615a;

            /* renamed from: b */
            public final RemoteInput f33616b;

            /* renamed from: c */
            public final PendingIntent f33617c;

            /* renamed from: d */
            public final PendingIntent f33618d;

            /* renamed from: e */
            public final String[] f33619e;

            /* renamed from: f */
            public final long f33620f;

            /* loaded from: classes2.dex */
            public static class Builder {

                /* renamed from: a */
                public final List f33621a = new ArrayList();

                /* renamed from: b */
                public final String f33622b;

                /* renamed from: c */
                public RemoteInput f33623c;

                /* renamed from: d */
                public PendingIntent f33624d;

                /* renamed from: e */
                public PendingIntent f33625e;

                /* renamed from: f */
                public long f33626f;

                public Builder(@NonNull String str) {
                    this.f33622b = str;
                }

                @NonNull
                public Builder addMessage(@Nullable String str) {
                    if (str != null) {
                        this.f33621a.add(str);
                    }
                    return this;
                }

                @NonNull
                public UnreadConversation build() {
                    List list = this.f33621a;
                    return new UnreadConversation((String[]) list.toArray(new String[list.size()]), this.f33623c, this.f33625e, this.f33624d, new String[]{this.f33622b}, this.f33626f);
                }

                @NonNull
                public Builder setLatestTimestamp(long j) {
                    this.f33626f = j;
                    return this;
                }

                @NonNull
                public Builder setReadPendingIntent(@Nullable PendingIntent pendingIntent) {
                    this.f33624d = pendingIntent;
                    return this;
                }

                @NonNull
                public Builder setReplyAction(@Nullable PendingIntent pendingIntent, @Nullable RemoteInput remoteInput) {
                    this.f33623c = remoteInput;
                    this.f33625e = pendingIntent;
                    return this;
                }
            }

            public UnreadConversation(String[] strArr, RemoteInput remoteInput, PendingIntent pendingIntent, PendingIntent pendingIntent2, String[] strArr2, long j) {
                this.f33615a = strArr;
                this.f33616b = remoteInput;
                this.f33618d = pendingIntent2;
                this.f33617c = pendingIntent;
                this.f33619e = strArr2;
                this.f33620f = j;
            }

            public long getLatestTimestamp() {
                return this.f33620f;
            }

            @Nullable
            public String[] getMessages() {
                return this.f33615a;
            }

            @Nullable
            public String getParticipant() {
                String[] strArr = this.f33619e;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }

            @Nullable
            public String[] getParticipants() {
                return this.f33619e;
            }

            @Nullable
            public PendingIntent getReadPendingIntent() {
                return this.f33618d;
            }

            @Nullable
            public RemoteInput getRemoteInput() {
                return this.f33616b;
            }

            @Nullable
            public PendingIntent getReplyPendingIntent() {
                return this.f33617c;
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$CarExtender$a */
        /* loaded from: classes2.dex */
        public static class C3880a {
            @DoNotInline
            /* renamed from: a */
            public static RemoteInput.Builder m57785a(RemoteInput.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            @DoNotInline
            /* renamed from: b */
            public static android.app.RemoteInput m57784b(RemoteInput.Builder builder) {
                return builder.build();
            }

            @DoNotInline
            /* renamed from: c */
            public static RemoteInput.Builder m57783c(String str) {
                return new RemoteInput.Builder(str);
            }

            @DoNotInline
            /* renamed from: d */
            public static boolean m57782d(android.app.RemoteInput remoteInput) {
                return remoteInput.getAllowFreeFormInput();
            }

            @DoNotInline
            /* renamed from: e */
            public static CharSequence[] m57781e(android.app.RemoteInput remoteInput) {
                return remoteInput.getChoices();
            }

            @DoNotInline
            /* renamed from: f */
            public static Bundle m57780f(android.app.RemoteInput remoteInput) {
                return remoteInput.getExtras();
            }

            @DoNotInline
            /* renamed from: g */
            public static CharSequence m57779g(android.app.RemoteInput remoteInput) {
                return remoteInput.getLabel();
            }

            @DoNotInline
            /* renamed from: h */
            public static String m57778h(android.app.RemoteInput remoteInput) {
                return remoteInput.getResultKey();
            }

            @DoNotInline
            /* renamed from: i */
            public static RemoteInput.Builder m57777i(RemoteInput.Builder builder, boolean z) {
                return builder.setAllowFreeFormInput(z);
            }

            @DoNotInline
            /* renamed from: j */
            public static RemoteInput.Builder m57776j(RemoteInput.Builder builder, CharSequence[] charSequenceArr) {
                return builder.setChoices(charSequenceArr);
            }

            @DoNotInline
            /* renamed from: k */
            public static RemoteInput.Builder m57775k(RemoteInput.Builder builder, CharSequence charSequence) {
                return builder.setLabel(charSequence);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$CarExtender$b */
        /* loaded from: classes2.dex */
        public static class C3881b {
            @DoNotInline
            /* renamed from: a */
            public static int m57774a(android.app.RemoteInput remoteInput) {
                return remoteInput.getEditChoicesBeforeSending();
            }
        }

        public CarExtender() {
            this.f33614c = 0;
        }

        /* renamed from: a */
        public static Bundle m57787a(UnreadConversation unreadConversation) {
            String str;
            Bundle bundle = new Bundle();
            if (unreadConversation.getParticipants() != null && unreadConversation.getParticipants().length > 1) {
                str = unreadConversation.getParticipants()[0];
            } else {
                str = null;
            }
            int length = unreadConversation.getMessages().length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int i = 0; i < length; i++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString(TextBundle.TEXT_ENTRY, unreadConversation.getMessages()[i]);
                bundle2.putString("author", str);
                parcelableArr[i] = bundle2;
            }
            bundle.putParcelableArray("messages", parcelableArr);
            RemoteInput remoteInput = unreadConversation.getRemoteInput();
            if (remoteInput != null) {
                RemoteInput.Builder m57783c = C3880a.m57783c(remoteInput.getResultKey());
                C3880a.m57775k(m57783c, remoteInput.getLabel());
                C3880a.m57776j(m57783c, remoteInput.getChoices());
                C3880a.m57777i(m57783c, remoteInput.getAllowFreeFormInput());
                C3880a.m57785a(m57783c, remoteInput.getExtras());
                bundle.putParcelable("remote_input", C3880a.m57784b(m57783c));
            }
            bundle.putParcelable("on_reply", unreadConversation.getReplyPendingIntent());
            bundle.putParcelable("on_read", unreadConversation.getReadPendingIntent());
            bundle.putStringArray("participants", unreadConversation.getParticipants());
            bundle.putLong("timestamp", unreadConversation.getLatestTimestamp());
            return bundle;
        }

        /* renamed from: b */
        public static UnreadConversation m57786b(Bundle bundle) {
            String[] strArr;
            int i;
            RemoteInput remoteInput = null;
            if (bundle == null) {
                return null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("messages");
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                String[] strArr2 = new String[length];
                for (int i2 = 0; i2 < length; i2++) {
                    Parcelable parcelable = parcelableArray[i2];
                    if (parcelable instanceof Bundle) {
                        String string = ((Bundle) parcelable).getString(TextBundle.TEXT_ENTRY);
                        strArr2[i2] = string;
                        if (string != null) {
                        }
                    }
                    return null;
                }
                strArr = strArr2;
            } else {
                strArr = null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("on_read");
            PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("on_reply");
            android.app.RemoteInput remoteInput2 = (android.app.RemoteInput) bundle.getParcelable("remote_input");
            String[] stringArray = bundle.getStringArray("participants");
            if (stringArray == null || stringArray.length != 1) {
                return null;
            }
            if (remoteInput2 != null) {
                String m57778h = C3880a.m57778h(remoteInput2);
                CharSequence m57779g = C3880a.m57779g(remoteInput2);
                CharSequence[] m57781e = C3880a.m57781e(remoteInput2);
                boolean m57782d = C3880a.m57782d(remoteInput2);
                if (Build.VERSION.SDK_INT >= 29) {
                    i = C3881b.m57774a(remoteInput2);
                } else {
                    i = 0;
                }
                remoteInput = new RemoteInput(m57778h, m57779g, m57781e, m57782d, i, C3880a.m57780f(remoteInput2), null);
            }
            return new UnreadConversation(strArr, remoteInput, pendingIntent2, pendingIntent, stringArray, bundle.getLong("timestamp"));
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        @NonNull
        public Builder extend(@NonNull Builder builder) {
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.f33612a;
            if (bitmap != null) {
                bundle.putParcelable("large_icon", bitmap);
            }
            int i = this.f33614c;
            if (i != 0) {
                bundle.putInt("app_color", i);
            }
            UnreadConversation unreadConversation = this.f33613b;
            if (unreadConversation != null) {
                bundle.putBundle("car_conversation", m57787a(unreadConversation));
            }
            builder.getExtras().putBundle("android.car.EXTENSIONS", bundle);
            return builder;
        }

        @ColorInt
        public int getColor() {
            return this.f33614c;
        }

        @Nullable
        public Bitmap getLargeIcon() {
            return this.f33612a;
        }

        @Nullable
        @Deprecated
        public UnreadConversation getUnreadConversation() {
            return this.f33613b;
        }

        @NonNull
        public CarExtender setColor(@ColorInt int i) {
            this.f33614c = i;
            return this;
        }

        @NonNull
        public CarExtender setLargeIcon(@Nullable Bitmap bitmap) {
            this.f33612a = bitmap;
            return this;
        }

        @NonNull
        @Deprecated
        public CarExtender setUnreadConversation(@Nullable UnreadConversation unreadConversation) {
            this.f33613b = unreadConversation;
            return this;
        }

        public CarExtender(@NonNull Notification notification) {
            this.f33614c = 0;
            Bundle bundle = NotificationCompat.getExtras(notification) == null ? null : NotificationCompat.getExtras(notification).getBundle("android.car.EXTENSIONS");
            if (bundle != null) {
                this.f33612a = (Bitmap) bundle.getParcelable("large_icon");
                this.f33614c = bundle.getInt("app_color", 0);
                this.f33613b = m57786b(bundle.getBundle("car_conversation"));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class InboxStyle extends Style {

        /* renamed from: d */
        public ArrayList f33627d = new ArrayList();

        /* renamed from: androidx.core.app.NotificationCompat$InboxStyle$a */
        /* loaded from: classes2.dex */
        public static class C3885a {
            @DoNotInline
            /* renamed from: a */
            public static Notification.InboxStyle m57767a(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.addLine(charSequence);
            }

            @DoNotInline
            /* renamed from: b */
            public static Notification.InboxStyle m57766b(Notification.Builder builder) {
                return new Notification.InboxStyle(builder);
            }

            @DoNotInline
            /* renamed from: c */
            public static Notification.InboxStyle m57765c(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.setBigContentTitle(charSequence);
            }

            @DoNotInline
            /* renamed from: d */
            public static Notification.InboxStyle m57764d(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.setSummaryText(charSequence);
            }
        }

        public InboxStyle() {
        }

        @NonNull
        public InboxStyle addLine(@Nullable CharSequence charSequence) {
            if (charSequence != null) {
                this.f33627d.add(Builder.limitCharSequenceLength(charSequence));
            }
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.InboxStyle m57765c = C3885a.m57765c(C3885a.m57766b(notificationBuilderWithBuilderAccessor.getBuilder()), this.f33639a);
            if (this.f33641c) {
                C3885a.m57764d(m57765c, this.f33640b);
            }
            Iterator it = this.f33627d.iterator();
            while (it.hasNext()) {
                C3885a.m57767a(m57765c, (CharSequence) it.next());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_TEXT_LINES);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.f33627d.clear();
            if (bundle.containsKey(NotificationCompat.EXTRA_TEXT_LINES)) {
                Collections.addAll(this.f33627d, bundle.getCharSequenceArray(NotificationCompat.EXTRA_TEXT_LINES));
            }
        }

        @NonNull
        public InboxStyle setBigContentTitle(@Nullable CharSequence charSequence) {
            this.f33639a = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public InboxStyle setSummaryText(@Nullable CharSequence charSequence) {
            this.f33640b = Builder.limitCharSequenceLength(charSequence);
            this.f33641c = true;
            return this;
        }

        public InboxStyle(@Nullable Builder builder) {
            setBuilder(builder);
        }
    }

    /* loaded from: classes2.dex */
    public static class MessagingStyle extends Style {
        public static final int MAXIMUM_RETAINED_MESSAGES = 25;

        /* renamed from: d */
        public final List f33628d = new ArrayList();

        /* renamed from: e */
        public final List f33629e = new ArrayList();

        /* renamed from: f */
        public Person f33630f;

        /* renamed from: g */
        public CharSequence f33631g;

        /* renamed from: h */
        public Boolean f33632h;

        /* renamed from: androidx.core.app.NotificationCompat$MessagingStyle$a */
        /* loaded from: classes2.dex */
        public static class C3888a {
            @DoNotInline
            /* renamed from: a */
            public static Notification.BigTextStyle m57751a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            @DoNotInline
            /* renamed from: b */
            public static Notification.BigTextStyle m57750b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            @DoNotInline
            /* renamed from: c */
            public static Notification.BigTextStyle m57749c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            @DoNotInline
            /* renamed from: d */
            public static void m57748d(Notification.Style style, Notification.Builder builder) {
                style.setBuilder(builder);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$MessagingStyle$b */
        /* loaded from: classes2.dex */
        public static class C3889b {
            @DoNotInline
            /* renamed from: a */
            public static Notification.MessagingStyle m57747a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            @DoNotInline
            /* renamed from: b */
            public static Notification.MessagingStyle m57746b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            @DoNotInline
            /* renamed from: c */
            public static Notification.MessagingStyle m57745c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$MessagingStyle$c */
        /* loaded from: classes2.dex */
        public static class C3890c {
            @DoNotInline
            /* renamed from: a */
            public static Notification.MessagingStyle m57744a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$MessagingStyle$d */
        /* loaded from: classes2.dex */
        public static class C3891d {
            @DoNotInline
            /* renamed from: a */
            public static Notification.MessagingStyle m57743a(android.app.Person person) {
                return new Notification.MessagingStyle(person);
            }

            @DoNotInline
            /* renamed from: b */
            public static Notification.MessagingStyle m57742b(Notification.MessagingStyle messagingStyle, boolean z) {
                return messagingStyle.setGroupConversation(z);
            }
        }

        public MessagingStyle() {
        }

        @Nullable
        public static MessagingStyle extractMessagingStyleFromNotification(@NonNull Notification notification) {
            Style extractStyleFromNotification = Style.extractStyleFromNotification(notification);
            if (extractStyleFromNotification instanceof MessagingStyle) {
                return (MessagingStyle) extractStyleFromNotification;
            }
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(@NonNull Bundle bundle) {
            super.addCompatExtras(bundle);
            bundle.putCharSequence(NotificationCompat.EXTRA_SELF_DISPLAY_NAME, this.f33630f.getName());
            bundle.putBundle(NotificationCompat.EXTRA_MESSAGING_STYLE_USER, this.f33630f.toBundle());
            bundle.putCharSequence(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE, this.f33631g);
            if (this.f33631g != null && this.f33632h.booleanValue()) {
                bundle.putCharSequence(NotificationCompat.EXTRA_CONVERSATION_TITLE, this.f33631g);
            }
            if (!this.f33628d.isEmpty()) {
                bundle.putParcelableArray(NotificationCompat.EXTRA_MESSAGES, Message.m57759a(this.f33628d));
            }
            if (!this.f33629e.isEmpty()) {
                bundle.putParcelableArray(NotificationCompat.EXTRA_HISTORIC_MESSAGES, Message.m57759a(this.f33629e));
            }
            Boolean bool = this.f33632h;
            if (bool != null) {
                bundle.putBoolean(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION, bool.booleanValue());
            }
        }

        @NonNull
        public MessagingStyle addHistoricMessage(@Nullable Message message) {
            if (message != null) {
                this.f33629e.add(message);
                if (this.f33629e.size() > 25) {
                    this.f33629e.remove(0);
                }
            }
            return this;
        }

        @NonNull
        @Deprecated
        public MessagingStyle addMessage(@Nullable CharSequence charSequence, long j, @Nullable CharSequence charSequence2) {
            this.f33628d.add(new Message(charSequence, j, new Person.Builder().setName(charSequence2).build()));
            if (this.f33628d.size() > 25) {
                this.f33628d.remove(0);
            }
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            boolean z;
            CharSequence text;
            CharSequence text2;
            Notification.MessagingStyle m57746b;
            setGroupConversation(isGroupConversation());
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (i >= 28) {
                    m57746b = C3891d.m57743a(this.f33630f.toAndroidPerson());
                } else {
                    m57746b = C3889b.m57746b(this.f33630f.getName());
                }
                for (Message message : this.f33628d) {
                    C3889b.m57747a(AbstractC19160bJ0.m52031a(m57746b), message.m57756d());
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    for (Message message2 : this.f33629e) {
                        C3890c.m57744a(AbstractC19160bJ0.m52031a(m57746b), message2.m57756d());
                    }
                }
                if (this.f33632h.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                    C3889b.m57745c(AbstractC19160bJ0.m52031a(m57746b), this.f33631g);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    C3891d.m57742b(AbstractC19160bJ0.m52031a(m57746b), this.f33632h.booleanValue());
                }
                C3888a.m57748d(m57746b, notificationBuilderWithBuilderAccessor.getBuilder());
                return;
            }
            Message m57763l = m57763l();
            if (this.f33631g != null && this.f33632h.booleanValue()) {
                notificationBuilderWithBuilderAccessor.getBuilder().setContentTitle(this.f33631g);
            } else if (m57763l != null) {
                notificationBuilderWithBuilderAccessor.getBuilder().setContentTitle("");
                if (m57763l.getPerson() != null) {
                    notificationBuilderWithBuilderAccessor.getBuilder().setContentTitle(m57763l.getPerson().getName());
                }
            }
            if (m57763l != null) {
                Notification.Builder builder = notificationBuilderWithBuilderAccessor.getBuilder();
                if (this.f33631g != null) {
                    text2 = m57760o(m57763l);
                } else {
                    text2 = m57763l.getText();
                }
                builder.setContentText(text2);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f33631g == null && !m57762m()) {
                z = false;
            } else {
                z = true;
            }
            for (int size = this.f33628d.size() - 1; size >= 0; size--) {
                Message message3 = (Message) this.f33628d.get(size);
                if (z) {
                    text = m57760o(message3);
                } else {
                    text = message3.getText();
                }
                if (size != this.f33628d.size() - 1) {
                    spannableStringBuilder.insert(0, (CharSequence) "\n");
                }
                spannableStringBuilder.insert(0, text);
            }
            C3888a.m57751a(C3888a.m57749c(C3888a.m57750b(notificationBuilderWithBuilderAccessor.getBuilder()), null), spannableStringBuilder);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_MESSAGING_STYLE_USER);
            bundle.remove(NotificationCompat.EXTRA_SELF_DISPLAY_NAME);
            bundle.remove(NotificationCompat.EXTRA_CONVERSATION_TITLE);
            bundle.remove(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
            bundle.remove(NotificationCompat.EXTRA_MESSAGES);
            bundle.remove(NotificationCompat.EXTRA_HISTORIC_MESSAGES);
            bundle.remove(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        @Nullable
        public CharSequence getConversationTitle() {
            return this.f33631g;
        }

        @NonNull
        public List<Message> getHistoricMessages() {
            return this.f33629e;
        }

        @NonNull
        public List<Message> getMessages() {
            return this.f33628d;
        }

        @NonNull
        public Person getUser() {
            return this.f33630f;
        }

        @Nullable
        @Deprecated
        public CharSequence getUserDisplayName() {
            return this.f33630f.getName();
        }

        public boolean isGroupConversation() {
            Builder builder = this.mBuilder;
            if (builder != null && builder.mContext.getApplicationInfo().targetSdkVersion < 28 && this.f33632h == null) {
                if (this.f33631g == null) {
                    return false;
                }
                return true;
            }
            Boolean bool = this.f33632h;
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        }

        /* renamed from: l */
        public final Message m57763l() {
            List list;
            for (int size = this.f33628d.size() - 1; size >= 0; size--) {
                Message message = (Message) this.f33628d.get(size);
                if (message.getPerson() != null && !TextUtils.isEmpty(message.getPerson().getName())) {
                    return message;
                }
            }
            if (!this.f33628d.isEmpty()) {
                return (Message) this.f33628d.get(list.size() - 1);
            }
            return null;
        }

        /* renamed from: m */
        public final boolean m57762m() {
            for (int size = this.f33628d.size() - 1; size >= 0; size--) {
                Message message = (Message) this.f33628d.get(size);
                if (message.getPerson() != null && message.getPerson().getName() == null) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: n */
        public final TextAppearanceSpan m57761n(int i) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null);
        }

        /* renamed from: o */
        public final CharSequence m57760o(Message message) {
            CharSequence name;
            BidiFormatter bidiFormatter = BidiFormatter.getInstance();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            CharSequence charSequence = "";
            if (message.getPerson() == null) {
                name = "";
            } else {
                name = message.getPerson().getName();
            }
            int i = -16777216;
            if (TextUtils.isEmpty(name)) {
                name = this.f33630f.getName();
                if (this.mBuilder.getColor() != 0) {
                    i = this.mBuilder.getColor();
                }
            }
            CharSequence unicodeWrap = bidiFormatter.unicodeWrap(name);
            spannableStringBuilder.append(unicodeWrap);
            spannableStringBuilder.setSpan(m57761n(i), spannableStringBuilder.length() - unicodeWrap.length(), spannableStringBuilder.length(), 33);
            if (message.getText() != null) {
                charSequence = message.getText();
            }
            spannableStringBuilder.append((CharSequence) "  ").append(bidiFormatter.unicodeWrap(charSequence));
            return spannableStringBuilder;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.f33628d.clear();
            if (bundle.containsKey(NotificationCompat.EXTRA_MESSAGING_STYLE_USER)) {
                this.f33630f = Person.fromBundle(bundle.getBundle(NotificationCompat.EXTRA_MESSAGING_STYLE_USER));
            } else {
                this.f33630f = new Person.Builder().setName(bundle.getString(NotificationCompat.EXTRA_SELF_DISPLAY_NAME)).build();
            }
            CharSequence charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_CONVERSATION_TITLE);
            this.f33631g = charSequence;
            if (charSequence == null) {
                this.f33631g = bundle.getCharSequence(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(NotificationCompat.EXTRA_MESSAGES);
            if (parcelableArray != null) {
                this.f33628d.addAll(Message.m57757c(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray(NotificationCompat.EXTRA_HISTORIC_MESSAGES);
            if (parcelableArray2 != null) {
                this.f33629e.addAll(Message.m57757c(parcelableArray2));
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION)) {
                this.f33632h = Boolean.valueOf(bundle.getBoolean(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION));
            }
        }

        @NonNull
        public MessagingStyle setConversationTitle(@Nullable CharSequence charSequence) {
            this.f33631g = charSequence;
            return this;
        }

        @NonNull
        public MessagingStyle setGroupConversation(boolean z) {
            this.f33632h = Boolean.valueOf(z);
            return this;
        }

        @Deprecated
        public MessagingStyle(@NonNull CharSequence charSequence) {
            this.f33630f = new Person.Builder().setName(charSequence).build();
        }

        /* loaded from: classes2.dex */
        public static final class Message {

            /* renamed from: a */
            public final CharSequence f33633a;

            /* renamed from: b */
            public final long f33634b;

            /* renamed from: c */
            public final Person f33635c;

            /* renamed from: d */
            public Bundle f33636d;

            /* renamed from: e */
            public String f33637e;

            /* renamed from: f */
            public Uri f33638f;

            /* renamed from: androidx.core.app.NotificationCompat$MessagingStyle$Message$a */
            /* loaded from: classes2.dex */
            public static class C3886a {
                @DoNotInline
                /* renamed from: a */
                public static Notification.MessagingStyle.Message m57754a(CharSequence charSequence, long j, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j, charSequence2);
                }

                @DoNotInline
                /* renamed from: b */
                public static Notification.MessagingStyle.Message m57753b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            /* renamed from: androidx.core.app.NotificationCompat$MessagingStyle$Message$b */
            /* loaded from: classes2.dex */
            public static class C3887b {
                @DoNotInline
                /* renamed from: a */
                public static Notification.MessagingStyle.Message m57752a(CharSequence charSequence, long j, android.app.Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j, person);
                }
            }

            public Message(@Nullable CharSequence charSequence, long j, @Nullable Person person) {
                this.f33636d = new Bundle();
                this.f33633a = charSequence;
                this.f33634b = j;
                this.f33635c = person;
            }

            /* renamed from: a */
            public static Bundle[] m57759a(List list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = ((Message) list.get(i)).m57755e();
                }
                return bundleArr;
            }

            /* renamed from: b */
            public static Message m57758b(Bundle bundle) {
                Person person;
                try {
                    if (bundle.containsKey(TextBundle.TEXT_ENTRY) && bundle.containsKey("time")) {
                        if (bundle.containsKey("person")) {
                            person = Person.fromBundle(bundle.getBundle("person"));
                        } else if (bundle.containsKey("sender_person") && Build.VERSION.SDK_INT >= 28) {
                            person = Person.fromAndroidPerson(WI0.m65642a(bundle.getParcelable("sender_person")));
                        } else if (bundle.containsKey("sender")) {
                            person = new Person.Builder().setName(bundle.getCharSequence("sender")).build();
                        } else {
                            person = null;
                        }
                        Message message = new Message(bundle.getCharSequence(TextBundle.TEXT_ENTRY), bundle.getLong("time"), person);
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            message.setData(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                        }
                        if (bundle.containsKey("extras")) {
                            message.getExtras().putAll(bundle.getBundle("extras"));
                        }
                        return message;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            /* renamed from: c */
            public static List m57757c(Parcelable[] parcelableArr) {
                Message m57758b;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof Bundle) && (m57758b = m57758b((Bundle) parcelable)) != null) {
                        arrayList.add(m57758b);
                    }
                }
                return arrayList;
            }

            /* renamed from: d */
            public Notification.MessagingStyle.Message m57756d() {
                Notification.MessagingStyle.Message m57754a;
                Person person = getPerson();
                CharSequence charSequence = null;
                android.app.Person person2 = null;
                if (Build.VERSION.SDK_INT >= 28) {
                    CharSequence text = getText();
                    long timestamp = getTimestamp();
                    if (person != null) {
                        person2 = person.toAndroidPerson();
                    }
                    m57754a = C3887b.m57752a(text, timestamp, person2);
                } else {
                    CharSequence text2 = getText();
                    long timestamp2 = getTimestamp();
                    if (person != null) {
                        charSequence = person.getName();
                    }
                    m57754a = C3886a.m57754a(text2, timestamp2, charSequence);
                }
                if (getDataMimeType() != null) {
                    C3886a.m57753b(m57754a, getDataMimeType(), getDataUri());
                }
                return m57754a;
            }

            /* renamed from: e */
            public final Bundle m57755e() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f33633a;
                if (charSequence != null) {
                    bundle.putCharSequence(TextBundle.TEXT_ENTRY, charSequence);
                }
                bundle.putLong("time", this.f33634b);
                Person person = this.f33635c;
                if (person != null) {
                    bundle.putCharSequence("sender", person.getName());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", this.f33635c.toAndroidPerson());
                    } else {
                        bundle.putBundle("person", this.f33635c.toBundle());
                    }
                }
                String str = this.f33637e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f33638f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f33636d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            @Nullable
            public String getDataMimeType() {
                return this.f33637e;
            }

            @Nullable
            public Uri getDataUri() {
                return this.f33638f;
            }

            @NonNull
            public Bundle getExtras() {
                return this.f33636d;
            }

            @Nullable
            public Person getPerson() {
                return this.f33635c;
            }

            @Nullable
            @Deprecated
            public CharSequence getSender() {
                Person person = this.f33635c;
                if (person == null) {
                    return null;
                }
                return person.getName();
            }

            @Nullable
            public CharSequence getText() {
                return this.f33633a;
            }

            public long getTimestamp() {
                return this.f33634b;
            }

            @NonNull
            public Message setData(@Nullable String str, @Nullable Uri uri) {
                this.f33637e = str;
                this.f33638f = uri;
                return this;
            }

            @Deprecated
            public Message(@Nullable CharSequence charSequence, long j, @Nullable CharSequence charSequence2) {
                this(charSequence, j, new Person.Builder().setName(charSequence2).build());
            }
        }

        @NonNull
        public MessagingStyle addMessage(@Nullable CharSequence charSequence, long j, @Nullable Person person) {
            addMessage(new Message(charSequence, j, person));
            return this;
        }

        @NonNull
        public MessagingStyle addMessage(@Nullable Message message) {
            if (message != null) {
                this.f33628d.add(message);
                if (this.f33628d.size() > 25) {
                    this.f33628d.remove(0);
                }
            }
            return this;
        }

        public MessagingStyle(@NonNull Person person) {
            if (!TextUtils.isEmpty(person.getName())) {
                this.f33630f = person;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }
}
