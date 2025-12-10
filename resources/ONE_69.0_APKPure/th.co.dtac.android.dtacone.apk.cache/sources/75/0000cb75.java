package io.grpc;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.net.SocketAddress;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

@Internal
/* loaded from: classes5.dex */
public final class InternalChannelz {

    /* renamed from: f */
    public static final Logger f63246f = Logger.getLogger(InternalChannelz.class.getName());

    /* renamed from: g */
    public static final InternalChannelz f63247g = new InternalChannelz();

    /* renamed from: a */
    public final ConcurrentNavigableMap f63248a = new ConcurrentSkipListMap();

    /* renamed from: b */
    public final ConcurrentNavigableMap f63249b = new ConcurrentSkipListMap();

    /* renamed from: c */
    public final ConcurrentMap f63250c = new ConcurrentHashMap();

    /* renamed from: d */
    public final ConcurrentMap f63251d = new ConcurrentHashMap();

    /* renamed from: e */
    public final ConcurrentMap f63252e = new ConcurrentHashMap();

    @Immutable
    /* loaded from: classes5.dex */
    public static final class ChannelStats {
        public final long callsFailed;
        public final long callsStarted;
        public final long callsSucceeded;
        @Nullable
        public final ChannelTrace channelTrace;
        public final long lastCallStartedNanos;
        public final List<InternalWithLogId> sockets;
        public final ConnectivityState state;
        public final List<InternalWithLogId> subchannels;
        public final String target;

        /* loaded from: classes5.dex */
        public static final class Builder {

            /* renamed from: a */
            public String f63253a;

            /* renamed from: b */
            public ConnectivityState f63254b;

            /* renamed from: c */
            public ChannelTrace f63255c;

            /* renamed from: d */
            public long f63256d;

            /* renamed from: e */
            public long f63257e;

            /* renamed from: f */
            public long f63258f;

            /* renamed from: g */
            public long f63259g;

            /* renamed from: h */
            public List f63260h = Collections.emptyList();

            /* renamed from: i */
            public List f63261i = Collections.emptyList();

            public ChannelStats build() {
                return new ChannelStats(this.f63253a, this.f63254b, this.f63255c, this.f63256d, this.f63257e, this.f63258f, this.f63259g, this.f63260h, this.f63261i);
            }

            public Builder setCallsFailed(long j) {
                this.f63258f = j;
                return this;
            }

            public Builder setCallsStarted(long j) {
                this.f63256d = j;
                return this;
            }

            public Builder setCallsSucceeded(long j) {
                this.f63257e = j;
                return this;
            }

            public Builder setChannelTrace(ChannelTrace channelTrace) {
                this.f63255c = channelTrace;
                return this;
            }

            public Builder setLastCallStartedNanos(long j) {
                this.f63259g = j;
                return this;
            }

            public Builder setSockets(List<InternalWithLogId> list) {
                Preconditions.checkState(this.f63260h.isEmpty());
                this.f63261i = Collections.unmodifiableList((List) Preconditions.checkNotNull(list));
                return this;
            }

            public Builder setState(ConnectivityState connectivityState) {
                this.f63254b = connectivityState;
                return this;
            }

            public Builder setSubchannels(List<InternalWithLogId> list) {
                Preconditions.checkState(this.f63261i.isEmpty());
                this.f63260h = Collections.unmodifiableList((List) Preconditions.checkNotNull(list));
                return this;
            }

            public Builder setTarget(String str) {
                this.f63253a = str;
                return this;
            }
        }

        public ChannelStats(String str, ConnectivityState connectivityState, ChannelTrace channelTrace, long j, long j2, long j3, long j4, List list, List list2) {
            Preconditions.checkState(list.isEmpty() || list2.isEmpty(), "channels can have subchannels only, subchannels can have either sockets OR subchannels, neither can have both");
            this.target = str;
            this.state = connectivityState;
            this.channelTrace = channelTrace;
            this.callsStarted = j;
            this.callsSucceeded = j2;
            this.callsFailed = j3;
            this.lastCallStartedNanos = j4;
            this.subchannels = (List) Preconditions.checkNotNull(list);
            this.sockets = (List) Preconditions.checkNotNull(list2);
        }
    }

    @Immutable
    /* loaded from: classes5.dex */
    public static final class ChannelTrace {
        public final long creationTimeNanos;
        public final List<Event> events;
        public final long numEventsLogged;

