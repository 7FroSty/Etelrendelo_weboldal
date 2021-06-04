PROJEKTTERV

Étel

2020.09.26

F. Sándor

F. Tomaj

Sz. Bettina

Sz. Szabina

# Projektterv 2020

## 1. Összefoglaló

 A csapatunk feladata egy olyan étel rendelő alkalmazás elkészítése, amelyből a rendelő közelében lévő éttermekből lehet rendelni egyszerűen, személyes kontakt nélkül, így elkerülve a vírus terjedését.

## 2. Verziók

 Verzió  Szerző  Dátum  Státusz  Megjegyzés 

 0.1  F. Tomaj  2020-9-30  Tervezet  Legelső verzió 

## 3. A projekt bemutatása
Ez a projektterv az Ételrendelő projektet mutatja be, amely 2020. 09. 27-től 2020.11.30-ig tart. A projekt célja, hogy egy felhasználó könnyedén meg tudja találni a számára legmegfelelőbb ételeket, majd egyszerűen le tudja adni a rendelését az étterem felé.
  1. Rendszerspecifikáció

A megrendelő kérései hogy kiszolgálja a felhasználók igényeit, illetve lehetőséget biztosítson a tulajdonosnak új termékek felvételére. A megvalósításhoz két felületet szükséges létrehozni

- Egy adminisztrációs felület, ahol a megrendelő adminként tud bejelentkezni. Ezen a felületen tud éttermeket felvenni, illetve az éttermeknek külön felhasználót készíteni, illetve ezt használhatja panaszok kezelésére.
- Egy étterem kezelői felület, ahol hozzá tudnak adni ételeket
- Egy futárfelület, ahol megtalálhatóak a kiszállítani való rendelések, illetve a teljesített rendelések
- Felhasználói felület, előzetes regisztráció és még
- felhasználóbarát felület
 - éttermek rendezése értékelésekár alapján
 - éttermek értékelése
 - panasz benyújtása
 - étterem kedvencé tevése

Összességében egy olyan grafikus rendszer megvalósítása a feladat, ahol egy egyszerű felületen, könnyedén tud az ételek között a felhasználó keresgélni, illetve azokból néhányat a virtuális kosárba tenni, majd a vásárlást véglegesíteni, és a kiválasztott ételt megrendelni.

3.1 Funkcionális követelmények

A megrendelő részéről

- adminisztrációs felület megvalósítása
- a meglévő ételek jellemzőinek szerkesztése
- új ételek felvétele, részleteinek megadása
- panaszok, vélemények kezelése a termékekről

A felhasználó részéről

- ételek lekérdezése nevük, típusuk szerint
- ételek szűrése különböző feltételek alapján
- egy virtuális kosárba új termékek bevételi, illetve törlése onnan
- ételek osztályozása, véleményezése, korábbiak olvasása
- panaszbenyújtás lehetősége

-

## 4. Költség és erőforrás-szükségletek

Az erőforrásigényünk kb. 48 személynap.

A rendelkezésünkre áll 280 pont.

## 5. Szervezeti felépítés és felelősségmegosztás

A projekt megrendelője V. László gyakorlatvezető. Az online menetrend projektet a projektcsapat fogja végrehajtani, amely 4 főből áll F. Sándor, F. Tomaj, Sz. Bettina, Sz. Szabina személyből tevődik össze.

 ---  ---  --- 
   Név  e-mail cím 
   
 Megrendelő  V. László  lac@inf.u-szeged.hu 
 
 Projekt menedzser  F. Tomaj  h982765@stud.u-szeged.hu 
 
 Adatbázis és adatkapcsolatokért felelős  Sz. Bettina Sz. Szabina 
 
 Felhasználói felületekért felelős  Sz. Bettina Sz. Szabina 
 
 Az üzleti logikáért felelős  F. Sándor 
 
 Dokumentációért felelős  F. Tomaj 
 
 Tesztelésért felelős  F. Sándor 
 
 Prezentációért felelős  Sz. Bettina 
 

## 6. A munka feltételei

A projekt a következő munkaállomásokat fogja használni a munka során
 A projekt 4 gépet használ, melyek az alábbiak

- Asztali számítógép(CPU R3 3300x, RAM 16GB, videokártya GTX 960 4GB)
- Asztali számítógép(CPU i5 6600, RAM 16GB, videokártya GTX 1060 6GB)
- Asus laptop
- Toshiba laptop

-

