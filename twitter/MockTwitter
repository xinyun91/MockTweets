package twitter;

import java.util.ArrayList;
import java.util.HashMap;

public class MockTwitter implements ITwitter {

    private String _searchString;
    private HashMap<String, ArrayList<Tweet>> _map;

    public MockTwitter() {
        _searchString = "";
        _map = new HashMap<String,ArrayList<Tweet>>();
        populate(_map);
    }

    @Override
    public void setQuery(String s) {
        _searchString = s;
    }

    @Override
    public ArrayList<Tweet> runQuery() {
        return _map.get(_searchString);
    }
    private void populate(HashMap<String, ArrayList<Tweet>> map) {
        ArrayList<Tweet> list = new ArrayList<Tweet>();
        list.add(new Tweet("The Pick","ThePick2","RT @NFL_up_Today: Buffalo Bills vs. Miami Dolphins: Complete Week 11 Preview for Miami - Bleacher Report http://t.co/dzASo7DcJa #Buffalo #B…"));
        list.add(new Tweet("Mommy Centre Blog","MommyCentre","@937WBLK my favorite station!!! I could listen to this music 24/7! #groovinmamma #tdot #buffalo #onelove😄"));
        list.add(new Tweet("NFL-Today","NFL_up_Today","Buffalo Bills vs. Miami Dolphins: Complete Week 11 Preview for Miami - Bleacher Report http://t.co/dzASo7DcJa #Buffalo #Bills #buffalobills"));
        list.add(new Tweet("NFL-Today","NFL_up_Today","NFL 2014 Schedule Week 11: Buffalo Bills vs Miami Dolphins How to Watch on ... - The Christian Times http://t.co/9R5jidps6s #Buffalo #B..."));
        list.add(new Tweet("NFL-Today","NFL_up_Today","Miami Dolphins vs Buffalo Bills Live Stream Free: Watch NFL Thursday Night ... - BREATHEcast http://t.co/qLFiDOfE9W #Buffalo #Bills #bu..."));
        list.add(new Tweet("Gramps","grampsauctions","Check out Vintage Postcard~Ford Hotel #Buffalo N.Y.  http://t.co/MgmUXxPw74 via @eBay"));
        list.add(new Tweet("Gramps","grampsauctions","#Buffalo NY 1917 Postcard Bear Pits Park Zoo  http://t.co/7DVkdqQqOf via @eBay"));
        list.add(new Tweet("Tameka Okafor","TOkafor82","@MicrosoftStore In line #GrandOpening #destinyusa #LetsGo #Buffalo http://t.co/WsYpSwEV1a"));
        list.add(new Tweet("Jake Spoon","jakeunderwood24","Hump day in Wyoming fashion! #buffalo #keepinitwestern #wideopenplains #307 http://t.co/4voc8PTNB8"));
        list.add(new Tweet("Cara","caraccr76","RT @andreagodin: #OTOWN Fans! Who will I be seeing at the show Dec 7 in #Buffalo?! @OTownOfficial @theforvmbuffalo #ny #concert #tour"));
        list.add(new Tweet("Buffalo Jobs","BuffaloJobs_","#Buffalo #Jobs (USA-NY-Buffalo) Accounting Clerk:  http://t.co/w9OJOapoHZ"));
        list.add(new Tweet("Buffalo Jobs","BuffaloJobs_","#Buffalo #Jobs (USA-NY-Buffalo) Quality Inspector:  http://t.co/IyoZQUL7Rr"));
        list.add(new Tweet("Jobs in Buffalo","Jobs_Buffalo1","#Job #Buffalo (USA-NY-Buffalo) Accounting Clerk:  http://t.co/222ZoNGON3"));
        list.add(new Tweet("Jobs in Buffalo","Jobs_Buffalo1","#Job #Buffalo (USA-NY-Buffalo) Quality Inspector:  http://t.co/kFe8oYQfKt"));
        map.put("#Buffalo",list);

        list = new ArrayList<Tweet>();
        list.add(new Tweet("RJ Mojica","rojmoj","With the cofounders of @himpromotions! #Toronto #himcoliseum #to #amazing #awesome #event #west #end @… http://t.co/VvwhcwNU02"));
        list.add(new Tweet("Eamonn O'Connor","eamonn_oconnor","RT @blogTO: A bird's eye view of #Toronto growth since 1879. http://t.co/XVfpp6a445 http://t.co/J4bg3Xo33E"));
        list.add(new Tweet("Scott Morissey","sportsscott","@Dave_Stubbs And I don't think they are too #happy that it's #Toronto that is doing the #drubbing!"));
        list.add(new Tweet("Rainbow Kisses","RainbowKissesca","#beboldstandout #rainbowkissed #toronto #image #standout #fierce #comingsoon #mua http://t.co/2tqsP1pslG"));
        list.add(new Tweet("Mistress Gweneth","JetSetMistress","“@MasterTomTheDom: Strange. It's been very quiet for the past few days for me, but calls are coming in for my Dommes. #ProDomBiz” #toronto"));
        list.add(new Tweet("Summer Murphy","SummerMurphy12","I think I'm in love! 😍💜😭😳 @OfficialKat #katdennings #2brokegirls #toronto #autumn #adorable… http://t.co/LyWcYJbMqa"));
        list.add(new Tweet("Michael","torontonewsfeed","#toronto #news : Are Hockey Fans becoming more like over zealous soccer fans? http://t.co/fk6TTTxRSw"));
        list.add(new Tweet("Allen Finley","AllenFinley","RT @GoldMedalPlates: Tuna toro with foie and ginger pork dumpling from @TheChaseTO paired with @StratusWines #toronto #gmp2014 http://t.co/…"));
        list.add(new Tweet("Jennifer Yap","Yap_Jen","RT @pothen: 9 Things Drivers Need to Stop Saying in the Bikes vs. Cars Debate http://t.co/ryAPWNQUXx #biketo #topoli #toronto"));
        list.add(new Tweet("Brad Warren","brad_bwarren","@TheNightWorlds   #toronto #beach RETWEET worse than the  #ttcleprechaun This guy broke into my neighbour's house http://t.co/CtAtm7nfhb"));
        list.add(new Tweet("Rainbow Kisses","RainbowKissesca","#rainbowkissed #beboldstandout #beyourself #image #standout #toronto #comingsoon http://t.co/UWE8bKwOFa"));
        list.add(new Tweet("IT jobs Canada","NeuvooITCA","Hays is hiring a #Datapower #Developer, apply now! (#Toronto) #jobs http://t.co/YRQjU3Gkag http://t.co/cvE4xjUJsq"));
        list.add(new Tweet("NB_Drinks_on_ me","NBfannpage","S/O to #watavybzpro in #Toronto #Canada for playing my single \"Drinks on me\" #drinksonme #worldwide #NBTV http://t.co/Yrrs8gb6Ps"));
        list.add(new Tweet("K-107fm JamZ","k107fmjamz","BLESS THIS HOUSE - DORINDA CLARK-COLE http://t.co/50EW6YN0vS #Toronto #Columbus #Gospel"));
        list.add(new Tweet("RICH MASSIAH","RichSwagg","New Mixtape By @Money_GreyCity #BackLikeINeverLeft Download it now on #datpiff via #Swaggnews http://t.co/KaxjFecWte #Toronto"));
        map.put("#Toronto",list);

        list = new ArrayList<Tweet>();
        list.add(new Tweet("Justin Tang","jtwittah","The guy who's alleged to be fraudulently wearing a CDN forces uniform... odds are he's NOT well. How is crucifying him helping? #ottawa"));
        list.add(new Tweet("JD","artofpoliticsca","RT @InklessPW: “@ottawacity: And the #ottawa Book Awards Winners are: @iamomeara (fiction) & @inklessPW (non-fiction). Congrats!”"));
        list.add(new Tweet("Kris MacLeod","krimacl","RT @JeffLeal_MPP: 1/2 Congrats to winners of Premier’s Award for Agri-Food Innovation Excellence honoured this in #Ottawa today: Feather We…"));
        list.add(new Tweet("Mason","isandewsmom","RT @momottawa: Things To Do with the Kids in #Ottawa and at Home: Santa Claus at @StLaurentcentre http://t.co/TbPW41rfwA"));
        list.add(new Tweet("uGoogle","uGoogleFuture","@WINDmobile #WINDnation took this w/my GS3 as my camera and GPS while biking in #ottawa #Ontario http://t.co/JxychuSZds"));
        list.add(new Tweet("French Science U.S.","FranceScience","RT @francevancouver: @fhollande @Elysee applaudi et salué à  #frenchAmeriCanClimateTalks pour son appel à @pmharper sur l'environnement à #…"));
        list.add(new Tweet("IG FriscoAM","FriscoAMG","401 Flexin #Ottawa Soon Touch #MobbDeep Up."));
        list.add(new Tweet("Judie Noble","JudieNoble","RT @perrymatt: Hey @strombo was great seeing my nephew staring up at @CraigAnderson41 on Saturday night in #Ottawa at the #Sens http://t.co…"));
        list.add(new Tweet("Paul Wells ","InklessPW","“@ottawacity: And the #ottawa Book Awards Winners are: @iamomeara (fiction) & @inklessPW (non-fiction). Congrats!”"));
        list.add(new Tweet("Porwigle","P_Wog","RT @JohnOCAP: http://t.co/4fbNqRdjK0 #Netanyahu on '#terrorism' #Canada faced. People in #Gaza might feel they've had it a bit worse than #…"));
        list.add(new Tweet("Gladstone Theatre","GladstoneSeason","RT @plosivepeeps: #Theatre lovers in #Ottawa – check out all the awesome shows playing at @GladstoneSeason this season. http://t.co/BdN6OYX…"));
        list.add(new Tweet("Allyson Grant","AllysonMargaret","Mmm @AndyTheButcher_'s gin-infused jalapeno hot sauce on my late night eggs is perfection #nomnomnom #ottawa #food"));
        list.add(new Tweet("Valentina Capurri","vcapurri","RT @JohnOCAP: http://t.co/4fbNqRdjK0 #Netanyahu on '#terrorism' #Canada faced. People in #Gaza might feel they've had it a bit worse than #…"));
        list.add(new Tweet("IG FriscoAM","FriscoAMG","RT @CapCityHipHop: Tonight!! @MOBBDEEP @PRODIGYMOBBDEEP @HavocOfMobbDeep Live @BarrymoresMH http://t.co/zHKQxlanvZ #Ottawa #Canada #CapCity…"));
        map.put("#Ottawa",list);

        list = new ArrayList<Tweet>();
        list.add(new Tweet("London Networker","LondonNetworker","Social Networking Passport: Your Passport To Social Media Dominance. Comprising Extensive Training In ... http://t.co/m1OP1nE4az #London"));
        list.add(new Tweet("Standing On The Moon","standingonmoon","#Cowboy #Song #Western #Music #Mix #Trending #Discover #Retweet New York City #Chicago #London #Paris #Roma St. Louis http://t.co/QlTxlXSLcd"));
        list.add(new Tweet("London News Now","London_NewsNow","#London #England #News -  Smith pulls out of worlds with virus.."));
        list.add(new Tweet("Standing On The Moon","standingonmoon","#Cowboy #Song #Western #Music #Mix #Trending #Discover New York City #Chicago #London #Paris #Roma #Boulder #Denver http://t.co/QlTxlXSLcd"));
        list.add(new Tweet("London News Now","London_NewsNow","#London #England #News -  Craig signs new Brentford contract.."));
        list.add(new Tweet("えりこ","anderlasia8","Off shot in #London this is #british #museum http://t.co/IMLzMaPg1H"));
        list.add(new Tweet("Martin E. Laruccia","martinlaruccia","RT @Soozie_London: Lovely to work with you @rosiehw today on the new #rosieforautograph #lingerie collection @marksandspencer #london http:…"));
        list.add(new Tweet("John Wilson","JWCommodities","Sold $AUDUSD 0.86992 | Auto-copy #trade at http://t.co/39mNCfoiY0 #Forex #Money #News #Markets #London"));
        list.add(new Tweet("London News Now","London_NewsNow","#London #England #News -  Dartford 2-1 Welling United.."));
        list.add(new Tweet("Standing On The Moon","standingonmoon","#Cowboy #Song #Western #Music #Mix #Trending #Discover New York City #Chicago #London #Paris #Roma Colorado Springs http://t.co/QlTxlXSLcd"));
        map.put("#London",list);

        list = new ArrayList<Tweet>();
        list.add(new Tweet("AUSTRALIA RT","Australia_RT","RT @AussieScenes: At http://t.co/pMUxNdXI3b -- #perth #australia #beach #sunshine #blueskies #happiness #nofilter #sopeaceful ☀️😌👌"));
        list.add(new Tweet("Scenes from Australi","AussieScenes","At http://t.co/pMUxNdXI3b -- #perth #australia #beach #sunshine #blueskies #happiness #nofilter #sopeaceful ☀️😌👌"));
        list.add(new Tweet("Scenes from Australi","AussieScenes","At http://t.co/pMUxNdXI3b -- Lauren + Aiden photographed by Carley ❤️ #perth #perthbride #perthwedding #matildabay #matildaybaywedding ..."));
        list.add(new Tweet("Scenes from Australi","AussieScenes","At http://t.co/pMUxNdXI3b -- Fashion inspiration @fabulouslyspotted #adelaide #melbourne #sydney #perth #brisbane #melbournefashion #sy..."));
        list.add(new Tweet("Samantha Wynne","SamanthaAWynne","_ivyflowers_'s photo http://t.co/F4k9pgoNsY see #perth brides there! @tweetperth"));
        list.add(new Tweet("wagovtwatch","wagovt","RT @abcnewsPerth: A mob turns on police in Broome after a woman is apparently hit by a police car. http://t.co/0Cu5VpW5h0 #perth #perthnews"));
        list.add(new Tweet("ConsumerProtectionWA","ConsumerWA","Going away? Play our fun travel game first and you could win a $500 travel voucher! http://t.co/ojAR53k0p7 #PackSomePeace #Perth"));
        list.add(new Tweet("soopakoojo","supercujo","How great would it be if the future WA airport was Hong Kong Airport development of Garden Island? #Perth"));
        list.add(new Tweet("Félix Gravel","GravelFelix","RT @fellowplanner: This is colonial planning. I know better, c error of your ways. Letter 2 #Perth WA, from CND planner http://t.co/av0MkDz…"));
        list.add(new Tweet("Huston Gibson","HustonGibson","@Planographer via @Trending_City: \"Cool artwork by Lorenna Grant in #Perth! http://t.co/rJ3GFLocyQ\""));
        list.add(new Tweet("Ming Johanson","OTOTGo","RT @JoAtWildfire: Time to play with #Twitter and #Facebook at #digitaldots  @OTOTGo  #perth http://t.co/RjDhiwEtX8"));
        list.add(new Tweet("soopakoojo","supercujo","WA Govt looking for new airport site, I think it will mostlikely be Karnup-Pinjarra region. Will be a fight tho #Perth"));
        list.add(new Tweet("Australia Hiring Job","CatchaJob_au","#Job #Australia #Senior Research Officer &#8211; Government Department in #Perth WA, http://t.co/RqrvhngCLO"));
        list.add(new Tweet("Hologram Skies","Hologramskies","Video for \"Surrender to\" from #Perth, #Australia solo project @thisisfait , included in her debut album 'Atmosphere.' http://t.co/dXgn4OkX02"));
        list.add(new Tweet("Perth Business Help","businessperth","Couple of days ago was at Ellen Stirling Bvd, Scarb Bch Rd #Innaloo. Site of Putt Putt from ages ago. #Perth http://t.co/9ZEL4SiEuj"));
        map.put("#Perth",list);

        list = new ArrayList<Tweet>();
        list.add(new Tweet("JustinOwen","JayOwen9","Cup Day 2014 #StrikeAPose #WestfieldPhotoBooth #AddingtonRaceway #CupandShowWeek #Christchurch… http://t.co/Hdk5MqfsIV"));
        list.add(new Tweet("ぺらふめ(#Prfm fan site)","Perfume_COMPLEX","For All Oceanian Perfume fans.http://t.co/7Vl0TCgYoH #prfm #perfume_um #sydney #Brisbane #Adelaide #newguinea #Auckland #Christchurch"));
        list.add(new Tweet("Aaron Cruz","elatlboy","MT @TrustTraveller: *NEW* Why You Should Visit #Christchurch Now http://t.co/UqKl0AbiM2 #travel #newzealand #ttot #lp << Heart that town!"));
        list.add(new Tweet("photo new zealand","photonewzealand","RT @mikeheydon: Love an A&P Show #canterbury #show #kiwiana #newzealand #nz #christchurch #todaysoffice #photography… http://t.co/AYbzbJ9yji"));
        list.add(new Tweet("david munnik","davemun123","RT @sovereignha: We’ve funded a new digital hub in #Christchurch to help residents get online #HousingDay http://t.co/87R97NnB1s"));
        list.add(new Tweet("Dr Vic","VicMetcalf_NZ","Getting country-ified at the #Christchurch A&P show. So far @UCNZ    marine tanks have been best hit w Miss5in2days. Nice to see Mike etc"));
        list.add(new Tweet("Mike Heydon","mikeheydon","Love an A&P Show #canterbury #show #kiwiana #newzealand #nz #christchurch #todaysoffice #photography… http://t.co/yWWj7XlE4K"));
        list.add(new Tweet("Laura Tupou","LauraTupou","I used to eat here (loved their fresh springrolls) when I worked in #Christchurch. I'm glad to see #JusticeRestored http://t.co/KE1XVkDEWE"));
        list.add(new Tweet("Travelogx","Travelogx","#LiveTheDream #Christchurch: Why You Should Visit... by @TrustTraveller, +3 more. http://t.co/fctXXvMcbi #rtw"));
        list.add(new Tweet("Hanne D","hanne_davis","One of the Bulls for tonight's pbr event in #Christchurch. Wouldn't catch me trying this one out. http://t.co/Kchsa4olRu"));
        list.add(new Tweet("Hatsue Kaneda","Hatsu9310","#oxford #christchurch http://t.co/p0xJl6KcLL"));
        list.add(new Tweet("757Live New Zealand","757LiveNZ","#Christchurch mother turns tragic loss into powerful message - New Zealand Herald http://t.co/OE7LVfFcoQ"));
        map.put("#Christchurch",list);

    }
}