        /* loaded from: classes5.dex */
        public static final class Builder {

            /* renamed from: a */
            public Long f63262a;

            /* renamed from: b */
            public Long f63263b;

            /* renamed from: c */
            public List f63264c = Collections.emptyList();

            public ChannelTrace build() {
                Preconditions.checkNotNull(this.f63262a, "numEventsLogged");
                Preconditions.checkNotNull(this.f63263b, "creationTimeNanos");
                return new ChannelTrace(this.f63262a.longValue(), this.f63263b.longValue(), this.f63264c);
            }

            public Builder setCreationTimeNanos(long j) {
                this.f63263b = Long.valueOf(j);
                return this;
            }

            public Builder setEvents(List<Event> list) {
                this.f63264c = Collections.unmodifiableList(new ArrayList(list));
                return this;
            }

            public Builder setNumEventsLogged(long j) {
                this.f63262a = Long.valueOf(j);
                return this;
            }
        }

        @Immutable
        /* loaded from: classes5.dex */
        public static final class Event {
            @Nullable
            public final InternalWithLogId channelRef;
            public final String description;
            public final Severity severity;
            @Nullable
            public final InternalWithLogId subchannelRef;
            public final long timestampNanos;

            /* loaded from: classes5.dex */
            public static final class Builder {

                /* renamed from: a */
                public String f63265a;

                /* renamed from: b */
                public Severity f63266b;

                /* renamed from: c */
                public Long f63267c;

                /* renamed from: d */
                public InternalWithLogId f63268d;

                /* renamed from: e */
                public InternalWithLogId f63269e;

                public Event build() {
                    boolean z;
                    Preconditions.checkNotNull(this.f63265a, "description");
                    Preconditions.checkNotNull(this.f63266b, "severity");
                    Preconditions.checkNotNull(this.f63267c, "timestampNanos");
                    if (this.f63268d != null && this.f63269e != null) {
                        z = false;
                    } else {
                        z = true;
                    }
                    Preconditions.checkState(z, "at least one of channelRef and subchannelRef must be null");
                    return new Event(this.f63265a, this.f63266b, this.f63267c.longValue(), this.f63268d, this.f63269e);
                }

                public Builder setChannelRef(InternalWithLogId internalWithLogId) {
                    this.f63268d = internalWithLogId;
                    return this;
                }

                public Builder setDescription(String str) {
                    this.f63265a = str;
                    return this;
                }

                public Builder setSeverity(Severity severity) {
                    this.f63266b = severity;
                    return this;
                }

                public Builder setSubchannelRef(InternalWithLogId internalWithLogId) {
                    this.f63269e = internalWithLogId;
                    return this;
                }

                public Builder setTimestampNanos(long j) {
                    this.f63267c = Long.valueOf(j);
                    return this;
                }
            }

            /* loaded from: classes5.dex */
            public enum Severity {
                CT_UNKNOWN,
                CT_INFO,
                CT_WARNING,
                CT_ERROR
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                if (!Objects.equal(this.description, event.description) || !Objects.equal(this.severity, event.severity) || this.timestampNanos != event.timestampNanos || !Objects.equal(this.channelRef, event.channelRef) || !Objects.equal(this.subchannelRef, event.subchannelRef)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return Objects.hashCode(this.description, this.severity, Long.valueOf(this.timestampNanos), this.channelRef, this.subchannelRef);
            }

            public String toString() {
                return MoreObjects.toStringHelper(this).add("description", this.description).add("severity", this.severity).add("timestampNanos", this.timestampNanos).add("channelRef", this.channelRef).add("subchannelRef", this.subchannelRef).toString();
            }

            public Event(String str, Severity severity, long j, InternalWithLogId internalWithLogId, InternalWithLogId internalWithLogId2) {
                this.description = str;
                this.severity = (Severity) Preconditions.checkNotNull(severity, "severity");
                this.timestampNanos = j;
                this.channelRef = internalWithLogId;
                this.subchannelRef = internalWithLogId2;
            }
        }

        public ChannelTrace(long j, long j2, List list) {
            this.numEventsLogged = j;
            this.creationTimeNanos = j2;
            this.events = list;
        }
    }

    /* loaded from: classes5.dex */
    public static final class OtherSecurity {
        @Nullable
        public final Object any;
        public final String name;

