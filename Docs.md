Hvort eiga öll tól sem að við notum, eins og gradle, heroku, travis og fl., heima í Developer Manual eða Administration Manual?
Eitt annað, eiga Developer Manual, Administration Manual og Design Report að vera í sama skjalinu eða öll í sitthvoru?


Það fer aðeins eftir því hvað þið farið langt með verkefni og hvernig útfærslan ykkar verður. Þeir hópar sem fara alla leið í continous delivery eru væntanlega með mjög stuttar leiðbeiningar í Administration Manual. Það er líklegast að mesti hlutinn af þessum lýsingum eigi heima í Developer Manual, build og continous intergration tilheyra að mestu heimi forritara og eiga því heima þar. Administration Manual snýst um að lýsa því hvernig tilbúin afurð fer í rekstur. Samkvæmt þessari upptalningu ætti Heroku líklega heima þar að því gefnu að kerfið eigi að keyra þar.
Þetta eiga að vera þrjú mismunandi skjöl


#Development manual 
-ef það er nýr forritari að koma inn í teymið hvað þarf hann að gera
-hvað þarf hann
-git, github aðgang að repoinu til að geta pullað og pushað
-skel (mac, windows) þarf að gera ssh...
-heroku
-java og útgáfa hvar hún fæst



#Administration manual
-Hvernig á að keyra
-Hvar á að keyra
-Með hvaða útgáfu af java þarf að keyra
-Hvernig er hægt að ná í


#Design report

##Inngangur
Síðannarverkefnið í Hugbúnaðarfræði var einfalt forrit unnið eftir þeim aðferðum sem við höfum lært í áfanganum. Forritið er leikur sem hægt er að spila í console og á vef (?). Leikurinn er spilaður af tveimur spilurum í sömu tölvunni þar sem annar vinnur(eigum við að útskýra myllu). Hópurinn Six girls and a guy vann verkefnið, en í hópnum eru Agnes Jóhannesdóttir, Elín Rós Hauksdóttir, Sigurlaug Guðrún Jóhannesdóttir, Vala Rún Valtýsdóttir, Huldar Bjarmi Halldórsson, Laufey Rut Guðmundsdóttir og Margrét Anna Kristjánsdóttir.		

##Hönnun og markmið 
Byrjað var á því að útbúa leikinn TicTacToe sem console forrit. Þegar þeirri vinnu var lokið var hafist handa við að færa leikinn yfir á vefsíðu. 
Verkefnið var að mestu unnið á ubuntu vél hópsins. Kóðinn var skrifaður á forritunarmálinu Java og var farið eftir forritunarreglum og siðareglum hópsins sem má sjá hér að neðan.
	
##Forritunarreglur:
*Þegar ný blokk er opnuð skal hafa hana í sér línu og á það einnig við þegar blokkinni er lokað. 
*Öll föll eru nefnd lýsandi nöfnum.
*Hjálparföll eru nefnd með lýsandi nafni að viðbættu ,,_help”.
*Önnur föll nefnd með lýsandi nöfnum í camelCasing.
*Fastar eru skrifaðir í hástöfum.
*Reynt var að fara eftir helstu Java forritunarreglum sem eru skilgreindar [hér](http://www.oracle.com/technetwork/java/javase/documentation/codeconvtoc-136057.html).

//Fólk forritar í sínu eigin umhverfi.
##Siðareglur:
*Notumst við pair programming
*Skrifa unit test áður og á sama tíma og maður kóðar. Nota TDD.
*Áður en nokkuð er gert, verður kóðinn að keyra á local vélinni. 
*Færa kóðann yfir á Advania vélina, sjá til þess að hann keyri þar.
*Ef hann keyrir, commita og alltaf vera með komment sem útskýrir commitið.
*Git push, alltaf á okkar eigið branch.
*Alltaf að gera pull request þegar er push-að frá branch á master.



Klasarit
Klasinn ticTacToe er aðalklasinn inniheldur main og kallar á hina klasana. Move klasinn sér um að taka inntak frá notenda og athuga hvort það sé leyfilegt að færa það inn í leikinn. Board klasinn tekur við inntaki, ef það er löglegt, og setur merki notendans í reitinn sem hann bað um nema að reiturinn sé nú þegar upptekinn. Player klasinn heldur utan um merki leikmanns. Results klasinn sér svo um að ákvarða vinningshafa eftir því hvernig leikurinn var spilaður.

. 

https://www.draw.io/?state=%7B%22ids%22:%5B%220BzItcVvvYJOWTHVCYncyTFI3ekU%22%5D,%22action%22:%22open%22,%22userId%22:%22118355187328283694481%22%7D#G0BzItcVvvYJOWTHVCYncyTFI3ekU


### Klasarit á eftir að uppfæra
![](https://scontent-lhr3-1.xx.fbcdn.net/hphotos-xfp1/v/t34.0-12/12207717_10207138803165118_1025457102_n.jpg?oh=9a0e2c43634cffa37b00c0a9f10ffdac&oe=56382A72 "Klasarit")


##Vélbúnaður
Staðfest er að forritið keyri á Unix skel á tölvu.

##Hugbúnaður
Verkefnið var unnið á eclipse og fært inn á sameiginlega ubuntu vél hópsins. Búið var til repositoryið TicTacToe á organizationinu Six girls and a guy inni á Github. Þar var kóði verkefnisins geymdur frá upphafi. Travis var sett upp fyrir hópinn og sá um að keyra próf þegar nýjum breytingum var bætt við á Github. Google docs var notað til þess að búa til skýrslur og Mou til þess að koma þeim í rétt format. Draw.io var notað til þess að útbúa klasaritið hér að ofan. 

##Prófanir
Verkefnið var unnið eftir TDD eða test driven development hugmyndafræðinni. Einingarprófanir voru skrifaðar fyrir kóðann og Travis notað til að keyra einingarprófin þegar breytingum var ýtt inn á Github, Selenium(?)

Travis heldur utan um möppu sem inniheldur leikinn okkar og skýrslur sem tengjast honum, svokallaða target möppu. Travis skilar henni aftur á sameiningarvél hópsins ef allt keyrir rétt og þannig er nýjasta jar skráin alltaf aðgengileg á slóð greenqloud vélarinnar. WHAT ENDURORÐA :P






