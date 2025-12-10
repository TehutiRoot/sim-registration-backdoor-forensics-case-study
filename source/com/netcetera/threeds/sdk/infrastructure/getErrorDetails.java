package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes5.dex */
public final class getErrorDetails extends ErrorMessage {
    private static int ThreeDS2Service = 0;
    public static long ThreeDS2ServiceInstance = 0;
    private static int get = 1;
    public static char[] valueOf;

    static {
        char[] cArr = new char[1994];
        ByteBuffer.wrap("\u0000A(\u008cQHz\u0004¢ÀË\u009côX\u001d\u0015EÕn®\u0000M(õQ1zq¢\u009cËøô+\u001dgE¡n¯\u0097jÀsè\u0091\u0011û:\u0001cF\u008b\u0081´\u001bÝq\u0005·.ñW:\u0080_¨\u0093Ñäú\r#AK\u009etÛ\u009d#ÆRî\u008d\u0017è@Jh\u009b\u0091úº1ã}\u000b\u00ad4è]\"\u0086M®\u0099×ã\u00007)VQ¿zü£\u0003Ë\u0086ôù\u001d>Frn\u008b\u0097æÀ2éb\u0011\u009d:Ác\u0000\u008cQ´ ÝÞ\u0006\u0010/MWî\u0080=©CÑ´úÛ#1L`t¶\u009dÍÆ\tï]\u0017\u0095@ûi \u0092Nº¢ã;\f@4\u0084]Ò\u0086\u0001¯\u0011×\u0094\u0000Ã)&R]z\u0080£ÝÌ\u000eõM\u001d\u0083FÁo\r\u0097\u00adÀñé2\u0012T:¥cï\u008c5µqÝ´\u0006¦/\nXT\u0080\u0082©·Ò\"úÎ#\u0081L\u001fuS\u009d\u0096Æíï\u000f\u0018m@\u009fiÑ\u0092\u0013»Qãý\fÝ5\u0001^C\u0086Ô¯5ØV\u0000¢)ëR\u0004{^£¹Ì®õa\u001e&F\u008aoÔ\u0098\u0001Ácé\u0092\u0012\u0011;Tc\u0081\u008céµ;Þ\u001d\u0006\u008e/ÁX\u000b\u0081^©§ÒÙû\n$FL¨uã\u009eRÆ¢ïÄ\u0018)A\u001ei¾\u0092Þ»-äN\f³5ã^\u0016\u0087{¯\u0091ØÀ\u0001\u0016)\u00adRé{8¤uÌ\u0094õê\u001e5Gyo\u0084\u0098ôÁ êJ\u0012\u009b;½dt\u008dIµúÞ6\u0007X/\u0093XÂ\u00812ªTÒ¹û®$\u000eMnu\u009d\u009eßÇ\u0019ðs\u0018\u0089A\u001bja\u0092°»æä=\ry5 ^å\u0087$°lØ¸\u0001õ*\u0004SZ{¨¤âÍQõª\u001eØG*pd\u0098¢ÁÒê\u0002\u0013/;\u0089dá\u008d3¶DÞ\u0082\u0007ò0$X»\u0081îª\u001eÓTû«$âMUvE\u009e\u008fÇ\u00adð>\u0019rAþj¸\u00933¼HäÔ\r\u001b6z^½\u0087ø°\u000bÙS\u0001\u00ad*öS\u0019|n¤\u009dÍÈö\t\u001fsG\u008dp8\u0099yÁ\u0083êç\u0013\u0004<Kdª\u008dí¶6ß{\u0007£0ÝY&\u0082Iª¾ÓÍüx$¹MÃv=\u009fhÇ©ðÓ\u00197Bvj\u009b\u0093Ö¼>åH\r\u008d6È_\r\u0087½°ÓÙ3\u0002q*ÝSý|!¥bÍ´öÕ\u001f\u0017HFp\u009a\u0099ÅÂ<ëE\u0013è<9ed\u008d²¶Ëß&\br0¢YÝ\u0082?«@Ó\u0093üÉ%$Nwv¢\u009f;ÈTð\u0081\u0019ÒB^kD\u0093\u009e¼íå\u000e\u000eU6£_Õ\u0088\u001d±QÙ\u0080\u0002Ö+mS©|ü¥5Î[ö\u0098\u001f÷H\u0001qD\u0099\u0082Âøë3\u0014b<¬eò\u008e\"¶Îßê\b\u000e1}Y¿\u0082ù«\u0013Ôiü»%ÁN\u0010wF\u009f\u009dÈÙñ\u000f\u001aEBÄk\f\u0094q¼\u0091åô\u000e&7N_\u0082\u0088¯±\u0002Úx\u0002³+åT\n}C¥¡Î+÷\r\u001f\u009cHÒq\u0001\u009afÂ\u0094ëù\u0014\u000b=oe³\u008eÅ·~à^\b½1äZQ\u0082\u0094«ÞÔ*ýt%¥NÜw' HÈ\u0099ñÌ\u001a\u0012Ckk\u0086\u0094Ò½\u0002å½\u000eË7 `u\u0088ª±êÚ\f\u0003E+\u008bT©}8¦rÎ¢÷Ù #IUq\u008e\u009a.ÃMë\u0094\u0014Á=\u0004fN\u008eº·Äà\u0015\tl1\u009aZÈ\u0083\t¬mÔ\u0082ý\u001b&vN¢wò -Éeñ°\u001açCnlN\u0094à½ôæ\u000b\u000f^7±`Ú\u0089{±®Úß\u0003\u0013,ATÑ}Ò¦\u0004Ï_÷í ãI3ra\u009añÃ´ì\u001a\u0014«=öfD\u008fi·\u0082àþ\tQ2lZ±\u0083Ö¬\"Õrý\u0098&ËO\u0007xA ïÉ9òC\u001a´Cýl1\u0095n½«æó\u000f\u00028]`¸\u0089ú²+ÛJ\u0003\u0081,-U}}¶¦òÏ=øi  IÇr;\u009b]Ã\u009aìÑ\u0015\b>Kf\u0087\u008fÁ¸mà\u009f\t÷2\u0017[K\u0083\u00ad¬æÕ!þS&éOûx$¡tÉ\u0087òæ\u001b#C\u009dlù\u0095\u001f¾Tæ¶\u000fî8WaL\u0089¸²ÞÛ\u0000\u0004F,\u0082UÃ~'§cÏÌø?!_IÛrã\u009b*Ä\u000fì¶\u0015å>9gU\u008fä¸øá\n\ni2\u0093[\u0018\u0084_¬\u0091ÕÖþ\u0006'\u0019O\u009dxË¡9Êaò·\u001bØD\u001emd\u0095\u00ad¾¹çE\u000f¢8Úa5\u008ao²ºÛÝ\u00043-\u007fU¬~Ù§\nÐ4ø\u009c!µJsr´\u009bþÄ&íw\u0015\u009a>ïg(\u0090E¸´áÚ\n,3r[¸\u0084í\u00ad<Öfþê'(P\u0002x¸¡üÊ_ów\u001b\u0096Dëm\u0012\u0096A¾\u009eçà\u0010?93a¬\u008aN³zÛ\u008c\u0004Ô-\u0002V\u001e~¦§îÐ4ù]!µJäs!\u009czÄ\u0096íö\u0016F>ÉgÆ\u0090#¹yáº\nÓ37\\h\u0084\u008f\u00adÿÖ\u0007ÿo'\u0082PÏy:¡ÊÊËó?\u001c\u0000D\u0096mÛ\u0096>¿Wç¹\u0010è9\fbe\u008a¯³ñÜ#\u00057-\u008bV=\u007fQ§§ÐÏù:\"OJ\u008dsý\u009c\u001bÅgíè\u0016ü?*hv\u0090¥¹Sâv\n\u00973Æ\\\u0007\u0085R\u00ad³ÖÕÿ4(@P®yÿ¢\nËIó\u0080\u001c´ENmÍ\u0096\u0082¿\tè\u001c\u0010Ü9ëb\u001a\u008bl³\u008fÜ¥\u0005\u0015.|V½\u007f´¨qÐ\u0094ùé\"\u0010K\u0007s\u008a\u009cáÅ&î\u0016\u0016\u009f?óh{\u0091z¹¹âÑ\u000b34M\\Ó\u00856®eÖ¨ÿõ(<Qsy·¢ÊË0ôS\u001c¹Eèn;\u0097V¿¯è*\u0011@9§bÔ\u008b\u0015´qÜ°\u0005Ì.4WY\u007f¡¨âÑ\u0018ú[\"\u009cKÓtL\u009cªÅÃî\u0003\u0017E?¿hÁ\u0091.ºnâ·\u000bÇ4a]=\u0085¸®å×%ÿ\u0096(ðQEz}¢\u0084Ë\u0090ô\u0011\u001duEínþ\u0097&À|è¾\u0011î:.cR\u008bÉ´\u001aÝb\u0005½.êW\u0003\u0080@¨«ÑÑú6#DKªtç\u009d/Æaî\u0085\u0017S@qh\u0082\u0091óº<ã\u001f\u000bÒ4Æ],\u0086`®¶×ñ\u0000x)`Q\u008dzö£hËÀôð\u001d[Fbn£\u0097ëÀ\béi\u0011\u008e:¥c\n\u008cG´\u008bÝÏ\u0006..×WÐ\u0080\u0007©AÑ¼úË#0LYtº\u009dâÆ:ïz\u0017£@°i\u0007\u0092Aºíã7\f^4\u0097]É\u0086)¯S×\u0087\u0000ø)hRcz\u0098£ûÌ\u0011õ@\u001d\u0096F.o\b\u0097\u009eÀòé.\u0012O:\u0093cæ\u008c3µYÝ\u0081\u0006Û/\u001cX\\\u0080±©åÒwú±#åL\u0007u|\u009d\u0087ÆÕï\t\u0018I@\u008di»\u0092\u001a»mã«\fü5\u0014]¥\u0086ü¯\u0017Øx\u0000\u0098)éR\u0013{h£\u008dÌÁõ\u0010\u001eFF\u009eo¸\u0098\u000bÁBéþ\u0012!;qc¶\u008cïµ\u0002Þ\u0014\u0006×/òX1\u0081}©\u0095ÒÁû\f$2L\u008bu\u0013\u009eTÆ²ïà\u0018\u0015A\u007fi\u008a\u0092í»\tä*\f\u00955£^\u000e\u0087?¯\u0095ØÍ\u0001~)±Ró{1¤\u001dÌ½õÀ\u001e%Gko\u009d\u0098ÖÁ\u007fê{\u0012\u0099;Íd\r\u008c½µáÞ6\u0007q/\u008aX\u0090\u0081'ªaÒ\u008dûÝ$#MTu»\u009eÑÇ\u0000ðV\u0018îAHjd\u0092±»ýä \r\u000b5¢^Ý\u0087\r°PØ\u0091\u0001û*\u000bSC{\u0081¤8Íyõ\u009a\u001eòG\u000bpf\u0098²Áèê\u000f\u0013M;\u0091dÙ\u008d\b¶IÞ¡\u0007Â0[X\u009f\u0081Æª2ÓKû\u00ad$âM\"vM\u009e»ÇÐð\u0011\u0019]A\u0091jÍ\u0093\u000b»\u008bäá\r66r^½\u0087ý°,Ùa\u0001«*ÑS\u0013|S¤\u008fÍûö\u0003\u001fAGíp-\u0099rÁ²êÛ\u0013%<nd\u00ad\u008dÙ¶hßS\u0007\u00910½Y\u001d\u0082`ª\u0088Ó\u000büj$³Mýv)\u009fyÇ\u0093ðñ\u0019-BRj\u0095\u0093ø¼&å=\r«6ä_t\u0087ª°ÃÙ?\u0002E*ÐSÒ|\u0004¥/Í¼ö§\u001f\u001cHap\u009a\u0099ôÂ#êÎ\u0013ö<\u0002eT\u008d\u0081¶þß\u001d\bz0±Yô\u0082!«IÓ\u009bü½%.Navë\u009f>ÈGð©\u0019\u009eB>k]\u0093\u0084¼ßåm\u000e~6²_¾\u0088x±rÙ\u0099\u0002O+rS\u0087|Ó¥\u0015Î\u0011ö·\u001fúH\u0004qB\u0099¢ÂÉë~\u0014N<ôeá\u008ek¶ÁßÁ\b$1kY\u0084\u0082Þ«\u0004ÔZüà%îN\u001cwa\u009f\u0086Èýñ\"\u0019¸Bùk:\u0094r¼\u008båÃ\u000e\u00157H_·\u0088ñ±\u0013Ú)\u0002»+¸T\u0006}A¥íÎ\u000b÷r\u001f±Híq'\u009agÂ¡ëÍ\u0014\u001d=Ue\u0088\u008e§·\u001dà2\b²1\bZ]\u0082±«úÔ9ý\u001f%¼Næww BÈ±ñ¦\u001a\tC1k³\u0094Ö½Lå\u0093\u000eä7E`\u0015\u0088¸±ñÚ:\u0003T+\u008fTÑ}{¦jÎ®÷á kH\u008dqû\u009a6Ã@ë®\u0014ø=\u0016fk\u008eª·¡à{\tR1\u0096ZÀ\u0083\r¬AÔ\u008dýO&cN¼wÅ &Éwñ©\u001aÚC(lY\u0094ÿ½Äæ?\u000fg7\u0083`\u001d\u0089t±¦ÚÉ\u0003\u0001,}T\u009e}Ô¦dÏS÷\u0086 ©I\u0000ra\u009a¶Ãéìf\u0014Ì=\u008dfC\u008fT·¦àæ\tX2FZ\u009e\u0083¢¬\u001dÕMý»&µO:wª íÉ3òg\u001a¯CülS\u0095F½®æÀ\u000f{8I`ç\u0089Ü²!Ûa\u0003Ï,)UE}À¦ÀÏXø` ²Ißr\u0011\u009bNÃ\u0083ìÝ\u0015)>Gf\u008f\u008fI¸jàÃ\tò2\u0019[~\u0083Ü¬ÑÕeþ-&\u009bO x&¡XÉñòÅ\u001bVC\u008dl÷\u0095E¾næ¸\u000fË8\u000eaV\u0089\u009c²ÍÛe\u0004A,\u008dU·~%¦¥Ïéø&!\u0006I¡rñ\u009b\u0016Ärì\u008f\u0015Â>lgT\u008f©¸çá\u0000\nf2ý[@\u0084Y¬¦ÕÍþ]'fO\u008axÞ¡\u0011Êsòá\u001bÄD\u001am^\u0095\u009a¾\u0012ç\u000e\u000fµ8ÉaG\u008a\u001c²\u008cÛì\u00048-{U²~ø§\u000eÐ}ø\u0091!íJxr\u008a\u009bÞÄ\u0003íB\u0015\u0089>çg\u0012\u00903¸\u0090áÞ\n>34[ç\u0084ð\u00ad\u000eÕÈþü'\u0011P\u0002xª¡ñÊ\u0012ó\u0017\u001b¨Dàm\u001b\u0096j¾«ç£\u001009JaÏ\u008a\u000f³\fÛ¦\u0004Ã-PVK~¦§ÿÐ\"ù`!¢JÄs|\u009cvÄ\u00adí\u0015\u0016\u0000>·gã\u0090\u0005¹ráÜ\nÑ34\\N\u0084å\u00adôÖ\u0005ÿc'\u0080Pïy\u000b¡°Ê\u009fó\u0007\u001cCDßm\u0091\u0096O¿]ç³\u0010Õ9\u0016b#\u008a\u008e³ÈÜv\u0004´-ÐV.\u007fx§\u009fÐûù]\"vJ¸sÕ\u009c Årí½\u0016Á?>hm\u0090\u008a¹;â\u0007\n\u008a3É\\\t\u0085\u000b\u00ad\u0099Öåÿ\u001f(EPçy´¢&Ë6ó\u0093\u001c%E\u000em\u0087\u0096þ¿\u000eè|\u0010«9ðb4\u008b+³¸Üà\u0005\u0007.XV¶\u007fÏ¨[ÐÅù\u0089\u0000M(õQ1zv¢¹ËÆô)\u001djE¢nû\u00973Àeè¸\u0011ç:!cC\u008bù´\u000bÝ\b\u0005¶.ñW=\u0080m¨¢Ñáú\u001d#WK\u0097tÑ\u009d\u001dÆ0î\u0085\u0017Í@uh±\u0091öº3ãK\u000b£4ç]!\u0086M®\u009d×Õ\u0000\")aQ\u008fzÎ£1ËÉôÐ\u001d\u001fF\u0003nÕ\u0097æÀ5éb\u0011í: ca\u008c\u007f´®Ýë\u0006\t/EW\u0085\u0080\u001d©\\ÑÈúÚ#\u001bLgt\u0085\u009dªÆ*ï;\u0017³@Æi\u0001\u0092kº¹ã\b\f]4¾]ÿ\u0086;¯{×³\u0000\u0095)\u000bRWz\u00ad£©Ì%õP\u001d\u009cFÏo\u0005\u0097¨À\u0080é\b\u0012f:±cá\u008c2µ[Ý¯\u0006ó/\u001fX{\u0080\u0082©ÁÒ*úÊ#ÁLEu\u0001\u009d¯Æëï2\u0018A@\u0086i«\u0092,»\u007fã¹\fÅ5k^g\u0086ñ¯!Ø`\u0000\u0098)üR\u0019{\u0017£\u008fÌÙõn\u001e%F±oý\u0098*ÁWé³\u0012\n;^cµ\u008cÑµ\u0004ÞD\u0006\u008b/\u0099X?\u0081n©\u0081ÒÝûx$PL\u008buú\u009eHÆ¡ï\u0083\u0018[Ahi\u008e\u0092\u0093»Uä\u007f\f\u00915Á^\u0013\u0087j¯ýØÒ\u00015)°R\u008b{3¤JÌ\u009aõË\u001e\u000fG\u0015oè\u0098íÁ\u0002ê;\u0012»;âd%\u008dfµìÞA\u0007\u007f/»XÏ\u0081\u0010ª~ÒÓûß$\u0010MRu¡\u009eôÇpðL\u0018\u0097A\rjJ\u0092±»õä\u0015\rq5Ô^ä\u0087(°(Ø\u0090\u0001ò*\u000fS;{\u0082¤íÍ\u0004õ\u0094\u001e\u0087G!pO\u0098\u0081Áíê+\u0013i;°dú\u008d9¶<Þ\u0084\u0007ã0,Xº\u0081ÛªEÓCû«$\u009eM\u000evp\u009e³ÇÐð7\u0019`A¿jÎ\u0093\u0007¼/äí\r16g^¹\u0087õ°\u0010Ù^\u0001Ø*ÅS\u001a|$¤ûÍÜö\u001c\u001fbG\u0081p\u0015\u0099`Á\u0085ê\u0087\u0013U<nd·\u008d\u008b¶iß]\u0007¹0ÃY}\u0082>ª\u0087ÓÈüK$ÁMÃv\u0000\u009f\u0003Ç\u009dðé\u0019\bBFjê\u0093ü¼\u001fåd\r\u008e6Ã_(\u0087\u008e°ÈÙ\u0018\u0002E*©S\u009b|\u0015¥OÍ¶öÛ\u001f\u007fHbp\u009e\u0099ÁÂ\u0013ëH\u0013þ<(e\u0004\u008d\u0083¶Ãß$\b\\0\u0088Yå\u0082=«SÓ\u0081üô%\u0001NQv\u0090\u009fEÈTðÇ\u0019ÿB\nkI\u0093¨¼ðåw\u000ej6\u0080_é\u0088+±BÙë\u0002Ð+zS×|Ð¥\u0017ÎDö\u0092\u001fÀH\bqE\u0099ºÂÄë\u0011\u0014|<\u009beÅ\u008e)¶Åß\u008e\b61bY§\u0082ß«1Ô\u0019ü\u0085%éN.wx\u009f\u008dÈ¿ñ.\u001aCBík1\u0094p¼±åý\u000e)7fì\u0081Ä*½Â\u0096½Nz'.\u0018âñ\u009e©a\u0082\u0010{Ó,\u0094\u0004Gý\u001a\u001e@6ñO2du¼¦Õû".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1994);
        valueOf = cArr;
        ThreeDS2ServiceInstance = -1313738428010583876L;
    }