Rizikómenedzsment

Betegség (közepes) a projekt elkészülését késleltetheti, ha egy csapattag váratlanul megbetegedik. Ennek következtében a meetingen Discord-on keresztül tartjuk vele a kapcsolatot, ha a betegsége teljesen korlátozza a munkában, akkor a projektmenedzser ideiglenes kijelöl egy helyettesest. (Valószínűség közepes hatás közepes)

Egy számítógép meghibásodása (közepes) előfordulhat, hogy egy csapattag számítógépe ismeretlen okokból meghibásodhat. Az ebből fakadó kellemetlen szituációk elkerülése végett a projektet online is közzé kell tenni a csapattagok számára, illetve ajánlott valamilyen adattárolóra, például pendrive-ra való elmentés. (Valószínűség kicsi hatás közepes).

Adatveszteség (nagy) a csapat csak teljes adatvesztés esetén kerülhet problémába. Mivel a projektet a csapat tagjai között online közzétesszük, illetőleg adattárolókra biztonsági mentéseket készítünk, így csak természeti katasztrófa okozhat fatális adatveszteséget. (Valószínűség kicsi  hatás nagy).

Projekttag (esetleg a csapatot összetartó projectmanager) a kiosztott feladatot nem hajlandó elvégezni (közepes) ekkor rendkívüli meetinget kell tartani, ahol a probléma okát megvitatjuk, majd megoldást keresünk rá. (Valószínűség kicsi  hatás közepes).

## 7. Jelentések

## 7.1. Munka menedzsment
 A munkát F. Tomaj menedzseli. A menedzser feladatai állandó kapcsolattartás a csapattagok között. Kommunikáció a megrendelővel, a kéréseinek, módosítási javaslatainak tolmácsolűsa. A kommunikáció személyesen, valamint online (Discord) történik. A menedzser további feladatai közé tartozik, hogy biztosítja a kapcsolatot a csapattagok között is, valamint folyamatosan tájékozódnia kell, hogy az adott csapattag, hogy áll a számára kiadott feladattal.

### 7.2. Csoportgyűlések
 Első csoportgyűlés
 Jelenlévők F. Sándor, F. Tomaj, Sz. Bettina, Sz. Szabina
 Megbeszélés adatai Discordon keresztül, mindenki a számítóján,
 2020-09-26 1630-1900
 Funkcionális és nem funkcionális követelnények megbeszélése, feladatok kiosztása, további kérdések megfogalmazása a megrendelő felé

Második csoportgyűlés

### 7.3. Minőségbiztosítás

Az elkészült terveket minden csapattagnak meg kell tekintenie, probléma, módosítási javaslat, pontosítás esetén mihamarabb értesíteni a többi projekttagot. A meglévő rendszerünk helyes működését a prototípusok bemutatása előtt a tesztelési dokumentumban leírtak végrehajtása alapján ellenőrizzük és összevetjük a specifikációval, hogy az elvárt eredményt kapjuk-e. További tesztelési lehetőségek unit tesztek írása az egyes modulokhoz vagy a kód közös átnézése (code review) egy, a vizsgált modul programozásában nem résztvevő csapattaggal. Szoftverünk minőségét a végső leadás előtt javítani kell a rendszerünkre lefuttatott kódelemzés során kapott metrikaértékek és szabálysértések figyelembevételével.

Az alábbi lehetőségek vannak a szoftver megfelelő minőségének biztosítására

- Specifikáció és tervek átnézése (kötelező)
- Teszttervek végrehajtása (kötelező)
- Unit tesztek írása (választható)
- Kód átnézése (választható)

### 7.4. Átadás, eredmények elfogadása

A projekt eredményeit Kertész Attila fogja elfogadni. A projektterven változtatásokat csak Kertész Attila írásos kérés esetén Kertész Attila engedélyével lehet tenni. A projekt eredményesnek bizonyul, ha specifikáció helyes és határidőn belül készül el. Az esetleges késések pontlevonást eredményeznek.

Az elfogadás feltételeire és beadás formájára vonatkozó részletes leírás a pub-ban olvasható.

### 7.5 Státuszjelentés

Minden leadásnál a projektmenedzser jelentést tesz a projekt haladásáról, és ha szükséges változásokat indítványoz a projektterven. Ezen kívül a megrendelő felszólítására a menedzser 3 munkanapon belül köteles leadni a jelentést. A gyakorlatvezetővel folytatott csapatmegbeszéléseken a megadott sablon alapján emlékeztetőt készít a csapat, amit a következő megbeszélésen áttekintenek és felmérik az eredményeket és teendőket. Továbbá gazdálkodnak az erőforrásokkal és szükség esetén a megrendelővel egyeztetnek a projektterv módosításáról.

