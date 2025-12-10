package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public final class cancelled extends ErrorMessage {
    private static int ThreeDS2Service = 1;
    public static char[] ThreeDS2ServiceInstance;
    public static long get;
    private static int values;

    static {
        char[] cArr = new char[2919];
        ByteBuffer.wrap("\u0000A\u0090* \u0004°~@XÐ²`¬ð\u0086\u0080â\u0010ß\u0000M\u0090S }°\n@\u0018Ðè`ßðõ\u0080\u0091\u0010\u0085¡21yÁyQ%á%qÄ\u0001á\u0091Ý!\u009d±»BCÒkbiò\u0013\u0082\u001e\u0012å¢\u009c2ËÂ¯R\u0099ã:sI\u00035\u0093)#\"³ÏCÉÓ\u0098c\u0098ó\u0098\u0084U\u0014|¤\u00164\u0007Ä\u001fTÆäít±\u0004¤\u0094«%MµdE\u0003Õ\re&õß\u0085Ø\u0015¼¥\u00875°ÆYVcæ\tv*\u0006Â\u0096Ë&õ¶¹F\u0089×xgY÷z\u0087\u001d\u0017+§ï7ÙÇùWãç¹xC\bb\u0098R(\u0019¸-HÞØôhñø®\u0088¹\u0019^©e9XÉ\u001aY\u0015éÂyð\t\u0082\u0099\u009b)\u009bºZJoÚ\u0007j\u001aú\u0002\u008aÊ\u001aòª\u008e:®Ê¡[ ëj{3\u000b)\u009b?+Â»\u009aK«Ûªk¶üz\u008cS\u001cy¬)<\u0019ÌÉ\\\u0080ìõ|\u0092\rc\u009d]-r½;M\rÝÖmÙý\u0083\u008d\u009d\u001d®®g>YÎy^cî9~Ã\u000eá\u009eÂ.\u0099¾\u0099OYßuo\rÿ:\u008f\u0013\u001fç¯È?ÔÏ\u0081_¥ð8\u0080A\u0010\u0012 \u00020\u001cÀùPËà¯p\u008a\u0000\u008c\u0091s!S±\u0006A\u000fÑ\u001baÿñÀ\u0081ô\u0011¹¡¢2FÂBR\u0001â'r2\u0002ú\u0092Ó\"¤²¶B\u008eÓBc_ó \u0083\f\u0013Ù£Â3æÃ¾S\u008aä0t(\u0004Q\u0094\u0001$2´ÒD®ÔÙd\u0095ôÕ\u0085\u007f\u0015A¥b5\u0006Å[UÅåàu\u0088\u0005\u008e\u0095´&^¶aF\u000eÖ\u0015f6öë\u0086Þ\u0016\u008d¦\u008e6±Ç>Wfç\u0016w\u0011\u0007\u0001\u0097Þ'\u009b·«G\u0086×¼hFøe\u0088s\u0018-¨>8óÈÖX\u0085è¶x¹\t&\u0099~)\u001e¹)I\tÙÖi\u0083ù£\u0089\u0091\u001aaª`:qÊ\u0002Z%êÃz÷\nñ\u009a\u0091*Û»QK[Ûzk:û!\u008bÅ\u001bö«ì;\u0099Ë\u0096\\Aìv|}\f0\u009c2,í¼êLèÜ\u009al³ýc\u008dr\u001d\u0007\u00ad\u001f=2Íú]òí\u009a}\u0096\r\u0086\u009eI.\u0018¾\u0002N+Þ1n×þú\u008eò\u001e\u0083®²?^ÏB_+ïQ\u007f1\u000fñ\u009fá/ø¿ÝO\u008aà{pu\u0000\n\u0090\u0013 å°Î@ñÐû`¥ñF\u0081\u007f\u0011q¡\u00111[ÁÑQÛáùqª\u0001¡\u0092q\"q²mBeÒ\u0002bëòÏ\u0082Ð\u0012¼¢©3]Ã\u0010SYã\ns*\u0003ä\u0093Ñ#£³·C¢ÔtdKô;\u0084\u001e\u0014'¤ó4ÇÄ¨Tìä¡uJ\u0005~\u0095*%)µ?EÚÕÂe«õ\u008c\u0085®\u0016f¦j6'Æ\bV\u0014æÁvê\u0006\u009e\u0096\u0096'b·(G\u0000×)g9÷Ú\u0087Ê\u0017\u0086§±7\u00adÈ=XgèYx\n\b>\u0098³(í¸óH\u009dØ¬iAùH\u0089}\u0019\u0018©29íÉÏYÏé°y\u0099\ne\u009aa*yº-JDÚÌjéú\u0093\u008a\u0099\u001a°«Q;kË\u000b[\u001dë9{Ã\u000b\u0094\u009b\u0087+\u00ad»³L]Üll\u000bü\u0005\u008c7\u001cÕ¬ñ<\u009bÌ¡\\¿ín}w\r\t\u009d\u0000-¸½ìM\u009bÝ\u0086m\u0089þ[\u008e~\u001eW®d>:Îá^çîõ~±\u000e\u0083\u009fN/p¿\u000eO-ß<oøÿð\u008fÕ\u001fá¯·@iÐr`hð3\u0080#\u0010à î0¬À®P\u0096á:q\u0018\u0001m\u0091\u0017!\u0003±ÂA\u009bÑëaºñ\u0082\u0082S\u0012X¢023ÂIRóâÖr\u009e\u0002\u00ad\u0092Ì#U³\u007fC/Ó\u0010c1ó©\u0083È\u0013¿£\u00804pÄ[TBä(t\u0011\u0004È\u0094¤$û´\u009aD\u0086Õ6eVõy\u0085y\u0015G¥´5\u0096Å\u008eU\u008cå\u009fv]\u0006x\u0096\u0004&/¶_FÅÖñfÔö¡\u0086\u0087\u0017|§\u00167\u0017Ç/WMçÌwø\u0007\u0089\u0097»'\u0093¸BHDØvh\u001aøO\u0088Ó\u0018ã¨\u00808\u0081ÈÉYméLy\u0011\tV\u0099\b)Î¹ÆI\u0080Ù\u008ei«úw\u008a_\u001axªV:ÁÊ®Zóêáz¾\u000bX\u009bK+F»\u001bK\"ÛÏkäûÖ\u008bù\u001b\u0080¬r<lÌI\\fì>|Ç\fû\u009cÅ,\u0098¼ÉMGÝ`mný\b\u008d:\u001dî\u00ad\u009e=\u0087Í\u0090]\u009aîX~\\\u000e\f\u009e\u001e.=¾õNÉÞ\u0091nºþ²\u008fZ\u001f\u0018¯\u0014?2ÏC_âïÛ\u007f¦\u000f´\u009f®0oÀHP;à\u0015p\u0014\u0000Á\u0090Ü \u009c°¾A/ÑMaRñ\u0017\u0081\f\u0011ð¡Ù1ÿÁ»Q¼â<r|\u0002b\u00920\"Y²ÂB\u0090ÒÎbºò¨\u0083P\u0013h£e3\u000eÃ1SûãÊsí\u0003´\u0093«$a´\u007fDrÔ\td>ôý\u0084\u009a\u0014°¤\u008a4¡ÅvU\\å4u-\u00051\u0095ô%Ûµ°E¡Õ«fböH\u0086)\u0016R¦\u00066ÏÆäV¹æ×vÌ\u0007^\u0097A'&·'Gí×ãgç÷\u0080\u0087ß\u0018E¨R8eÈ\u0007X\u0013èÐxß\b×\u0098\u0081(®¹`IgÙBi=ù6\u0089ë\u0019ð©\u008e9ïÉ´Zgê\u0014zT\n?\u009a\u0004*éºçJ¶Ú\u00adj\u009dûE\u008b\u001c\u001bt«&;YËä[äë\u0092{\u009a\u000b×\u009cg,`¼\u0007L2Ü\u001cl üþ\u008cû\u001c¨¬\u009f=qÍ[]\u000eí\u0007}=\rÑ\u009dð-\u009d½ÉNWÞ[nRþ\u000f\u008e\f\u001eó®ð>ÞÎ¡^¬ï+\u007f_\u000fa\u009ff/\u000e¿ìOÉßÍo\u009dÿª\u0090I s°}@\u0014Ð\u001f`ºðí\u0080É\u0010\u0089 ¶1MÁvQ\u0002á=q:\u0001Ø\u0091à!\u0090±\u0091A´ÒQbLò|\u0082\u001b\u0012:¢Æ2íÂ\u0082R¡â«s\\\u0003\u0001\u0093\u0005##³HCÑÓñcûó±\u0083\u009a\u0014\\¤E4\tÄ$T¯äítå\u0004\u008b\u0094©%uµUEtÕ(e\u0000õÅ\u0085ú\u0015ú¥µ5¢ÆPVhækv`\u0006+\u0096Î&Å¶íF\u0083Ö\u0080go÷K\u0087j\u0017\u001c§37ÆÇçW°ç\u0099w°\bl\u0098{(s¸3H\u000eØ¥héø\u0090\u0088è\u0018\u0095©c9XÉ\fYKéHyû\tÙ\u0099\u008c)³¹¥J\\Ú{j%ú>\u008a7\u001aðªÄ:¯Ê¨[AëK{q\u000b\u0002\u009b*+Ó»ÝKòÛ·k\u008düA\u008c\\\u001cy¬\u0017<]ÌÁ\\èì\u008d|\u0083\f§\u009d:-\u0011½OM\u001aÝ mÂýå\u008dî\u001d\u008f\u00adÝ>UÎC^yî\u000e~=\u000eý\u009eÏ.ó¾¦N³ßioeÿ>\u008f1\u001f\u001f¯Ä?ÈÏ\u0091_·ï¾\u0080!\u0010T |0WÀ\u0017PÆàÊp°\u0000ª\u0090\u0084!R±DAcÑQaÉñÞ\u0081Ò\u0011\u0097¡\u00982KÂzRAâ'r\f\u0002µ\u0092Õ\"\u008f²¶B§ÓRcVóQ\u0083\u0000\u0013\u001c£±3\u0093ÃÞS\u0093ã\u0095tk\u0004V\u0094\u0015$.´\u0001DëÔçd\u0098ô»\u0084\u0096\u0015E¥l52Å,U\u0017åÈuÀ\u0005\u008b\u0095¯%\u0080¶CFeÖ\u0010fTö\u000b\u0086\u00ad\u0016Ù¦ 6\u008dÆ¦WlçIwz\u0007\u001c\u0097\u001d'í·\u0081G»×§hDø\"\u0088\u0004\u0018=¨\u00048øÈðX÷è\u009dx\u0093\tQ\u0099o)U¹\u0019I\u001dÙÏi\u0095ùð\u0089\u0086\u0019¦ªc:SÊ\u0005Zfê@zä\ný\u009aÉ*íº¤KJÛ\u0014kwû7\u008bF\u001bé«Í;´Ë¹[\u0090ìA|x\f+\u009c1,J¼¦LîÜ²l³ü¹\u008d!\u001d[\u00ad\n=\u0005Í7]çí\u0085}\u0084\r·\u009dÇ.3¾DN\"Þ?nëþÎ\u008e\u009b\u001e\u009b®»?eÏh_\u0006ï\u007f\u007f\b\u000fì\u009fý/\u0088¿¨O»à?pY\u0000N\u00907 \u0005°Á@\u008dÐù`ãð\u009f\u0081E\u0011\u0014¡]1-ÁAQàá\u0094q¹\u0001\u009e\u0091¾\"L²`B/Ò/b\u0014ò÷\u0082\u009d\u0012\u008b¢\u00922\u0088ÃYSxã(s6\u0003\u001b\u0093÷#ì³\u009bC\u008bÓ®d$ô\u0005\u0084-\u0014\u000f¤M4þÄÈT\u008fä\u0089uu\u0005y\u0095P%%µ#EÇÕÑeØõ¿\u0085\u0089\u0016^¦&6aÆ\u0006V'æÓv\u0096\u0006\u0088\u0096ç&\u0081·MGQ×\bgb÷@\u0087Ä\u0017ý§ç7µÇµXdètx(\bl\u0098'(¾¸úH\u0080Ø\u00adh¤ùU\u0089b\u0019\u0001©\u00129(ÉèYÃé\u008dy\u0090\t\u0082\u009aN*OºzJRÚ:jÚúâ\u008aº\u001a\u0086ª©;|Ëf[\u000fë\u0016{é\u000bÉ\u009bÁ+¦»\u0098LOÜVl|ü;\u008c:\u001cç¬ê<ýÌ\u0090\\\u0094íD}\u0016\ru\u009d'-\u0001½øM\u0089Ýñmýýª\u008e}\u001ew®R>\u001fÎ\u0000^àî\u008d~¯\u000eë\u009eÀ/3\u009f\t\u000f\u0017¿9/OßBO¬ÿ\u009bo±\u001fÕ\u008f\u009a>!®=^=Îa~aî\u0080\u009e¥\u000e\u0099¾Ù.ÿÝ\u0015M\u0010ý2me\u001dG\u008d«=\u0084\u00ad\u0088]×Í\u0085|\u0006ì\u0006\u009cP\f}¼\u001b,\u0093Ü¸LâüÞlÛ\u001bd\u008b,;A«W[\u000bË¼{\u0083ëõ\u009bà\u000bïº\t* ÚGJIúbj\u009b\u001a\u009c\u008aø:ÃªôY\u001dÉ'yMén\u0099\u0086\t\u008f¹±)ýÙôH,ø\u001dh>\u0018Y\u0088o8«¨\u009dX½È§xýç\u0007\u0097&\u0007\u0016·]'i×\u009aG°÷µgê\u0017ý\u0086\u001a6!¦\u001cV^ÆQv\u0086æ´\u0096Æ\u0006ß¶ß%\u001eÕ+ECõ^eF\u0015\u008e\u0085¶5Ê¥êUåÄdt.äw\u0094m\u0004{´\u0086$ÞÔïDîôòc>\u0013\u0017\u0083=3m£]S\u008dÃÄs±ãÖ\u0092'\u0002\u0019²6\"\u007fÒIB\u0092ò\u009db\u0081\u0012Ù\u0082í1/¡\u001dQ=Á'q}á\u0087\u0091¥\u0001\u0086±Ý!ÀÐ\u001d@1ðI`~\u0010W\u0080£0\u008c \u0090PÅÀáo|\u001f\u0005\u008fV?F¯X_½Ï\u008f\u007fëïÎ\u009fÈ\u000e7¾\u0017.BÞNNeþ\u0081n²\u001eî\u008eÅ>\u008c\u00ad\u0006]_ÍE}cíT\u009d¨\r\u0097½½-öÝÊL>ü\u001blk\u001cE\u008c\u0095<î¬µ\\ýÌä{.ë;\u009b<\u000bY»D+\u008dÛ\u00adK²ûÂká\u001ar\u008a):*ªEZ\u001aÊ\u0082z\u009cê±\u009aè\nã¹&)\u0003Ù4IQù\\i\u009d\u0019\u0095\u0089Ê9Ê©ùXzÈ!xBèY\u0098E\b\u0099¸ª(ÁØíHë÷<g+\u0017@\u0087I7j§\u0095W¦ÇÁwççÓ\u0096\u0015\u00065¶?&uÖ\u007fF\u009eö\u009efÅ\u0016á\u0085\u00125\b¥=UrÅiu\u0092å\u0099\u0095¢\u0005ÖµÉ$\u000eÔ\fD>ôWdO\u0014\u0096\u0084§4»¤¥TÆÃ(s\u001fã:\u0093H\u0003V³ý#ªÓ\u0088CÑóäb\r\u0012\u0015\u0082@2i¢iR\u008eÂºr×âÉ\u0092ú\u0001\u0011±\u0019!hÑUAfñ\u008ea\u008b\u0011å\u0081ó1é iP\u0013Àmp\\à}\u0090ý\u0000¹°Ê \u0090Ðý\u007f\u001dïG\u009f]\u000fg¿\u0087/¶ß½O¸ÿýn\u0011\u001ei\u008e\u001e>w®C^¬Î°~¥îÁ\u009e\u009c\r%½6-&ÝxM]ý¯m\u008b\u001d®\u008dè=×¬7\\\"Ì/|\u007fì[\u009c\u008e\fÐ¼Þ,ÉÜÇK-û9kk\u001bN\u008bA;\u008d«¶[ÒËö{æê\u0015\u009a*\nVº~*fÚ\u009aJØúíjñ\u001aö\u0089>9\u0017©wYbÉ~y¾éÄ\u0099¹\tÕ¸\u001d(\tØEH?ø`h\u0085\u0018\u009a\u0088¸8ö¨ÃW\rÇ/w1çE\u0097e\u0007µ·\u00ad'¯×ÉGîö\u001af7\u0016)\u0086V6q¦¶V\u0090Æ\u0080vÆæñ\u0095;\u0005\u0017µg%,ÕvE§õ¶eÑ\u0015ì\u0085Þ41¤=T5Ävt^ä»\u0094¦\u0004û´Á$æÓ\u0012CZómc\u0014\u0013n\u0083ç3¸£ãSîÃÌr>â\"\u0092K\u0002a²\u0085\"\u008dÒ¹Býòèa\u0017\u0011\u0001\u008181_¡AQ\u009aÁ\u0093q\u0094áà\u0091Ë\u0000\f°% /ÐU@hð\u008e`·\u0010¹\u0080Ö0Óß)O%ÿ*o]\u001fr\u008f\u008b?¡¯Å_ÏÏß~\tî\u000b\u009ea\u000e]¾p.\u0095Þ¥NÅþÉn\u008e\u001d=\u008d$=E\u00ad\u0010]NÍ\u0099}\u008eíé\u009dÖ\rÔ¼6,.ÜkL\u0017üQl\u0099\u001c\u0083\u008cÊ<\u0092«|[/Ë\u001f{}ë\u001d\u009b©\u000b\u0097»\u009c+ÇÛÌJ#ú jD\u001aN\u008ai:õª¯ZÆÊÁzÏé*\u0099*\t\u000b¹k)fÙ\u009cI\u0096ù\u008aiê\u0019Ð\u0088.8$¨UX/È]xúèÇ\u0098ò\bú¸ß'\"×;Gb÷#ge\u0017\u009e\u0087Ø7Å§ãWéÆev\u000fæZ\u0096U\u0006\\¶ý&ÀÖÈFõöÏe\u001b\u0015&\u0085R5[¥\u00adUµÅ\u009au¿åç\u0094\b\u0004 ´\u0001$pÔTD¶ôïdÄ\u0014å\u0084þ3\u000f£\u0012S\u0007Ãcs\u0012ã¢\u0093·\u0003\u00ad³Ú#÷Ò/B\u0010ò\"b$\u0012d\u0082±2\u008d¢÷R¨Âÿq~á4\u0091k\u0001@±p!µÑ¾AÇñÑaÚ\u0010\u001a\u0080\u00190l \\P[À±p°àÖ\u0090Ñ\u0000î¯g_.ÏY\u007fLï\t\u009f±\u000f¼¿¼/ÒÞuN;þ\u0001nr\u001e`\u008eµ>\u0094®¤^æÎÌ}\u0011í\b\u009d(\r]½b-\u008dÝµM\u0095ýÔmó\u001c\u001f\u008cT<\u001a¬K\\{Ì\u009d|§ì\u0092\u009cú\f\u0081»\u007f+0Û^KOûykò\u001b\u009d\u008bÐ;««ÐZ>Ê\u0019zFê|\u009ad\n º\u0085*°ÚðJ\u0091ù:i\u0018\u0019?\u0089\u00179l©¢YÃÉÜyúéË\u0098\u0011\b=¸\u007f(UØ\u0085Hñø\u0096h½\u0018ä\u0087 7 §\u001dW ÇKw\u008cçµ\u0097°\u0007ñ·Æ&\nÖ\u0015F\u0006öjfO\u0016«\u0086©6Í¦ÀVíÅ\fuSå\u0017\u0095.\u0005Eµ¥%\u009aÕæEÿõÔd\u001f\u0014 \u0084|4o¤cT\u009aÄ×tÇäÂ\u0094Ô\u0003\u0019³9#)Ó\u0015C\u0007ó±c\u008c\u0013ß\u0083Ó3ù¢*R\u001cÂ:rNâU\u0092±\u0002\u0092²¾\"ñÑ\u0002Amñ\u0002a{\u0011C\u0081\u00971ì¡¨QÐÁ\u009ap1à\u001f\u00903\u0000n°L \u009aÐÏ@¹ð»`ð\u000f?¿\u0010/0ßQO@ÿ¢o±\u001f\u0083\u008fê?Æ®.^TÎ4~Uî\b\u009e¹\u000eÛ¾ê.ÿÞÃM\u001bý\u0017me\u001db\u008dL=\u0082\u00ad¼]ÕÍÉ}èì\u0003\u009c_\f:¼s,qÜ\u0094L¦üølá\u001cõ\u008bn;:«{[aË\u0085{©ëµ\u009bË\u000bíº'*\u0017Ú1JUú|j\u0099\u001a\u00ad\u008a\u009b:ñªíY\u0011É)y?ég\u0099m\t\u008d¹×)\u00adÙöIñø9h%\u00188\u008838A¨\u0099X¡ÈÉxßèñ\u0097=\u0007&·W'A×vG\u0082÷¼g°\u0017È\u0087þ6\u0014¦\\VuÆlvwæ\u0099\u0096\u008b\u0006ï¶\u0094&êÕ E8õ`en\u0015R\u0085\u00865\u009b¥ÞUÐÄ\u001et\u0006ä\u001b\u0094\u007f\u0004v´\u0091$íÔ\u0098D÷ôÀc,\u0013-\u0083\u00183Q£\\S®Ã\u0081s\u00adã¥\u0093À\u0002.²T\"HÒeBfò\u009fb¹\u0012°\u0082×2Á¡\u0011Q ÁFq_áw\u0091\u0089\u0001¢±þ!ÉÑñ@\u0016ð*`g\u0010\u007f\u0080r0± ªPÀÀåpû\u001f`\u008f+?^¯w_zÏ\u008b\u007fµïÈ\u009f\u0098\u000fû¾\t.\u0001ÞJN`þ\u0085n\u009b\u001e©\u008eË>þ\u00ad\u0017]\u001aÍ>}Uík\u009d\u0095\r\u009b½«-ÇÝéL;ü%l8\u001c(\u008ck<\u009e¬§\\ºÌÆ|õë\b\u009bX\u000b;»N+gÛ\u008aK\u00adûÅkÛ\u001bý\u008a\u000b:9ªaZZÊhz\u0095ê¨\u009aÁ\nÛºê)\u0017Ù*IHùei{\u0019è\u0089«9Ø©ÌYùÈ\u001dx6èi\u0098n\bl¸\u0094(§Ø°Hà÷\u0005g8\u0017H\u0087O7n§\u0087W\u0095Ç±wÖçä\u0096\u0001\u0006-¶4&aÖqF\u0086ö²f¬\u0016 \u0086À5\u000e¥$U\u001fÅeurå¡\u0095¡\u0005¯µ«%ÝÔgD\u0010ô\\dk\u0014f\u0084\u00874\u0084¤ÒTÚÄÊs\u0016ã_\u0093z\u0003I³Z#¢Ó¸CåóÉcò\u0012\u0016\u0082\u001f2H¢oR_Â¥r¦âÏ\u0092ù\u0002þ±\n!$Ñ8ADñ\u0086a\u009a\u0011À\u0081ý1ã <P\u0019ÀGp{àj\u0090¥\u0000½°² ÏÐñ\u007f8ï\u0005\u009f6\u000fB¿\u001a/¯ß¢O\u0097ÿäoø\u001e|\u008e&>\u000e®F^nÎ ~\u0098îå\u009eç\u000e\u0085½ -\u000fÝkMoýGm\u008d\u001dÜ\u008d¹=î\u00adð\\\u000eÌ&|2ìG\u009cS\fé¼\u009f,ÖÜßL\u0089û\"k.\u001bM\u008b\u0015;O«\u0086[®ËÙ{Ôê\u001d\u009a\t\nAºf*IÚ\u008eJ\u0096ú\u009ajÎ\u001aÃ\u0089\u00169(©&YNÉCy·é½\u0099Í\tÚ¹Ù(\u0001Ø$HHøUhu\u0018ÿ\u0088µ8\u009e¨ØXÑÇ\u0019w5çF\u0097\\\u0007d·§'¤×ôGè÷Ñf\u0010\u0016\u000b\u008666T¦fV\u0094ÆÞvåæÉ\u0096ç\u0005#µ\u0005%4ÕTE[õ¾e·\u0015·\u0085Ô5û¤?T\fÄItlä\u0086\u0094¹\u0004\u009b´û$ÄÓ-C1ó5c-\u0013Y\u0083ð3\u0098£½SÇÃÛr\u0004â%\u0092?\u0002_²i\"\u008dÒ·B½òÓbÄ\u0011\u0019\u0081X1\u001b¡pQxÁãq¡á¯\u0091Æ\u0001ù°. \u0019Ðw@wð\\`£\u0010¾\u0080¯0Ñ ÌO\u0004ÿ\u001ao-\u001fH\u008f\u0006?¢¯\u0092_åÏê\u007fàî\u0018\u009e\u0018\u000eg¾d.NÞ¬N½þÙná\u001d2\u008d?=#\u00ad~]\u0014Í\u0081}²í´\u009dð\rá¼\u0016,*Ü\u0014L=ü}l®\u001c£\u008c\u0098<Õ¬Ú[\u000eË\u0001{(ë^\u009bV\u000b\u009b»\u0084+³ÛÉKÏú\nj\u0018\u001a^\u008a\\:Xª\u0081ZÙÊézÀê\u0080\u00997\t\u0007¹Y)iÙsI\u0082ùÞi´\u0019ý\u0089ë84¨3XcÈMxqè¦\u0098\u0084\b»¸ñ(ó×+G\u0010÷cgP\u0017\u0083\u0087¿7\u0097§æWÞÆ\u0001v<æ%\u0096&\u0006j¶\u0099&±ÖºFþöÊe-\u0015\u0000\u0085\u00125\u007f¥\u0018U\u0094Å¡u\u008aå×\u0095\u0087\u0004-´Q$*ÔqDXô\u0082d²\u0014Ò\u0084©4Õ£\u0013S*Ã7s_ãH\u0093û\u0003Á³å#ýÓÅB;ò\u0018bg\u0012h\u0082N2\u0094¢ÓRèÂÌrÑá\u0004\u0091<\u0001e±S!]Ñ\u0096A\u0085ñûa\u0092\u0010\u001d\u0080\n0\u0018 |PbÀ\u0085p\u008eà§\u0090 \u0000Ù¯\u0002_\u000fÏW\u007fRïm\u009f\u009a\u000f ¿Ë/¥ß\u0093N~þ\u0007n>\u001ek\u008eA>§®Ù^¯Îß~ûí<\u009d\u0004\rk½'-YÝ\u0099MºýÞmþ\u001dÜ\u008c.<=¬u\\PÌ[|îì¥\u009cË\f\u0095¼\u0089+\u0013Û\u0007K]ûPk\u0001\u001b£\u008b¾;Ç«Ã[ÝÊmz'ê<\u009a`\nõº¹*³ÚÀJÞù\ti\u001e\u0019K\u0089 9\u007f©¥Y£É×yÜé\u009d\u0098\u0003\b\u000b¸U('ØEH¸ø¢h°\u0018Ö\u0088ì7w§\u0014W\u000eÇ/w_çù\u0097\u0088\u0007Â·ì'÷Ö\u0002F9öVf*\u0016\n\u0086¶6\u0097¦ËV©ÆÙu1åG\u00954\u0005\u0015µ\u000b%\u0093ÕÅE¸õ\u009feÔ\u0014\u001b\u008474G¤YTqÄ\u008dt\u008eäÑ\u0094ö\u0003(³\u0004#\u001dÓDCbó\u0080c\u0080\u0013\u0096\u0083ü3É¢kRhÂ\u0011rNâf\u0092°\u0002\u008c²Ë\"ÛÒ\u009cA5ñ1aL\u0011[\u0081|1¡¡\u008dQÉÁîqÅàx\u00905\u0000h°{ YÐ°@¯ðÖ`Ë\u0010Ð¿\u0015/\bßxOHÿ~o¡\u001fÕ\u008f¿\u0000e\u0090, \u0005°+@\nÐã`©ðÕ\u0080à\u0010\u008e¡a1{Á\u0000Q6áZq²\u0001\u0091\u0091ß!µ±ÞB1Ò\u001bb\u0004ò4\u0082B\u0012²¢Â2\u008cÂºRÅã>s\u0013\u0003p\u00938#\u0010³ìC\u009cÓòcëóÅh\u0002ø\u000fH\rØD(a¸\u0083\b\u0095\u0098\u008fè×xáÉ\u0007Y\u0000\u0098ò\bÿ¸ý(´Ø\u0091Hsøeh\u007f\u0018'\u0088\u00119÷©ðYñÉ y\u009béb\u0099]\u0000a\u0090w Q°6".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2919);
        ThreeDS2ServiceInstance = cArr;
        get = -813259244256980966L;
    }

    private static void ThreeDS2ServiceInstance(int i, char c, int i2, Object[] objArr) {
        String str;
        synchronized (ConfigParameters.valueOf) {
            try {
                char[] cArr = new char[i2];
                ConfigParameters.ThreeDS2Service = 0;
                while (true) {
                    int i3 = ConfigParameters.ThreeDS2Service;
                    if (i3 < i2) {
                        cArr[i3] = (char) ((ThreeDS2ServiceInstance[i + i3] ^ (i3 * get)) ^ c);
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

    public ChallengeParameters ThreeDS2Service(Context context) {
        ThreeDS2Service = (values + 49) % 128;
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance(View.getDefaultSize(0, 0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), View.resolveSize(0, 0) + 10, objArr);
        Set singleton = Collections.singleton(((String) objArr[0]).intern());
        MotionEvent.axisFromString("");
        TypedValue.complexToFloat(0);
        ImageFormat.getBitsPerPixel(0);
        KeyEvent.keyCodeFromString("");
        ViewConfiguration.getWindowTouchSlop();
        ViewConfiguration.getScrollDefaultDelay();
        ViewConfiguration.getWindowTouchSlop();
        TextUtils.indexOf("", "");
        View.combineMeasuredStates(0, 0);
        Object[] objArr2 = new Object[1];
        ThreeDS2ServiceInstance(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2887, (char) (KeyEvent.keyCodeFromString("") + 26726), (-16777204) - Color.rgb(0, 0, 0), objArr2);
        hideProgress ThreeDS2ServiceInstance2 = ThreeDS2ServiceInstance(context, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        ThreeDS2ServiceInstance(2899 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (Color.rgb(0, 0, 0) + 16816278), 18 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr3);
        hideProgress ThreeDS2ServiceInstance3 = ThreeDS2ServiceInstance(context, ((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        ThreeDS2ServiceInstance(2963 - AndroidCharacter.getMirror('0'), (char) TextUtils.getTrimmedLength(""), 5 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr4);
        String intern = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        ThreeDS2ServiceInstance(10 - Drawable.resolveOpacity(0, 0), (char) Color.argb(0, 0, 0, 0), Color.green(0) + 1252, objArr5);
        List singletonList = Collections.singletonList(((String) objArr5[0]).intern());
        Object[] objArr6 = new Object[1];
        ThreeDS2ServiceInstance(KeyEvent.normalizeMetaState(0) + 1262, (char) (40773 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), Drawable.resolveOpacity(0, 0) + 1584, objArr6);
        String intern2 = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        ThreeDS2ServiceInstance(2847 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 40, objArr7);
        protocolError valueOf = protocolError.valueOf(intern, singleton, singletonList, showProgress.ThreeDS2ServiceInstance(intern2, ((String) objArr7[0]).intern()), ThreeDS2ServiceInstance2, ThreeDS2ServiceInstance3);
        int i = ThreeDS2Service + 61;
        values = i % 128;
        if (i % 2 != 0) {
            int i2 = 53 / 0;
        }
        return valueOf;
    }
}