    public ChallengeParameters values(Context context) {
        Object[] objArr = new Object[1];
        values((Process.getThreadPriority(0) + 20) >> 6, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 10 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
        HashSet hashSet = new HashSet(Collections.singleton(((String) objArr[0]).intern()));
        ViewConfiguration.getFadingEdgeLength();
        ViewConfiguration.getEdgeSlop();
        ViewConfiguration.getZoomControlsTimeout();
        ViewConfiguration.getEdgeSlop();
        KeyEvent.getModifierMetaStateMask();
        TextUtils.lastIndexOf("", '0');
        Object[] objArr2 = new Object[1];
        values(1974 - (ViewConfiguration.getTapTimeout() >> 16), (char) (60645 - TextUtils.getTrimmedLength("")), 14 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr2);
        hideProgress ThreeDS2ServiceInstance2 = ThreeDS2ServiceInstance(context, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        values((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1988, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 7715), 6 - TextUtils.getOffsetAfter("", 0), objArr3);
        String intern = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        values((ViewConfiguration.getScrollDefaultDelay() >> 16) + 10, (char) View.resolveSize(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1572, objArr4);
        List singletonList = Collections.singletonList(((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        values(1582 - Gravity.getAbsoluteGravity(0, 0), (char) KeyEvent.keyCodeFromString(""), 391 - TextUtils.indexOf((CharSequence) "", '0'), objArr5);
        protocolError valueOf2 = protocolError.valueOf(intern, hashSet, singletonList, showProgress.ThreeDS2ServiceInstance(((String) objArr5[0]).intern(), ""), ThreeDS2ServiceInstance2, ThreeDS2ServiceInstance2);
        get = (ThreeDS2Service + 31) % 128;
        return valueOf2;
    }

    private static void values(int i, char c, int i2, Object[] objArr) {
        String str;
        synchronized (ConfigParameters.valueOf) {
            try {
                char[] cArr = new char[i2];
                ConfigParameters.ThreeDS2Service = 0;
                while (true) {
                    int i3 = ConfigParameters.ThreeDS2Service;
                    if (i3 < i2) {
                        cArr[i3] = (char) ((valueOf[i + i3] ^ (i3 * ThreeDS2ServiceInstance)) ^ c);
                        ConfigParameters.ThreeDS2Service = i3 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str;
    }
}
