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
    public static final Logger f63183f = Logger.getLogger(InternalChannelz.class.getName());

    /* renamed from: g */
    public static final InternalChannelz f63184g = new InternalChannelz();

    /* renamed from: a */
    public final ConcurrentNavigableMap f63185a = new ConcurrentSkipListMap();

    /* renamed from: b */
    public final ConcurrentNavigableMap f63186b = new ConcurrentSkipListMap();

    /* renamed from: c */
    public final ConcurrentMap f63187c = new ConcurrentHashMap();

    /* renamed from: d */
    public final ConcurrentMap f63188d = new ConcurrentHashMap();

    /* renamed from: e */
    public final ConcurrentMap f63189e = new ConcurrentHashMap();

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
            public String f63190a;

            /* renamed from: b */
            public ConnectivityState f63191b;

            /* renamed from: c */
            public ChannelTrace f63192c;

            /* renamed from: d */
            public long f63193d;

            /* renamed from: e */
            public long f63194e;

            /* renamed from: f */
            public long f63195f;

            /* renamed from: g */
            public long f63196g;

            /* renamed from: h */
            public List f63197h = Collections.emptyList();

            /* renamed from: i */
            public List f63198i = Collections.emptyList();

            public ChannelStats build() {
                return new ChannelStats(this.f63190a, this.f63191b, this.f63192c, this.f63193d, this.f63194e, this.f63195f, this.f63196g, this.f63197h, this.f63198i);
            }

            public Builder setCallsFailed(long j) {
                this.f63195f = j;
                return this;
            }

            public Builder setCallsStarted(long j) {
                this.f63193d = j;
                return this;
            }

            public Builder setCallsSucceeded(long j) {
                this.f63194e = j;
                return this;
            }

            public Builder setChannelTrace(ChannelTrace channelTrace) {
                this.f63192c = channelTrace;
                return this;
            }

            public Builder setLastCallStartedNanos(long j) {
                this.f63196g = j;
                return this;
            }

            public Builder setSockets(List<InternalWithLogId> list) {
                Preconditions.checkState(this.f63197h.isEmpty());
                this.f63198i = Collections.unmodifiableList((List) Preconditions.checkNotNull(list));
                return this;
            }

            public Builder setState(ConnectivityState connectivityState) {
                this.f63191b = connectivityState;
                return this;
            }

            public Builder setSubchannels(List<InternalWithLogId> list) {
                Preconditions.checkState(this.f63198i.isEmpty());
                this.f63197h = Collections.unmodifiableList((List) Preconditions.checkNotNull(list));
                return this;
            }

            public Builder setTarget(String str) {
                this.f63190a = str;
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
            public Long f63199a;

            /* renamed from: b */
            public Long f63200b;

            /* renamed from: c */
            public List f63201c = Collections.emptyList();

            public ChannelTrace build() {
                Preconditions.checkNotNull(this.f63199a, "numEventsLogged");
                Preconditions.checkNotNull(this.f63200b, "creationTimeNanos");
                return new ChannelTrace(this.f63199a.longValue(), this.f63200b.longValue(), this.f63201c);
            }

            public Builder setCreationTimeNanos(long j) {
                this.f63200b = Long.valueOf(j);
                return this;
            }

            public Builder setEvents(List<Event> list) {
                this.f63201c = Collections.unmodifiableList(new ArrayList(list));
                return this;
            }

            public Builder setNumEventsLogged(long j) {
                this.f63199a = Long.valueOf(j);
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
                public String f63202a;

                /* renamed from: b */
                public Severity f63203b;

                /* renamed from: c */
                public Long f63204c;

                /* renamed from: d */
                public InternalWithLogId f63205d;

                /* renamed from: e */
                public InternalWithLogId f63206e;

                public Event build() {
                    boolean z;
                    Preconditions.checkNotNull(this.f63202a, "description");
                    Preconditions.checkNotNull(this.f63203b, "severity");
                    Preconditions.checkNotNull(this.f63204c, "timestampNanos");
                    if (this.f63205d != null && this.f63206e != null) {
                        z = false;
                    } else {
                        z = true;
                    }
                    Preconditions.checkState(z, "at least one of channelRef and subchannelRef must be null");
                    return new Event(this.f63202a, this.f63203b, this.f63204c.longValue(), this.f63205d, this.f63206e);
                }

                public Builder setChannelRef(InternalWithLogId internalWithLogId) {
                    this.f63205d = internalWithLogId;
                    return this;
                }

                public Builder setDescription(String str) {
                    this.f63202a = str;
                    return this;
                }

                public Builder setSeverity(Severity severity) {
                    this.f63203b = severity;
                    return this;
                }

                public Builder setSubchannelRef(InternalWithLogId internalWithLogId) {
                    this.f63206e = internalWithLogId;
                    return this;
                }

                public Builder setTimestampNanos(long j) {
                    this.f63204c = Long.valueOf(j);
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
            public long f63207a;

            /* renamed from: b */
            public long f63208b;

            /* renamed from: c */
            public long f63209c;

            /* renamed from: d */
            public long f63210d;
            public List<InternalInstrumented<SocketStats>> listenSockets = new ArrayList();

            public Builder addListenSockets(List<InternalInstrumented<SocketStats>> list) {
                Preconditions.checkNotNull(list, "listenSockets");
                for (InternalInstrumented<SocketStats> internalInstrumented : list) {
                    this.listenSockets.add((InternalInstrumented) Preconditions.checkNotNull(internalInstrumented, "null listen socket"));
                }
                return this;
            }

            public ServerStats build() {
                return new ServerStats(this.f63207a, this.f63208b, this.f63209c, this.f63210d, this.listenSockets);
            }

            public Builder setCallsFailed(long j) {
                this.f63209c = j;
                return this;
            }

            public Builder setCallsStarted(long j) {
                this.f63207a = j;
                return this;
            }

            public Builder setCallsSucceeded(long j) {
                this.f63208b = j;
                return this;
            }

            public Builder setLastCallStartedNanos(long j) {
                this.f63210d = j;
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
            public final Map f63211a = new HashMap();

            /* renamed from: b */
            public TcpInfo f63212b;

            /* renamed from: c */
            public Integer f63213c;

            /* renamed from: d */
            public Integer f63214d;

            public Builder addOption(String str, String str2) {
                this.f63211a.put(str, (String) Preconditions.checkNotNull(str2));
                return this;
            }

            public SocketOptions build() {
                return new SocketOptions(this.f63213c, this.f63214d, this.f63212b, this.f63211a);
            }

            public Builder setSocketOptionLingerSeconds(Integer num) {
                this.f63214d = num;
                return this;
            }

            public Builder setSocketOptionTimeoutMillis(Integer num) {
                this.f63213c = num;
                return this;
            }

            public Builder setTcpInfo(TcpInfo tcpInfo) {
                this.f63212b = tcpInfo;
                return this;
            }

            public Builder addOption(String str, int i) {
                this.f63211a.put(str, Integer.toString(i));
                return this;
            }

            public Builder addOption(String str, boolean z) {
                this.f63211a.put(str, Boolean.toString(z));
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
            public int f63215A;

            /* renamed from: B */
            public int f63216B;

            /* renamed from: C */
            public int f63217C;

            /* renamed from: a */
            public int f63218a;

            /* renamed from: b */
            public int f63219b;

            /* renamed from: c */
            public int f63220c;

            /* renamed from: d */
            public int f63221d;

            /* renamed from: e */
            public int f63222e;

            /* renamed from: f */
            public int f63223f;

            /* renamed from: g */
            public int f63224g;

            /* renamed from: h */
            public int f63225h;

            /* renamed from: i */
            public int f63226i;

            /* renamed from: j */
            public int f63227j;

            /* renamed from: k */
            public int f63228k;

            /* renamed from: l */
            public int f63229l;

            /* renamed from: m */
            public int f63230m;

            /* renamed from: n */
            public int f63231n;

            /* renamed from: o */
            public int f63232o;

            /* renamed from: p */
            public int f63233p;

            /* renamed from: q */
            public int f63234q;

            /* renamed from: r */
            public int f63235r;

            /* renamed from: s */
            public int f63236s;

            /* renamed from: t */
            public int f63237t;

            /* renamed from: u */
            public int f63238u;

            /* renamed from: v */
            public int f63239v;

            /* renamed from: w */
            public int f63240w;

            /* renamed from: x */
            public int f63241x;

            /* renamed from: y */
            public int f63242y;

            /* renamed from: z */
            public int f63243z;

            public TcpInfo build() {
                return new TcpInfo(this.f63218a, this.f63219b, this.f63220c, this.f63221d, this.f63222e, this.f63223f, this.f63224g, this.f63225h, this.f63226i, this.f63227j, this.f63228k, this.f63229l, this.f63230m, this.f63231n, this.f63232o, this.f63233p, this.f63234q, this.f63235r, this.f63236s, this.f63237t, this.f63238u, this.f63239v, this.f63240w, this.f63241x, this.f63242y, this.f63243z, this.f63215A, this.f63216B, this.f63217C);
            }

            public Builder setAdvmss(int i) {
                this.f63216B = i;
                return this;
            }

            public Builder setAto(int i) {
                this.f63227j = i;
                return this;
            }

            public Builder setBackoff(int i) {
                this.f63222e = i;
                return this;
            }

            public Builder setCaState(int i) {
                this.f63219b = i;
                return this;
            }

            public Builder setFackets(int i) {
                this.f63234q = i;
                return this;
            }

            public Builder setLastAckRecv(int i) {
                this.f63238u = i;
                return this;
            }

            public Builder setLastAckSent(int i) {
                this.f63236s = i;
                return this;
            }

            public Builder setLastDataRecv(int i) {
                this.f63237t = i;
                return this;
            }

            public Builder setLastDataSent(int i) {
                this.f63235r = i;
                return this;
            }

            public Builder setLost(int i) {
                this.f63232o = i;
                return this;
            }

            public Builder setOptions(int i) {
                this.f63223f = i;
                return this;
            }

            public Builder setPmtu(int i) {
                this.f63239v = i;
                return this;
            }

            public Builder setProbes(int i) {
                this.f63221d = i;
                return this;
            }

            public Builder setRcvMss(int i) {
                this.f63229l = i;
                return this;
            }

            public Builder setRcvSsthresh(int i) {
                this.f63240w = i;
                return this;
            }

            public Builder setRcvWscale(int i) {
                this.f63225h = i;
                return this;
            }

            public Builder setReordering(int i) {
                this.f63217C = i;
                return this;
            }

            public Builder setRetrans(int i) {
                this.f63233p = i;
                return this;
            }

            public Builder setRetransmits(int i) {
                this.f63220c = i;
                return this;
            }

            public Builder setRto(int i) {
                this.f63226i = i;
                return this;
            }

            public Builder setRtt(int i) {
                this.f63241x = i;
                return this;
            }

            public Builder setRttvar(int i) {
                this.f63242y = i;
                return this;
            }

            public Builder setSacked(int i) {
                this.f63231n = i;
                return this;
            }

            public Builder setSndCwnd(int i) {
                this.f63215A = i;
                return this;
            }

            public Builder setSndMss(int i) {
                this.f63228k = i;
                return this;
            }

            public Builder setSndSsthresh(int i) {
                this.f63243z = i;
                return this;
            }

            public Builder setSndWscale(int i) {
                this.f63224g = i;
                return this;
            }

            public Builder setState(int i) {
                this.f63218a = i;
                return this;
            }

            public Builder setUnacked(int i) {
                this.f63230m = i;
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
    public static void m30430b(Map map, InternalInstrumented internalInstrumented) {
        InternalInstrumented internalInstrumented2 = (InternalInstrumented) map.put(Long.valueOf(internalInstrumented.getLogId().getId()), internalInstrumented);
    }

    /* renamed from: c */
    public static boolean m30429c(Map map, InternalLogId internalLogId) {
        return map.containsKey(Long.valueOf(internalLogId.getId()));
    }

    /* renamed from: e */
    public static void m30427e(Map map, InternalInstrumented internalInstrumented) {
        InternalInstrumented internalInstrumented2 = (InternalInstrumented) map.remove(Long.valueOf(m30426id(internalInstrumented)));
    }

    /* renamed from: id */
    public static long m30426id(InternalWithLogId internalWithLogId) {
        return internalWithLogId.getLogId().getId();
    }

    public static InternalChannelz instance() {
        return f63184g;
    }

    public void addClientSocket(InternalInstrumented<SocketStats> internalInstrumented) {
        m30430b(this.f63188d, internalInstrumented);
    }

    public void addListenSocket(InternalInstrumented<SocketStats> internalInstrumented) {
        m30430b(this.f63188d, internalInstrumented);
    }

    public void addRootChannel(InternalInstrumented<ChannelStats> internalInstrumented) {
        m30430b(this.f63186b, internalInstrumented);
    }

    public void addServer(InternalInstrumented<ServerStats> internalInstrumented) {
        ServerSocketMap serverSocketMap = (ServerSocketMap) this.f63189e.put(Long.valueOf(m30426id(internalInstrumented)), new ServerSocketMap());
        m30430b(this.f63185a, internalInstrumented);
    }

    public void addServerSocket(InternalInstrumented<ServerStats> internalInstrumented, InternalInstrumented<SocketStats> internalInstrumented2) {
        m30430b((ServerSocketMap) this.f63189e.get(Long.valueOf(m30426id(internalInstrumented))), internalInstrumented2);
    }

    public void addSubchannel(InternalInstrumented<ChannelStats> internalInstrumented) {
        m30430b(this.f63187c, internalInstrumented);
    }

    @VisibleForTesting
    public boolean containsClientSocket(InternalLogId internalLogId) {
        return m30429c(this.f63188d, internalLogId);
    }

    @VisibleForTesting
    public boolean containsServer(InternalLogId internalLogId) {
        return m30429c(this.f63185a, internalLogId);
    }

    @VisibleForTesting
    public boolean containsSubchannel(InternalLogId internalLogId) {
        return m30429c(this.f63187c, internalLogId);
    }

    /* renamed from: d */
    public final InternalInstrumented m30428d(long j) {
        for (ServerSocketMap serverSocketMap : this.f63189e.values()) {
            InternalInstrumented<SocketStats> internalInstrumented = serverSocketMap.get(Long.valueOf(j));
            if (internalInstrumented != null) {
                return internalInstrumented;
            }
        }
        return null;
    }

    @Nullable
    public InternalInstrumented<ChannelStats> getChannel(long j) {
        return (InternalInstrumented) this.f63186b.get(Long.valueOf(j));
    }

    public InternalInstrumented<ChannelStats> getRootChannel(long j) {
        return (InternalInstrumented) this.f63186b.get(Long.valueOf(j));
    }

    public RootChannelList getRootChannels(long j, int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f63186b.tailMap((ConcurrentNavigableMap) Long.valueOf(j)).values().iterator();
        while (it.hasNext() && arrayList.size() < i) {
            arrayList.add((InternalInstrumented) it.next());
        }
        return new RootChannelList(arrayList, !it.hasNext());
    }

    @Nullable
    public InternalInstrumented<ServerStats> getServer(long j) {
        return (InternalInstrumented) this.f63185a.get(Long.valueOf(j));
    }

    @Nullable
    public ServerSocketsList getServerSockets(long j, long j2, int i) {
        ServerSocketMap serverSocketMap = (ServerSocketMap) this.f63189e.get(Long.valueOf(j));
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
        Iterator it = this.f63185a.tailMap((ConcurrentNavigableMap) Long.valueOf(j)).values().iterator();
        while (it.hasNext() && arrayList.size() < i) {
            arrayList.add((InternalInstrumented) it.next());
        }
        return new ServerList(arrayList, !it.hasNext());
    }

    @Nullable
    public InternalInstrumented<SocketStats> getSocket(long j) {
        InternalInstrumented<SocketStats> internalInstrumented = (InternalInstrumented) this.f63188d.get(Long.valueOf(j));
        if (internalInstrumented != null) {
            return internalInstrumented;
        }
        return m30428d(j);
    }

    @Nullable
    public InternalInstrumented<ChannelStats> getSubchannel(long j) {
        return (InternalInstrumented) this.f63187c.get(Long.valueOf(j));
    }

    public void removeClientSocket(InternalInstrumented<SocketStats> internalInstrumented) {
        m30427e(this.f63188d, internalInstrumented);
    }

    public void removeListenSocket(InternalInstrumented<SocketStats> internalInstrumented) {
        m30427e(this.f63188d, internalInstrumented);
    }

    public void removeRootChannel(InternalInstrumented<ChannelStats> internalInstrumented) {
        m30427e(this.f63186b, internalInstrumented);
    }

    public void removeServer(InternalInstrumented<ServerStats> internalInstrumented) {
        m30427e(this.f63185a, internalInstrumented);
        ServerSocketMap serverSocketMap = (ServerSocketMap) this.f63189e.remove(Long.valueOf(m30426id(internalInstrumented)));
    }

    public void removeServerSocket(InternalInstrumented<ServerStats> internalInstrumented, InternalInstrumented<SocketStats> internalInstrumented2) {
        m30427e((ServerSocketMap) this.f63189e.get(Long.valueOf(m30426id(internalInstrumented))), internalInstrumented2);
    }

    public void removeSubchannel(InternalInstrumented<ChannelStats> internalInstrumented) {
        m30427e(this.f63187c, internalInstrumented);
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
                InternalChannelz.f63183f.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", sSLSession.getPeerHost()), (Throwable) e);
            }
            this.cipherSuiteStandardName = cipherSuite;
            this.localCert = certificate2;
            this.remoteCert = certificate;
        }
    }
}