        public OtherSecurity(String str, @Nullable Object obj) {
            boolean z;
            this.name = (String) Preconditions.checkNotNull(str);
            if (obj != null && !obj.getClass().getName().endsWith("com.google.protobuf.Any")) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkState(z, "the 'any' object must be of type com.google.protobuf.Any");
            this.any = obj;
        }
    }

    /* loaded from: classes5.dex */
    public static final class RootChannelList {
        public final List<InternalInstrumented<ChannelStats>> channels;
        public final boolean end;

        public RootChannelList(List<InternalInstrumented<ChannelStats>> list, boolean z) {
            this.channels = (List) Preconditions.checkNotNull(list);
            this.end = z;
        }
    }

    /* loaded from: classes5.dex */
    public static final class ServerList {
        public final boolean end;
        public final List<InternalInstrumented<ServerStats>> servers;

        public ServerList(List<InternalInstrumented<ServerStats>> list, boolean z) {
            this.servers = (List) Preconditions.checkNotNull(list);
            this.end = z;
        }
    }

    /* loaded from: classes5.dex */
    public static final class ServerSocketMap extends ConcurrentSkipListMap<Long, InternalInstrumented<SocketStats>> {
        private static final long serialVersionUID = -7883772124944661414L;

        private ServerSocketMap() {
        }
    }

    /* loaded from: classes5.dex */
    public static final class ServerSocketsList {
        public final boolean end;
        public final List<InternalWithLogId> sockets;

        public ServerSocketsList(List<InternalWithLogId> list, boolean z) {
            this.sockets = list;
            this.end = z;
        }
    }

    @Immutable
    /* loaded from: classes5.dex */
    public static final class ServerStats {
        public final long callsFailed;
        public final long callsStarted;
        public final long callsSucceeded;
        public final long lastCallStartedNanos;
        public final List<InternalInstrumented<SocketStats>> listenSockets;

        /* loaded from: classes5.dex */
        public static final class Builder {

            /* renamed from: a */
            public long f63270a;

            /* renamed from: b */
            public long f63271b;

            /* renamed from: c */
            public long f63272c;

            /* renamed from: d */
            public long f63273d;
            public List<InternalInstrumented<SocketStats>> listenSockets = new ArrayList();

            public Builder addListenSockets(List<InternalInstrumented<SocketStats>> list) {
                Preconditions.checkNotNull(list, "listenSockets");
                for (InternalInstrumented<SocketStats> internalInstrumented : list) {
                    this.listenSockets.add((InternalInstrumented) Preconditions.checkNotNull(internalInstrumented, "null listen socket"));
                }
                return this;
            }

            public ServerStats build() {
                return new ServerStats(this.f63270a, this.f63271b, this.f63272c, this.f63273d, this.listenSockets);
            }

            public Builder setCallsFailed(long j) {
                this.f63272c = j;
                return this;
            }

            public Builder setCallsStarted(long j) {
                this.f63270a = j;
                return this;
            }

            public Builder setCallsSucceeded(long j) {
                this.f63271b = j;
                return this;
            }

            public Builder setLastCallStartedNanos(long j) {
                this.f63273d = j;
                return this;
            }
        }

        public ServerStats(long j, long j2, long j3, long j4, List<InternalInstrumented<SocketStats>> list) {
            this.callsStarted = j;
            this.callsSucceeded = j2;
            this.callsFailed = j3;
            this.lastCallStartedNanos = j4;
            this.listenSockets = (List) Preconditions.checkNotNull(list);
        }
    }

    /* loaded from: classes5.dex */
    public static final class SocketOptions {
        @Nullable
        public final Integer lingerSeconds;
        public final Map<String, String> others;
        @Nullable
        public final Integer soTimeoutMillis;
        @Nullable
        public final TcpInfo tcpInfo;

        /* loaded from: classes5.dex */
        public static final class Builder {

            /* renamed from: a */
            public final Map f63274a = new HashMap();

            /* renamed from: b */
            public TcpInfo f63275b;

            /* renamed from: c */
            public Integer f63276c;

            /* renamed from: d */
            public Integer f63277d;

            public Builder addOption(String str, String str2) {
                this.f63274a.put(str, (String) Preconditions.checkNotNull(str2));
                return this;
            }

