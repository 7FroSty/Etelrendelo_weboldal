# Tesztjegyzőkönyv az új funkciókhoz

## 1. Teszteljárások (TP)

### 1.1. Kosárba rakás funkció tesztelése
- Azonosító: TP-01
- Tesztesetek: TC-01
- Leírás: kosárba rakás funkció tesztelése
	0. lépés: Jelenetkezzünk be, majd lépjünk az éttermek fülre
	1. lépés: Az éttermek oldalon válasszunk ki egy éttermet
	2. lépés: Az ételek közül tetszés szerint válasszunk ki valamennyit
	3. lépés: A kiválasztott étel(ek)nél nyomjuk meg a `Kosárba` gombot
	4. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: A kosár oldalon megjelennek a kosárba rakott ételek

### 1.2. Kedvencekhez adás funkció tesztelése
- Azonosító: TP-02
- Tesztesetek: TC-01
- Leírás: kedvencekhez adás funkció tesztelése
	0. lépés: Jelenetkezzünk be, majd lépjünk az éttermek fülre
	1. lépés: Az éttermek oldalon válasszunk ki egy éttermet
	2. lépés: Az ételek közül tetszés szerint válasszunk ki valamennyit
	3. lépés: A kiválasztott étel(ek)nél nyomjuk meg a `Kedvenc` gombot
	4. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: A kedvencek oldalon megjelennek a kedvenc ételek

### 1.3. Kosárból törlés funkció tesztelése
- Azonosító: TP-03
- Tesztesetek: TC-01
- Leírás: kosárból törlés funkció tesztelése
	0. lépés: Menjünk a kosár oldalra (bejelentkezés és étel kosárba rakása után), ahol a felvett ételeink vannak kilistázva
	1. lépés: Válasszunk ki egy tetszőleges ételt, majd nyomjuk meg a `Törlés` gombot
	2. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: A kosár oldalról kitörlődik az adott étel

### 1.4. Rendelés leadása funkció tesztelése
- Azonosító: TP-04
- Tesztesetek: TC-01, TC-02
- Leírás: rendelés leadása funkció tesztelése
	0. lépés: Menjünk a kosár oldalra (bejelentkezés és étel kosárba rakása után), ahol a felvett ételeink vannak kilistázva
	1. lépés: Opcionálisan írhatunk a `Megjegyzés` szövegbeviteli mezőbe `STRING1` szöveget
	2. lépés: A `Cím` szövegbeviteli mezőbe írjuk be a `STRING2` szöveget
	3. lépés: Nyomjuk meg a `Rendelés leadása` gombot
	4. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: Sikeres fizetés oldalra dob
	
### 1.5. Admin bejelentkezés funckió tesztelése
- Azonosító: TP-05
- Tesztesetek: TC-01, TC-02
- Leírás: admin bejelentkezés funckió tesztelése
	0. lépés: Menjünk a fiók oldalra
	1. lépés: Az `E-mail cím` szövegbeviteli mezőbe írjuk be a `STRING1` szöveget
	2. lépés: A `Jelszó` szövegbeviteli mezőbe írjuk be a `STRING2` szöveget
	3. lépés: Nyomjuk meg a `Belépés` gombot
	4. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: Az admin éttermek oldalára dob
	
### 1.6. Éttermek törlése funkció tesztelése
-Azonosító: TP-06
- Tesztesetek: TC-01
- Leírás: éttermek törlése funkció tesztelése
	0. lépés: Menjünk a fiók oldalra és jelentkezzünk be adminként
	1. lépés: Az admin étteremkezelő oldalon válasszunk ki egy éttermet és nyomjuk meg a `Törlés`
	2. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: Az étterem eltűnik az étteremek listájából

## 2. Teszesetek (TC)

### 2.1. Kosárba rakás funkció tesztesetei

#### 2.1.1. TC-01
- TP: TP-01
- Leírás: kosárba rakás funkció tesztelése
- Bemenet: nincs bemenet
- Művelet: nyomjuk meg a `Kosárba` gombot
- Elvárt kimenet:

### 2.2. Kedvencekhez adás funkció tesztesetei

### 2.2.1. TC-01
- TP: TP-02
- Leírás: kedvencekhez adás funkció tesztelése
- Bemenet: nincs bemenet
- Művelet: nyomjuk meg a `Kedvenc` gombot
- Elvárt kimenet:

### 2.3. Kosárból törlés funkció tesztesetei