## 8. A munka tartalma

### 8.1.  Tervezett szoftverfolyamat modell és architektúra

A projectben részvevők az agilis modellt választva valósítják meg a kívánt programot. A csapat véleménye szerint a mai modern világban ez egy versenyképes konstrukció (ezért a vízesés modell ennél a projectnél nem megfelelő).

A csapat Java nyelven valósítja meg a megrendelő által kérvényezett programot, amelyben fontos szerepet játszanak

- adatbázistáblák
- grafikus felület
- logikai kapcsolat

### 8.2. Átadandók és határidők

 Szállítandó  Neve  Határideje 
 ---  ---  --- 
 D1  Projektterv és útmutató  2020-10-05 
 D2  UML és adatbázis tervek és bemutató  2020-10-19 
 P1+D3  Prototípus I. és bemutató  2020-11-02 
 P2+D4  Kész projekt és bemutató  2020-11-30 

## 9. Feladatlista

Az Webshop project 2020. szeptember 27-én indult. A következőkben a tervezett feladatok részletes összefoglalása található

### Projektterv

Ennek a feladatnak az a célja, hogy készítsünk egy olyan dokumentációt, ahol részletesen le van jegyzetelve, hogy például milyen nyelven írjuk a projectet, mik a rizikótényezők, illetve, hogy ki milyen feladatban fog részt venni. A tervben minden csapattagnak részt kell venni, szükség esetén bárki javaslatot tehet.

Részfeladatai a következők:

#### Projektterv kitöltése

Felelős F. Sándor, F. Tomaj, Sz. Bettina, Sz. Szabina

Tartam 4 nap

Erőforrásigény 1 személynap

#### Bemutató elkészítése

Felelős F. Sándor, F. Tomaj, Sz. Bettina, Sz. Szabina

Tartam 4 nap

Erőforrásigény 1 személynap

### UML és adatbázis tervek

A feladat célja, hogy elkészüljenek az adatbázistervek illetve az alkalmazás áttekinthető modellje. Meetingek során az egyes terveket a projektmenedzser vezetésével áttekintjük, a hibákat megbeszéljük, a tervet készítő személy pedig korrigálja. A bemutató elkészítése közös munka, hisz ezen alkalommal mindenkinek be kell számolni a végleges, esetlegesen kijavított tervekről a projekt többi tagjának.

Részfeladatai a következők

#### Use Case diagram

Felelősök Sz. Bettina, Sz. Szabina

Tartam 4 nap

Erőforrásigény 2 személynap

#### Class diagram

Felelősök F. Tomaj

Tartam 2 nap

Erőforrásigény 2 személynap

#### Sequence diagram

Felelősök F. Sándor

Tartam 2 nap

Erőforrásigény 2 személynap

#### Egyed-kapcsolat diagram (adatbázishoz)

Felelősök Sz. Bettina, Sz. Szabina

Tartam 4 nap

Erőforrásigény 2 személynap

#### Package diagram

Felelősök F. Tomaj

Tartam 2 nap

Erőforrásigény 2 személynap

#### Képernyőtervek

Felelősök Sz. Szabina

Tartam 1 nap

Erőforrásigény 1 személynap

#### Bemutató elkészítése

Felelősök F. Sándor, F. Tomaj, Sz. Bettina, Sz. Szabina

Tartam 4 nap

Erőforrásigény 1 személynap

### Prototípus I. (modellfüggő)

Ennek a feladatnak az a célja, hogy egy bemutatásra alkalmas, futtatható és fordítható program el legyen készítve. Az első prototípusban már implementálva lesz a beléptető rendszer, így a regisztráció is belekerül ebbe a demóba. Az 1. prototípushoz dokumentációk, tesztek, illetve prezentáció készül, melyben a csapat minden tagjának részt kell vennie.

Részfeladatai a következők

#### Bejelentkezési felület frontend

Felelősök Sz. Bettina, Sz. Szabina

Tartam 4 nap

Erőforrásigény 2 személynap

#### Bejelentkezési felület backend

Felelősök F. Sándor, F. Tomaj

Tartam 8 nap

Erőforrásigény 4 személynap