            public SocketOptions build() {
                return new SocketOptions(this.f63276c, this.f63277d, this.f63275b, this.f63274a);
            }

            public Builder setSocketOptionLingerSeconds(Integer num) {
                this.f63277d = num;
                return this;
            }

            public Builder setSocketOptionTimeoutMillis(Integer num) {
                this.f63276c = num;
                return this;
            }

            public Builder setTcpInfo(TcpInfo tcpInfo) {
                this.f63275b = tcpInfo;
                return this;
            }

            public Builder addOption(String str, int i) {
                this.f63274a.put(str, Integer.toString(i));
                return this;
            }

            public Builder addOption(String str, boolean z) {
                this.f63274a.put(str, Boolean.toString(z));
                return this;
            }
        }

        public SocketOptions(@Nullable Integer num, @Nullable Integer num2, @Nullable TcpInfo tcpInfo, Map<String, String> map) {
            Preconditions.checkNotNull(map);
            this.soTimeoutMillis = num;
            this.lingerSeconds = num2;
            this.tcpInfo = tcpInfo;
            this.others = Collections.unmodifiableMap(new HashMap(map));
        }
    }

    /* loaded from: classes5.dex */
    public static final class SocketStats {
        @Nullable
        public final TransportStats data;
        @Nullable
        public final SocketAddress local;
        @Nullable
        public final SocketAddress remote;
        @Nullable
        public final Security security;
        public final SocketOptions socketOptions;

        public SocketStats(TransportStats transportStats, @Nullable SocketAddress socketAddress, @Nullable SocketAddress socketAddress2, SocketOptions socketOptions, Security security) {
            this.data = transportStats;
            this.local = (SocketAddress) Preconditions.checkNotNull(socketAddress, "local socket");
            this.remote = socketAddress2;
            this.socketOptions = (SocketOptions) Preconditions.checkNotNull(socketOptions);
            this.security = security;
        }
    }

    /* loaded from: classes5.dex */
    public static final class TcpInfo {
        public final int advmss;
        public final int ato;
        public final int backoff;
        public final int caState;
        public final int fackets;
        public final int lastAckRecv;
        public final int lastAckSent;
        public final int lastDataRecv;
        public final int lastDataSent;
        public final int lost;
        public final int options;
        public final int pmtu;
        public final int probes;
        public final int rcvMss;
        public final int rcvSsthresh;
        public final int rcvWscale;
        public final int reordering;
        public final int retrans;
        public final int retransmits;
        public final int rto;
        public final int rtt;
        public final int rttvar;
        public final int sacked;
        public final int sndCwnd;
        public final int sndMss;
        public final int sndSsthresh;
        public final int sndWscale;
        public final int state;
        public final int unacked;

        /* loaded from: classes5.dex */
        public static final class Builder {

            /* renamed from: A */
            public int f63278A;

            /* renamed from: B */
            public int f63279B;

            /* renamed from: C */
            public int f63280C;

            /* renamed from: a */
            public int f63281a;

            /* renamed from: b */
            public int f63282b;

            /* renamed from: c */
            public int f63283c;

            /* renamed from: d */
            public int f63284d;

            /* renamed from: e */
            public int f63285e;

            /* renamed from: f */
            public int f63286f;

            /* renamed from: g */
            public int f63287g;

            /* renamed from: h */
            public int f63288h;

            /* renamed from: i */
            public int f63289i;

            /* renamed from: j */
            public int f63290j;

            /* renamed from: k */
            public int f63291k;

            /* renamed from: l */
            public int f63292l;

            /* renamed from: m */
            public int f63293m;

            /* renamed from: n */
            public int f63294n;

            /* renamed from: o */
            public int f63295o;

            /* renamed from: p */
            public int f63296p;

            /* renamed from: q */
            public int f63297q;

            /* renamed from: r */
            public int f63298r;

            /* renamed from: s */
            public int f63299s;

            /* renamed from: t */
            public int f63300t;

            /* renamed from: u */
            public int f63301u;

            /* renamed from: v */
            public int f63302v;

            /* renamed from: w */
            public int f63303w;

            /* renamed from: x */
            public int f63304x;

            /* renamed from: y */
            public int f63305y;

            /* renamed from: z */
            public int f63306z;