### 2.3.1. TC-01
- TP: TP-03
- Leírás: kosárból törlés funkció tesztelése
- Bemenet: nincs bemenet
- Művelet: nyomjuk meg a `Törlés` gombot
- Elvárt kimenet:

### 2.4. Rendelés leadása funkció tesztesetei

### 2.4.1. TC-01
- TP: TP-04
- Leírás: rendelés leadása funkció tesztelése
- Bemenet: `STRING1`="Nem működik a csengő" ; `STRING2`="Teszt u. 34"
- Művelet: nyomjuk meg a `Rendelés leadása` gombot
- Elvárt kimenet: Sikeres fizetés oldalra dob

### 2.4.2. TC-02
- TP: TP-04
- Leírás: rendelés leadása funkció tesztelése
- Bemenet: `STRING1`="Nem működik a csengő" ; `STRING2`=""
- Művelet: nyomjuk meg a `Rendelés leadása` gombot
- Elvárt kimenet: Újratölt az oldal, mivel nem adtunk meg címet

### 2.5. Admin bejelentkezés funkció tesztesetei

### 2.5.1 TC-01
- TP: TP-05
- Leírás: admin bejelentkezés funkció tesztelése
- Bemenet: `STRING1`="admin@admin.hu" ; `STRING2`="admin"
- Művelet: nyomjuk meg a `Belépés` gombot
- Elvárt kimenet: Az admin éttermek oldalára dob

### 2.5.2 TC-02
- TP: TP-05
- Leírás: admin bejelentkezés funkció tesztelése
- Bemenet: `STRING1`="admin@admin.hu" ; `STRING2`=""
- Művelet: nyomjuk meg a `Belépés` gombot
- Elvárt kimenet: Újratölt az oldal, mivel nem adtunk meg egy adatot (jelszó)

### 2.6. Éttermek törlése funkció tesztesetei

### 2.6.1 TC-01
- TP: TP-06
- Leírás: éttermek törlése funkció tesztelése
- Bemenet: nincs bemenet
- Művelet: nyomjuk meg a `Törlés` gombot
- Elvárt kimenet: Az étterem eltűnik az étteremek listájából

## 3. Tesztriportok (TR)

### 3.1. Kosárba rakás funkció tesztesetei

### 3.1.1. TR-01 (TC-01)
- TP: TP-01
	3. lépés: megnyomtam a `Kosárba` gombot
	4. lépés: a gomb megnyomásával a kosár oldalon megjelennek a kosárba rakott ételek

### 3.2. Kedvencekhez adás funkció tesztesetei

### 3.2.1. TR-01 (TC-01)
- TP: TP-02
	3. lépés: megnyomtam a `Kedvenc` gombot
	4. lépés: a gomb megnyomásával a kedvencek oldalon megjelennek a kedvenc ételek

### 3.3. Kosárból törlés funkció tesztesetei

### 3.3.1. TR-01 (TC-01)
- TP: TP-03
	1. lépés: megnyomtam a `Törlés` gombot
	2. lépés: a gomb megnyomásával a kosár oldalról kitörlődik az adott étel

### 3.4. Rendelés leadása funkció tesztesetei

### 3.4.1. TR-01 (TC-01)
- TP: TP-04
	1. lépés: "Nem működik a csengő"-t beírtam
	2. lépés: "Teszt u. 34"-et beírtam
	3. lépés: megnyomtam a `Rendelés leadása` gombot
	4. lépés: a gomb megnyomásával a sikeres fizetés oldalra dob

### 3.4.2. TR-02 (TC-02)
- TP: TP-04
	1. lépés: "Nem működik a csengő"-t beírtam
	2. lépés: `Cím` mezőbe nem írok semmit
	3. lépés: megnyomtam a `Rendelés leadása` gombot
	4. lépés: a gomb megnyomásával újratölt az oldal (hiszen nem adtam meg címet)
	
### 3.5.1. TR-01 (TC-01)
-TP: TP-05
	1. lépés: "admin@admin.hu"-t beírtam
	2. lépés: "admin"-t beírtam
	3. lépés: a gomb megnyomásával az admin éttermek oldalra dob

### 3.5.2. TR-02 (TC-02)
-TP: TP-05
	1. lépés: "admin@admin.hu"-t beírtam
	2. lépés: `Jelszó` mezőbe nem írok semmit 
	3. lépés: a gomb megnyomásával újratölt az oldal (hiszen nem adtam meg jelszót)
	
### 3.6.1 TR-01 (TC-01)
-TP: TP-06
	1. lépés: a gomb megnyomásával az étterem eltűnik az étteremek listájából