#### Adatbázis feltöltése tesztadatokkal

Felelősök Sz. Bettina, Sz. Szabina

Tartam 4 nap

Erőforrásigény 2 személynap

#### Tesztelési dokumentum

Felelősök F. Sándor

Tartam 2 nap

Erőforrásigény 2 személynap

#### Bemutató elkészítése

Felelősök F. Sándor, F. Tomaj, Sz. Bettina, Sz. Szabina

Tartam 4 nap

Erőforrásigény 1 személynap

### Prototípus II.

Ennek a feladatnak az a célja, hogy piacra kész program elkészüljön, amelyet a megrendelő illetve a felhasználó alkalmazni, tesztelni, használni tudjon. A kész termékekben már az admin képes lesz az éttermek szerkesztésére, törlésére, valamint újak felvételére. A felhasználót barátságos kinézet és elrendezés fogadja, az éttermek, illetve ételek között kedve szerint keresgélhet, értékelhet, véleményezhet, továbbá rendelhet egyet vagy többet. A 2. prototípushoz dokumentációk, tesztek, illetve prezentáció készül, az elkészítésben minden tagnak szerepet kell vállalni, közösen át kell beszélni mindent, mielőtt a terméket piacra dobjuk.

Részfeladatai a következők

#### Dokumentációk, tervek az új funkciókhoz

Felelősök F. Sándor, F. Tomaj, Sz. Bettina, Sz. Szabina

Tartam 8 nap

Erőforrásigény 2 személynap

#### Javított minőségű prototípus új funkciókkal

Felelősök F. Sándor, F. Tomaj, Sz. Bettina, Sz. Szabina

Tartam 8 nap

Erőforrásigény 2 személynap


#### Tesztelési dokumentum az új funkciókhoz

Felelősök F. Sándor

Tartam 2 nap

Erőforrásigény 2 személynap

#### Bemutató elkészítése

Felelősök F. Sándor, F. Tomaj, Sz. Bettina, Sz. Szabina

Tartam 4 nap

Erőforrásigény 1 személynap

## 10. Részleges időbeosztás

![](RackMultipart20200928-4-1wt0zj2_html_c43b3689c82ed25c.png)

## 11. Projekt költségvetés

### 11.1. Részletes erőforrásigény (személynap)

_(Az egyes leadások alkalmával rögzített erőforrásigényt kell beírni minden emberre külön-külön.)_

 Név  1. leadás  2. leadás  3. leadás  4. leadás,  Össz. 
 ---  ---  ---  ---  ---  --- 

  Projektterv  UML és adatbázis  Prototípus I.  Prototípus II. 
 
 F. Sándor  2  3  5  
 F. Tomaj  2  5  5  
 Sz. Bettina  2  6  5  
 Sz. Szabina  2  5  5  

### 11.2. Részletes feladszámok

_(Az egyes leadások alkalmával teljesíthető feladatok számát kell beírni minden emberre külön-külön.)_

Név  1. leadás  2. leadás  3. leadás  4. leadás,  Össz. 
 ---  ---  ---  ---  ---  --- 

  Projektterv  UML és adatbázis  Prototípus I.  Prototípus II. 
 
 F. Sándor  2  
 F. Tomaj  2  
 Sz. Bettina  2  
 Sz. Szabina  2  

### 11.3. Részletes költségvetés

_(Az egyes leadások alkalmával teljesíthető pontszámot kell beírni minden emberre külön-külön.)_

Név  1. leadás  2. leadás  3. leadás  4. leadás,  Össz. 
 ---  ---  ---  ---  ---  --- 

  Projektterv  UML és adatbázis  Prototípus I.  Prototípus II. 
 
 F. Sándor  7  14  28  21  70  
 F. Tomaj  7  14  28  21  70  
 Sz. Bettina  7  21  21  21  70  
 Sz. Szabina  7  21  21  21  70  

### 11.4. Átvétel

A projektet a megrendelő a következő eredménnyel vette át

 Név  1. leadás  2. leadás  3. leadás  4. leadás,  Össz. 
 ---  ---  ---  ---  ---  --- 

  Projektterv  UML és adatbázis  Prototípus I.  Prototípus II. 
 
 F. Sándor 
 F. Tomaj 
 Sz. Bettina 
 Sz. Szabina 
 
 
 
 
 

Szeged, 2020. 09 27.

____________________________ ____________________________

____________________________ ____________________________

Az átadó részéről Az átvevő részéről