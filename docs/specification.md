Cross-Platform Számológép

### Jelenlegi helyzet leírása 
Mi egy általános iskolákat összefogó tanári szervezet vagyunk, célunk, hogy a város minden általános iskolása ugyanabban a tanítási minőségben részesüljön, mint bármelyik társa.       
Az iskoláink tanulóinak többsége **Microsoft Windows** felhasználó, így
alapértelmezetten **a gyári számológépet használják** különböző számításai igényeik kielégítésére.      
Észrevettünk azonban egy egyre nagyobb mértékeket öltő tendenciát, a nebulók
elhagyják _szeretett_ Microsoft Windows operációs rendszerünket egy újabb, még általunk is alig ismert, általuk __GNU+Linux__-nak nevezett operációs rendszerekre.       
__Olyan rendszereket használnak, mint például:__   
* Arch Linux
* Gentoo
* Manjaro
* Fedora
* Hannah Montana Linux
* Pop! OS    

De természetesen akadnak még Windows felhasználók is.   
Ezeknél a rendszereknél azt tapasztaltuk, hogy a beépített számológépek nagyon eltérőek egymástól, így egyelőre még Windows-os számológépet ajánljuk használatra és használjuk oktatásra.    

---

### Vágyálomrendszer leírása

A csoportunk nagyon fontosnak tartja, hogy tanárokként lépést tartsunk a technológiával, hogy a lehető legkorszerűbb eszközöket használjuk az oktatásban, illetve védeni tudjuk diákjainkat az új technológiák jelentette veszélyektől.    
Dedikáltságunkat semmi sem jelzi jobban, mint például **a 80 éves Stefi** bácsi esete, aki a beszterce-lakótelepi általános iskolások testnevelő tanára, aki nemrégiben feltelepítette számítógépére az **Arch Linux** Linux disztribúciót egy úgynevezett ``dwm`` ablakkezelő rendszerrel, hogy naprakész maradjon a fiatalsággal, így jobban tudva motiválni őket a sportolásra.     
Amit mi szeretnék, az a szoftverek egységesítése a különböző platformokra. Nem szeretnénk eltiltani a tanulókat a választás lehetőségétől, a digitális szabadságuk fenntartása az érdekünk, viszont annak érdekében hogy az intézményekben hatékonyan tudjunk tanítani egy-egy programot szeretnénk használni egy-egy konkrét feladatra egységesen.  


Először is szeretnénk rendelni egy olyan számológépet ami nem függ az operációs rendszertől, a számológép támogasson haladó matematikai számításokhoz szükséges funkcionalitást is, pl trigonometria függvények. Az operációs rendszer függetlenségét úgy tudjuk, hogy a Java nyelv támogatja, ezt a technológiát preferálnánk.    
Továbbá, szeretnénk, ha a számológép támogatna egyfajta __"Történelem"__ módot, tehát az elvégzett számításokat szeretnénk eltárolni amíg a program fut, illetve szeretnénk egy __"Rögzítés"__ módot is ahol a tanulók feltudják venni az általuk lenyomott gombokat, majd visszajátszani.     

---

### Jelenlegi üzleti folyamatok 

1. Windows számológép használata
	- Diák betölti a Windows NT Kernelt => shell => userspace => megnyitja a Számológépet
	- Alapvető támogatott műveleteket használja
2. GNU/Linux számológép használata
	- Diák betölti a Linux kernelt => shell => userspace
	- AKtuálisan elérhető számológépet használja
3. A diák egy Online számológépet használ
	- Nem egységes számológép
	- különböző bonyolultabb matematikai műveletek használata


---


### Igényelt üzleti folyamatok 

1. Támogasson alap matematikai műveleteket
    - Az alapműveletek a numerikus billentyűzet közvetlen közelében legyenek
2. Támogasson haladó matematikai koncepciókat 
    - Konverziók, trigonometriai függvények, hres konstansok ...
    - A funkciók típus szerint csoportosítva legyenek, a műveletek könnyebb megtalálása érdekében
3. Támogasson History (Előzmény) módot
    - Az előzmény módban az egyes műveletek esetében látni szeretnénk a műveletet, a számo(ka)t melye(ke)n a művelet elvégezve lett, illetve a művelet eredményét
    - Átlátható legyen, az egyes műveletek ne follyanak össze 
4. Támogasson Record (Felvétel) módot
    - Kattintás a record gombra -> a felvétel megkezdődik -> ezt követően rogzülnek a kattintások (sor adatszerkezet) -> a record gombra újra rákattintva végetér és mentődik a felvétel
    - A mentés csak addig létezik amíg a program fut, a program újbóli futtatásával a mentések már nem lesznek elérhetőek


---

### A rendszerre vonatkozó szabályok 

* Az alkalmazás legyen reszponzív
* A nyelv Java legyen, az eszközök szabadon választhatók
* A program ne rögzítse a user inputot amíg nincs Record módban
* GUI legyen JavaFX alapokon
* Történelmi mód nem igényel adatbázist, nem kesz üzemeltetünk adatbázist


---

### Követelménylista 

1. Könnyen üzemeltethetőség
2. Reszponzív GUI
3. Java
4. Cross-Platform
5. Előzmény mód
6. Felvétel mód
7. Matematikai alapműveletek
8. Matematikai haladó műveletek


---


### Fogalomszótár

Fogalmak:
* **Linux**: Avagy Linux-rendszermag, rendszermag.  
* **Rendszermag**: Az operációs rendszer erőforrásait kezelő program.
* **Linux disztribúció**: A Linux-disztribúciók a Linux-kernelre épülő terjesztések. Linux kernel mellett több-kevesebb szabad szoftvert és kereskedelmi szoftvert tartalmazhatnak.  
* **GNU/Linux, GNU+Linux, ...**: Linux nem egy operációs rendszer magában, inkább egy újabb szabad komponense a teljesen fukcionáló GNU rendszernek, amelyeket a GNU corelibs, shell eszközök és létfontosságú rendszerkomponensek műküödtetnek egy teljes OS-ként, POSIX-meghatározás szerint.
* **GUI (Graphic User Interface)**: A felület amit a felhasználó lát és ahol a program funkcióit használja
* **Előzmény (History) mód**: A korábban elvégzett műveletek listája.
* **Felvétel (Record) mód**: Műveletek egy sorának kimentése későbbi felhasználásra.
* **Cross-Platform**: Másnéven platformfüggetlenség, mely olyan operációs rendszerekre, programozási nyelvekre vagy számítógépes programokra, szoftverekre és implementációikra vonatkozik, amelyek több számítógépes platformon képesek mülködni. 
* **Platform**: Olyan hardver- és/vagy szoftverkörnyezet, mely meghatározza, hogy az adott számítógépen milyen más programok használhatók.

---
---