            public TcpInfo build() {
                return new TcpInfo(this.f63281a, this.f63282b, this.f63283c, this.f63284d, this.f63285e, this.f63286f, this.f63287g, this.f63288h, this.f63289i, this.f63290j, this.f63291k, this.f63292l, this.f63293m, this.f63294n, this.f63295o, this.f63296p, this.f63297q, this.f63298r, this.f63299s, this.f63300t, this.f63301u, this.f63302v, this.f63303w, this.f63304x, this.f63305y, this.f63306z, this.f63278A, this.f63279B, this.f63280C);
            }

            public Builder setAdvmss(int i) {
                this.f63279B = i;
                return this;
            }

            public Builder setAto(int i) {
                this.f63290j = i;
                return this;
            }

            public Builder setBackoff(int i) {
                this.f63285e = i;
                return this;
            }

            public Builder setCaState(int i) {
                this.f63282b = i;
                return this;
            }

            public Builder setFackets(int i) {
                this.f63297q = i;
                return this;
            }

            public Builder setLastAckRecv(int i) {
                this.f63301u = i;
                return this;
            }

            public Builder setLastAckSent(int i) {
                this.f63299s = i;
                return this;
            }

            public Builder setLastDataRecv(int i) {
                this.f63300t = i;
                return this;
            }

            public Builder setLastDataSent(int i) {
                this.f63298r = i;
                return this;
            }

            public Builder setLost(int i) {
                this.f63295o = i;
                return this;
            }

            public Builder setOptions(int i) {
                this.f63286f = i;
                return this;
            }

            public Builder setPmtu(int i) {
                this.f63302v = i;
                return this;
            }

            public Builder setProbes(int i) {
                this.f63284d = i;
                return this;
            }

            public Builder setRcvMss(int i) {
                this.f63292l = i;
                return this;
            }

            public Builder setRcvSsthresh(int i) {
                this.f63303w = i;
                return this;
            }

            public Builder setRcvWscale(int i) {
                this.f63288h = i;
                return this;
            }

            public Builder setReordering(int i) {
                this.f63280C = i;
                return this;
            }

            public Builder setRetrans(int i) {
                this.f63296p = i;
                return this;
            }

            public Builder setRetransmits(int i) {
                this.f63283c = i;
                return this;
            }

            public Builder setRto(int i) {
                this.f63289i = i;
                return this;
            }

            public Builder setRtt(int i) {
                this.f63304x = i;
                return this;
            }

            public Builder setRttvar(int i) {
                this.f63305y = i;
                return this;
            }

            public Builder setSacked(int i) {
                this.f63294n = i;
                return this;
            }

            public Builder setSndCwnd(int i) {
                this.f63278A = i;
                return this;
            }

            public Builder setSndMss(int i) {
                this.f63291k = i;
                return this;
            }

            public Builder setSndSsthresh(int i) {
                this.f63306z = i;
                return this;
            }

            public Builder setSndWscale(int i) {
                this.f63287g = i;
                return this;
            }

            public Builder setState(int i) {
                this.f63281a = i;
                return this;
            }

            public Builder setUnacked(int i) {
                this.f63293m = i;
                return this;
            }
        }

        public TcpInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29) {
            this.state = i;
            this.caState = i2;
            this.retransmits = i3;
            this.probes = i4;
            this.backoff = i5;
            this.options = i6;
            this.sndWscale = i7;
            this.rcvWscale = i8;
            this.rto = i9;
            this.ato = i10;
            this.sndMss = i11;
            this.rcvMss = i12;
            this.unacked = i13;
            this.sacked = i14;
            this.lost = i15;
            this.retrans = i16;
            this.fackets = i17;
            this.lastDataSent = i18;
            this.lastAckSent = i19;
            this.lastDataRecv = i20;
            this.lastAckRecv = i21;
            this.pmtu = i22;
            this.rcvSsthresh = i23;
            this.rtt = i24;
            this.rttvar = i25;
            this.sndSsthresh = i26;
            this.sndCwnd = i27;
            this.advmss = i28;
            this.reordering = i29;
        }
    }

    @Immutable
    /* loaded from: classes5.dex */
    public static final class TransportStats {
        public final long keepAlivesSent;
        public final long lastLocalStreamCreatedTimeNanos;
        public final long lastMessageReceivedTimeNanos;
        public final long lastMessageSentTimeNanos;
        public final long lastRemoteStreamCreatedTimeNanos;
        public final long localFlowControlWindow;
        public final long messagesReceived;
        public final long messagesSent;
        public final long remoteFlowControlWindow;
        public final long streamsFailed;
        public final long streamsStarted;
        public final long streamsSucceeded;

