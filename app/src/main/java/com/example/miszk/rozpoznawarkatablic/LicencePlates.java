package com.example.miszk.rozpoznawarkatablic;

public class LicencePlates {

    public static String getPlate(String shortcut) {
        shortcut = shortcut.toLowerCase();
        String foundCity = "nie ma takiej rejestracji :<";
        String [][] plates = {{"lza","Zamojski"},{"lz","Zamoooooość"},{"lb","Biała Podlaska"},{"lc","Chełm"},{"lu","Lublin"},{"lbi","Bialski"},{"lbl","Biłgoraj"},{"lch","Chełmski"},{"lhr","Hrubieszów"},{"lja","Janów Lubelski"},{"lks","Krasnystaw"},{"lkr","Kraśnik"},{"llb","Lubartów"},{"lub","Lubelski"},{"lle","Łęczna"},{"llu","Łuków"},{"lop","Opole Lubelskie"},{"lpa","Parczew"},{"lpu","Puławy"},{"lra","Radzyń Podlaskie"},{"lry","Ryki"},{"lsw","Świdnik"},{"ltm","Tomaszów Lubelski"},{"lwl","Włodawa"}

                ,{"kr","Kraków"},{"kk","Kraków"},{"kra","Krakowski"},{"kn","Nowy Sącz"},{"kt","Tarnów"},{"kbc","Bochnia"},{"kba","Bochnia"},{"kbr","Brzesko"},{"kch","Chrzanów"},{"kda","Dąbrowa Tarnowska"},{"kgr","Gorlice"},{"kli","Limanowa"},{"kmi","Miechów"},{"kmy","Myślenice"},{"kns","Nowosądecki"},{"knt","Nowy Targ"},{"kol","Olkusz"},{"kos","Oświęcim"},{"kpr","Proszowice"},{"ksu","Sucha Beskidzka"},{"kta","Tarnowski"},{"ktt","Zakopane"},{"kwa","Wadowice"},{"kwi","Wieliczka"}

                ,{"fg","Gorzów Wielkopolski"},{"fz","Zielona Góra"},{"fgw","Gorzowski"},{"fkr","Krosno Odrzańskie"},{"fmi","Międzyrzecz"},{"fnw","Nowa Sól"},{"fsl","Słubice"},{"fsd","Strzelce Krajeńskie"},{"fsu","Sulęczyn"},{"fsw","Świebodzin"},{"fzi","Zielonogórski"},{"fzg","Żagań"},{"fza","Żary"}

                ,{"wpr","Pruszkowski"},{"wpp","Pruszkowski"},{"wps","Pruszkowski"},{"wwl","Wołomiński"},{"wv","Wołomiński"},{"wo","Ostrołęka"},{"wp","Płock"},{"wr","Radom"},{"ws","Siedlce"},{"wbr","Białobrzegi"},{"wci","Ciechanów"},{"wg","Garwolin"},{"wgs","Gostynin"},{"wgm","Grodzisk"},{"wgr","Grójec"},{"wkz","Kozienice"},{"wl","Legionowo"},{"wli","Lipsko"},{"wls","Łosice"},{"wma","Maków Mazowiecki"},{"wm","Mińsk Mazowiecki"},{"wml","Mława"},{"wnd","Nowy Dwór Mazowiecki"},{"wos","Ostrołęcki"},{"wor","Ostrów Mazowiecki"},{"wot","Otwock"},{"wpi","Piaseczno"},{"wpl","Płocki"},{"wpn","Płońsk"},{"wpz","Przasnysz"},{"wpy","Przysucha"},{"wpu","Pułtusk"},{"wra","Radomski"},{"wsi","Siedlecki"},{"wse","Sierpc"},{"wsc","Sochaczew"},{"wsk","Sokołów Podlaski"},{"wsz","Szydłowiec"},{"wb","Warszawa-Bemowo"},{"wa","Warszawa-Białołęka"},{"wd","Warszawa-Bielany"},{"wj","Warszawa-Targówek"},{"wk","Warszawa-Ursus"},{"wn","Warszawa-Ursynów"},{"wt","Warszawa-Wawer"},{"ww","Warszawa-Wilanów"},{"wz","Warszawa-Zachód"},{"wwe","Warszawa-Węgrów"},{"wwl","Warszawa-Wołomin"},{"wwy","Warszawa-Wyszków"},{"wzw","Warszawa-Zwoleń"},{"wzy","Warszawa-Żyradów"},{"wzu","Warszawa-Żuromin"},{"we","Warszawa-Mokotów"},{"wu","Warszawa-Ochota"},{"wf","Warszawa-Praga-Południe"},{"wh","Warszawa-Praga-Północ"},{"wi","Warszawa-Śródmieście"},{"wy","Warszawa-Wola"},{"wx","Warszawa-Żoliborz"}

                ,{"op","Opole"},{"ob","Brzeg"},{"ogl","Głubczyce"},{"ok","Kędzierzyn Koźle"},{"okl","Kluczbork"},{"okr","Krapkowice"},{"ona","Namysłów"},{"ony","Nysa"},{"ool","Olesna"},{"opo","Opolskie"},{"opr","Prudnik"},{"ost","Strzelce Opolskie"}

                ,{"rk","krosno"},{"rp","Przemyśl"},{"rz","Rzeszów"},{"rt","Tarnobrzeg"},{"rbi","Ustrzyki Dolne"},{"rbr","Brzozów"},{"rde","Dębica"},{"rja","Jarosław"},{"rjs","Jasło"},{"rkl","Kolbuszowa"},{"rkr","Krośnieński"},{"rle","Leżajsk"},{"rlu","Lubaczów"},{"rla","Łańcut"},{"rmi","Mielec"},{"rni","Nisko"},{"rpr","Przemyski"},{"rpz","Przeworsk"},{"rrs","Ropczyce"},{"rze","Rzeszowski"},{"rsa","Sanok"},{"rst","Stalowa Wola"},{"rsr","Strzyżów"},{"rta","Tarnobrzeski"}

                ,{"bi","Białystok"},{"bl","Łomża"},{"bs","Suwałki"},{"bau","Augustów"},{"bia","białostocki"},{"bbi","Bielsk Podlaski"},{"bgr","Grajewo"},{"bha","Hajnówka"},{"bkl","Kolno"},{"blm","Łomżyński"},{"bmn","Mońki"},{"bse","Sejny"},{"bsi","Siemiatycze"},{"bsk","Sokółka"},{"bsu","Suwalski"},{"bwm","Wysokie Mazowieckie"},{"bza","Zambrów"}

                ,{"gd","Gdańsk"},{"ga","Gdynia"},{"gs","Słupsk"},{"gsp","Sopot"},{"gby","Bytów"},{"gch","Chojnice"},{"gcz","Człuchów"},{"gda","Pruszcz Gdański"},{"gka","Kartuzy"},{"gks","Kościerzyna"},{"gkw","Kwidzyn"},{"gle","Lębork"},{"gmb","Malbork"},{"gnd","Nowy Dwór Gdański"},{"gpu","Puck"},{"gsl","Słupski"},{"gst","Starogard Gdański"},{"gtc","Tczew"},{"gwe","Wejherowo"}

                ,{"pk","Kalisz"},{"pko","Konin"},{"pl","Leszno"},{"po","Poznań"},{"pch","Chodzież"},{"pct","Czarnków"},{"pgn","Gniezno"},{"pgs","Gostyń"},{"pgo","Grodzisk Wielkopolski"},{"pja","Jarocin"},{"pka","Kaliski"},{"pke","Kępno"},{"pkl","Koło"},{"pkn","Koniński"},{"pks","Kościan"},{"pkr","Krotoszyn"},{"ple","Leski"},{"pmi","Międzychód"},{"pnt","Nowy Tomyśl"},{"pob","Oborniki"},{"pos","Ostrów Wielkopolski"},{"pot","Ostrzeszów"},{"pp","Piła"},{"ppl","Pleszew"},{"poz","Poznański"},{"pra","Rawicz"},{"psl","Słupca"},{"psz","Szamotuły"},{"psr","Środa Wielkopolska"},{"pse","Śrem"},{"ptu","Turek"},{"pwa","Wągrowiec"},{"pwl","Wolsztyn"},{"pwr","Września"},{"pzl","Złotów"}

                ,{"zk","Koszalin"},{"zs","Szczecin"},{"zsw","Świnoujście"},{"zbi","Białogard"},{"zch","Choszczno"},{"zdr","Drawsko"},{"zgl","Goleniów"},{"zgy","Gryfice"},{"zgr","Gryfino"},{"zka","Kamień Pomorski"},{"zkl","Kołobrzeg"},{"zko","Koszaliński"},{"zmy","Myślibórz"},{"zpl","Police"},{"zpy","Pyrzyce"},{"zsl","Sławno"},{"zst","Stargard Szczeciński"},{"zsz","Szczecinek"},{"zsd","Świdwin"},{"zwa","Wałcz"}

                ,{"dj","Jelenia Góra"},{"dl","Legnica"},{"db","Wałbrzych"},{"dw","Wrocław"},{"dbl","Bolesławiec"},{"ddz","Dzierżoniów"},{"dgl","Głogów"},{"dgr","Góra"},{"dja","Jawor"},{"dje","Jeleniogórski"},{"dka","Kamienna Góra"},{"dkl","Kłodzko"},{"dle","Legnicki"},{"dlb","Lubań"},{"dlu","Lubiń"},{"dlw","Lwówek"},{"dmi","Milicz"},{"dol","Oleśnica"},{"doa","Oława"},{"dpl","Polkowice"},{"dst","Strzelin"},{"dsr","Środa Śląska"},{"dsw","Świdnica"},{"dtr","Trzebnica"},{"dba","Wałbrzyski"},{"dwl","Wołów"},{"dwr","Wrocławski"},{"dza","Ząbkowice"},{"dzg","Zgorzelec"},{"dzl","Złotoryja"}

                ,{"csw","Świecie"},{"ctr","Toruński"},{"ctu","Tuchola"},{"cwa","Wąbrzeźno"},{"cwl","Włocławski"},{"czn","Żnin"},{"cb","Bydgoszcz"},{"cg","Grudziąc"},{"ct","Toruń"},{"cw","Włocławek"},{"cal","Aleksandrów Kujawski"},{"cbr","Brodnica"},{"cby","Bydgoski"},{"cch","Chełmno"},{"cgd","Golub-Dobrzyń"},{"cgr","Grudziąski"},{"cin","Inowrocław"},{"cli","Lipno"},{"cmg","Mogilno"},{"cna","Nakło nad Notecią"},{"cra","Radziejów"},{"cry","Rypin"},{"cse","Sępólno Krajeńskie"}

                ,{"el","Łódź"},{"ep","Piotrków Trybunalski"},{"es","Skierniewice"},{"ebe","Bełchatów"},{"eku","Kutno"},{"ela","Łask"},{"ele","Łęczyca"},{"elc","Łowicz"},{"elw","Łódzki"},{"eop","Opoczno"},{"epa","Pabianice"},{"epj","Pajęczno"},{"epi","Piotrkowski"},{"epd","Poddębice"},{"era","Radomsko"},{"erw","Rawa Mazowiecka"},{"esi","Swieradz"},{"esk","Skierniewicki"},{"etm","Tomaszów Mazowiecki"},{"ewi","Wieluń"},{"ewe","Wieruszów"},{"ezd","Zduńska Wola"},{"ezg","Zgierz"}

                ,{"sb","Bielsko-Biała"},{"sy","Bytom"},{"sh","Chorzów"},{"sc","Częstochowa"},{"sd","Dąbrowa Górnicza"},{"sg","Gliwice"},{"sjz","Jastrzębie Zdrój"},{"sj","Jaworzno"},{"sk","Katowice"},{"sm","Mysłowice"},{"spi","Piekary Śląskie"},{"srs","Ruda Śląska"},{"sr","Rybnik"},{"si","Siemianowice Śląskie"},{"so","Sosnowiec"},{"sw","Świętochłowice"},{"st","Tychy"},{"sz","Zabrze"},{"szo","Żory"},{"sbe","Będzin"},{"sbi","Bielski"},{"sci","Cieszyn"},{"scz","Częstochowski"},{"sgl","Gliwicki"},{"skl","Kłobuck"},{"slu","Lubliniec"},{"smi","Mikołów"},{"smy","Myszków"},{"sps","Pszczyna"},{"src","Racibórz"},{"srb","Rybnicki"},{"sta","Tarnowskie Góry"},{"sty","Tyski"},{"swd","Wodzisław Śląski"},{"sza","Zawiercie"},{"szy","Żywiec"}

                ,{"tk","Kielce"},{"tbu","Busko"},{"tje","Jędrzejów"},{"tka","Kazimierza Wielka"},{"tki","Kielecki"},{"tkn","Końskie"},{"top","Opatów"},{"tos","Ostrowiec Świętokrzyski"},{"tpi","Pińczów"},{"tsa","Sandomierz"},{"tsk","Skarżysko-Kamienna"},{"tst","Starachowice"},{"tsz","Staszów"},{"twl","Włoszczowa"}

                ,{"ne","Elbląg"},{"no","Olsztyn"},{"nba","Bartoszyce"},{"nbr","Braniewo"},{"ndz","Działdowo"},{"neb","Elbląski"},{"nel","Ełk"},{"ngi","Giżycko"},{"nil","Iława"},{"nke","Kętrzyn"},{"nli","Lidzbark Warmiński"},{"nmr","Mrągowo"},{"nni","Nidzica"},{"nnnm","Nowe Miasto Lubawskie"},{"nog","Olecko"},{"nol","Olsztyński"},{"nos","Ostruda"},{"npi","Pisz"},{"nsz","Szczytno"}};

        String voivodeship="NA";
        switch (shortcut.charAt(0)) {

            case 'l':

                voivodeship = "Lubelskie";

                break;

            case 'd':

                voivodeship = "Dolnośląskie";

                break;

            case 'f':

                voivodeship = "Lubuskie";

                break;

            case 'k':

                voivodeship = "Małopolskie";

                break;

            case 'r':

                voivodeship = "Podkarpackie";

                break;

            case 'w':

                voivodeship = "Mazowieckie";

                break;

            case 't':

                voivodeship = "Świętokrzyskie";

                break;

            case 'o':

                voivodeship = "Opolskie";

                break;

            case 's':

                voivodeship = "Śląskie";

                break;

            case 'b':

                voivodeship = "Podlaskie";

                break;

            case 'c':

                voivodeship = "Kujawsko-Pomorskie";

                break;

            case 'e':

                voivodeship = "Łódzkie";

                break;

            case 'g':

                voivodeship = "Pomorskie";

                break;

            case 'n':

                voivodeship = "Warmińsko-Mazurskie";

                break;

            case 'p':

                voivodeship = "Wielkopolskie";

                break;

            case 'z':

                voivodeship = "Zachodniopomorskie";

                break;

        }

        for (String [] pair : plates) {
                if(pair[0].equals(shortcut)) {
                    foundCity = pair[1];
                }
            }
        if (!foundCity.equals("nie ma takiej rejestracji :<"))
            return  "wojewodztwo: " + voivodeship + "\npowiat: " + foundCity;
        else
            return foundCity;
    }
}
