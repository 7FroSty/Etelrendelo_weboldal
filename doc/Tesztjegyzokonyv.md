# Tesztjegyzőkönyv

## 1. Teszteljárások (TP)

### 1.1. Regisztráció funkció tesztelése 
- Azonosító: TP-01
- Tesztesetek: TC-01, TC-02, TC-03
- Leírás: regisztráció funkció tesztelése
    0. lépés: Nyissuk meg az oldalt, és menjünk a regisztrációs oldalra
    1. lépés: A `Név` szövegbeviteli mezőbe írjuk be a `STRING1` szöveget
    2. lépés: Az `E-mail cím` szövegbeviteli mezőbe írjuk be a `STRING2` szöveget
	3. lépés: A `Jelszó` szövegbeviteli mezőbe írjuk be a `STRING3` szöveget
	4. lépés: A `Telefon` szövegbeviteli mezőbe írjuk be az `INT1` számot
    5. lépés: Nyomjuk meg a `Regisztráció` gombot 
    6. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: Sikeres regisztráció oldalra dob

### 1.2. Bejelentkezés funkció tesztelése
- Azonosító: TP-02
- Tesztesetek: TC-01, TC-02
- Leírás: bejelentkezés funkció tesztelése
    0. lépés: Nyissuk meg az oldalt, és menjünk el a bejelentkezés oldalra
    1. lépés: Az `E-mail cím` szövegbeviteli mezőbe írjuk be a `STRING1` szöveget
	2. lépés: A `Jelszó` szövegbeviteli mezőbe írjuk be a `STRING2` szöveget
    3. lépés: Nyomjuk meg a `Belépés` gombot 
    4. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: A főoldalra dob

## 2. Teszesetek (TC)

### 2.1. Regisztráció funkció tesztesetei

#### 2.1.1. TC-01
- TP: TP-01
- Leírás: regisztráció funkció tesztelése 
- Bemenet: `STRING1` = Teszt Elek ; `STRING2` = tesztelek@email.com ; `STRING3` = kutyamacska123 ; `INT1` = 06304206930
- Művelet: nyomjuk meg a `Belépés` gombot 
- Elvárt kimenet: Sikeres regisztráció oldalra dob

#### 2.1.2. TC-02
- TP: TP-01
- Leírás: regisztráció funkció tesztelése 
- Bemenet: `STRING1` = Teszt Elek ; `STRING2` = tesztelek@email.com ; `STRING3` = kutyamacska123 ; `INT1` = 06304206930
- Művelet: nyomjuk meg a `Belépés` gombot 
- Elvárt kimenet: Az oldal újratölt, a mezőkbe beírt adatok kitörlődnek (mivel ez a személy már regisztrált)

#### 2.1.3. TC-03
- TP: TP-01
- Leírás: regisztráció funkció tesztelése 
- Bemenet: `STRING1` = Erős Pista ; `STRING2` = erospista@email.com ; `STRING3` = eros123 ; `INT1` = asd
- Művelet: nyomjuk meg a `Belépés` gombot 
- Elvárt kimenet: Hibát ad vissza (mivel a telefonszám int és mi string-et írtunk a helyére)

### 2.2. Bejelentkezés funkció tesztesetei

#### 2.2.1. TC-01
- TP: TP-02
- Leírás: bejelentkezés funkció tesztelése
- Bemenet: `STRING1` = tesztelek@email.com ; `STRING2` = kutyamacska123 
- Művelet: nyomjuk meg az `Belépés` gombot 
- Elvárt kimenet: Főoldalra dob

#### 2.2.2. TC-02
- TP: TP-02
- Leírás: bejelentkezés funkció tesztelése
- Bemenet: `STRING1` = tesztelek@email.com ; `STRING2` = zoldkakadu 
- Művelet: nyomjuk meg az `Belépés` gombot 
- Elvárt kimenet: Az oldal újratölt, a mezőkbe beírt adatok kitörlődnek (mivel rossz jelszót adott meg a megadott email címhez)

## 3. Tesztriportok (TR)

### 3.1. Regisztráció funkció tesztriportjai

#### 3.1.1. TR-01 (TC-01)
- TP: TP-01
    1. lépés: Teszt Elek-et beírtam
    2. lépés: tesztelek@email.com-ot beírtam
	3. lépés: kutyamacska123-at beírtam 
	4. lépés: 06304206930-at beírtam 
    5. lépés: a gomb megnyomásával átdobott a sikeres regisztráció oldalra (helyes eredményt kaptam)

#### 3.1.2. TR-02 (TC-02)
- TP: TP-01
    1. lépés: Teszt Elek-et beírtam
    2. lépés: tesztelek@email.com-ot beírtam
    3. lépés: kutyamacska123-at beírtam 
	4. lépés: 06304206930-at beírtam
	5. lépés: a gomb megnyomásával újratölt az oldal, a mezők üresek (helyes eredményt kaptam)
	
#### 3.1.3. TR-03 (TC-03)
- TP: TP-01
    1. lépés: Erős Pista-t beírtam
    2. lépés: erospista@email.com-ot beírtam
    3. lépés: eros123-at beírtam 
	4. lépés: asd-t beírtam
	5. lépés: a gomb megnyomása hibát ad vissza(helyes eredményt kaptam)

### 3.2. Bejelentkezés funkció tesztriportjai

#### 3.2.1. TR-01 (TC-01)
- TP: TP-02
    1. lépés: tesztelek@email.com-ot beírtam
    2. lépés: kutyamacska123-at beírtam
	3. lépés: a gomb megnyomásával átdobott a főoldalra (helyes eredményt kaptam)
	
#### 3.2.2. TR-02 (TC-02)
- TP: TP-02
    1. lépés: tesztelek@email.com-ot beírtam
    2. lépés: kutyamacska123-at beírtam
	3. lépés: a gomb megnyomásával újratölt az oldal, a mezők üresek (helyes eredményt kaptam)


    