        public TransportStats(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
            this.streamsStarted = j;
            this.lastLocalStreamCreatedTimeNanos = j2;
            this.lastRemoteStreamCreatedTimeNanos = j3;
            this.streamsSucceeded = j4;
            this.streamsFailed = j5;
            this.messagesSent = j6;
            this.messagesReceived = j7;
            this.keepAlivesSent = j8;
            this.lastMessageSentTimeNanos = j9;
            this.lastMessageReceivedTimeNanos = j10;
            this.localFlowControlWindow = j11;
            this.remoteFlowControlWindow = j12;
        }
    }

    /* renamed from: b */
    public static void m30770b(Map map, InternalInstrumented internalInstrumented) {
        InternalInstrumented internalInstrumented2 = (InternalInstrumented) map.put(Long.valueOf(internalInstrumented.getLogId().getId()), internalInstrumented);
    }

    /* renamed from: c */
    public static boolean m30769c(Map map, InternalLogId internalLogId) {
        return map.containsKey(Long.valueOf(internalLogId.getId()));
    }

    /* renamed from: e */
    public static void m30767e(Map map, InternalInstrumented internalInstrumented) {
        InternalInstrumented internalInstrumented2 = (InternalInstrumented) map.remove(Long.valueOf(m30766id(internalInstrumented)));
    }

    /* renamed from: id */
    public static long m30766id(InternalWithLogId internalWithLogId) {
        return internalWithLogId.getLogId().getId();
    }

    public static InternalChannelz instance() {
        return f63247g;
    }

    public void addClientSocket(InternalInstrumented<SocketStats> internalInstrumented) {
        m30770b(this.f63251d, internalInstrumented);
    }

    public void addListenSocket(InternalInstrumented<SocketStats> internalInstrumented) {
        m30770b(this.f63251d, internalInstrumented);
    }

    public void addRootChannel(InternalInstrumented<ChannelStats> internalInstrumented) {
        m30770b(this.f63249b, internalInstrumented);
    }

    public void addServer(InternalInstrumented<ServerStats> internalInstrumented) {
        ServerSocketMap serverSocketMap = (ServerSocketMap) this.f63252e.put(Long.valueOf(m30766id(internalInstrumented)), new ServerSocketMap());
        m30770b(this.f63248a, internalInstrumented);
    }

    public void addServerSocket(InternalInstrumented<ServerStats> internalInstrumented, InternalInstrumented<SocketStats> internalInstrumented2) {
        m30770b((ServerSocketMap) this.f63252e.get(Long.valueOf(m30766id(internalInstrumented))), internalInstrumented2);
    }

    public void addSubchannel(InternalInstrumented<ChannelStats> internalInstrumented) {
        m30770b(this.f63250c, internalInstrumented);
    }

    @VisibleForTesting
    public boolean containsClientSocket(InternalLogId internalLogId) {
        return m30769c(this.f63251d, internalLogId);
    }

    @VisibleForTesting
    public boolean containsServer(InternalLogId internalLogId) {
        return m30769c(this.f63248a, internalLogId);
    }

    @VisibleForTesting
    public boolean containsSubchannel(InternalLogId internalLogId) {
        return m30769c(this.f63250c, internalLogId);
    }

    /* renamed from: d */
    public final InternalInstrumented m30768d(long j) {
        for (ServerSocketMap serverSocketMap : this.f63252e.values()) {
            InternalInstrumented<SocketStats> internalInstrumented = serverSocketMap.get(Long.valueOf(j));
            if (internalInstrumented != null) {
                return internalInstrumented;
            }
        }
        return null;
    }

    @Nullable
    public InternalInstrumented<ChannelStats> getChannel(long j) {
        return (InternalInstrumented) this.f63249b.get(Long.valueOf(j));
    }

    public InternalInstrumented<ChannelStats> getRootChannel(long j) {
        return (InternalInstrumented) this.f63249b.get(Long.valueOf(j));
    }

    public RootChannelList getRootChannels(long j, int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f63249b.tailMap((ConcurrentNavigableMap) Long.valueOf(j)).values().iterator();
        while (it.hasNext() && arrayList.size() < i) {
            arrayList.add((InternalInstrumented) it.next());
        }
        return new RootChannelList(arrayList, !it.hasNext());
    }

    @Nullable
    public InternalInstrumented<ServerStats> getServer(long j) {
        return (InternalInstrumented) this.f63248a.get(Long.valueOf(j));
    }

    @Nullable
    public ServerSocketsList getServerSockets(long j, long j2, int i) {
        ServerSocketMap serverSocketMap = (ServerSocketMap) this.f63252e.get(Long.valueOf(j));
        if (serverSocketMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator<InternalInstrumented<SocketStats>> it = serverSocketMap.tailMap((ServerSocketMap) Long.valueOf(j2)).values().iterator();
        while (arrayList.size() < i && it.hasNext()) {
            arrayList.add(it.next());
        }
        return new ServerSocketsList(arrayList, !it.hasNext());
    }

    public ServerList getServers(long j, int i) {
        ArrayList arrayList = new ArrayList(i);
        Iterator it = this.f63248a.tailMap((ConcurrentNavigableMap) Long.valueOf(j)).values().iterator();
        while (it.hasNext() && arrayList.size() < i) {
            arrayList.add((InternalInstrumented) it.next());
        }
        return new ServerList(arrayList, !it.hasNext());
    }

    @Nullable
    public InternalInstrumented<SocketStats> getSocket(long j) {
        InternalInstrumented<SocketStats> internalInstrumented = (InternalInstrumented) this.f63251d.get(Long.valueOf(j));
        if (internalInstrumented != null) {
            return internalInstrumented;
        }
        return m30768d(j);
    }

    @Nullable
    public InternalInstrumented<ChannelStats> getSubchannel(long j) {
        return (InternalInstrumented) this.f63250c.get(Long.valueOf(j));
    }

    public void removeClientSocket(InternalInstrumented<SocketStats> internalInstrumented) {
        m30767e(this.f63251d, internalInstrumented);
    }

    public void removeListenSocket(InternalInstrumented<SocketStats> internalInstrumented) {
        m30767e(this.f63251d, internalInstrumented);
    }

    public void removeRootChannel(InternalInstrumented<ChannelStats> internalInstrumented) {
        m30767e(this.f63249b, internalInstrumented);
    }

    public void removeServer(InternalInstrumented<ServerStats> internalInstrumented) {
        m30767e(this.f63248a, internalInstrumented);
        ServerSocketMap serverSocketMap = (ServerSocketMap) this.f63252e.remove(Long.valueOf(m30766id(internalInstrumented)));
    }

    public void removeServerSocket(InternalInstrumented<ServerStats> internalInstrumented, InternalInstrumented<SocketStats> internalInstrumented2) {
        m30767e((ServerSocketMap) this.f63252e.get(Long.valueOf(m30766id(internalInstrumented))), internalInstrumented2);
    }

    public void removeSubchannel(InternalInstrumented<ChannelStats> internalInstrumented) {
        m30767e(this.f63250c, internalInstrumented);
    }

    /* loaded from: classes5.dex */
    public static final class Security {
        @Nullable
        public final OtherSecurity other;
        @Nullable
        public final Tls tls;

        public Security(Tls tls) {
            this.tls = (Tls) Preconditions.checkNotNull(tls);
            this.other = null;
        }

        public Security(OtherSecurity otherSecurity) {
            this.tls = null;
            this.other = (OtherSecurity) Preconditions.checkNotNull(otherSecurity);
        }
    }

    @Immutable
    /* loaded from: classes5.dex */
    public static final class Tls {
        public final String cipherSuiteStandardName;
        @Nullable
        public final Certificate localCert;
        @Nullable
        public final Certificate remoteCert;

        public Tls(String str, Certificate certificate, Certificate certificate2) {
            this.cipherSuiteStandardName = str;
            this.localCert = certificate;
            this.remoteCert = certificate2;
        }

        public Tls(SSLSession sSLSession) {
            String cipherSuite = sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            Certificate certificate = null;
            Certificate certificate2 = localCertificates != null ? localCertificates[0] : null;
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    certificate = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e) {
                InternalChannelz.f63246f.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", sSLSession.getPeerHost()), (Throwable) e);
            }
            this.cipherSuiteStandardName = cipherSuite;
            this.localCert = certificate2;
            this.remoteCert = certificate;
        }
    }
}