# Funkcionális specifikáció  
### A rendszer céljai és nem céljai.
Az alapvető célunk, hogy egységesítsük a magyar matematika oktatást, ennek a Cross-Platform Számológépnek a segítségével. A különböző forrásokból használt számológépekkel a diákokoknak megnehezítheti a dolgát hiszen azt a tanár se feltétlenül ismeri és így nehezebben tudja elmagyarázni milyen funkciót hol tud a számológépben megtalálni. Ezen felül lehet, hogy az ismeretlen forrsából szármozó számológép a megfelelő funkciókat nem is tartalmazza. Ennek kiküszöbölésére szeretnénk létrehozni ezt a megbízható számológépet amit bármilyen platformon nyugodtan használhat, a tanárok is meg tudják tanítani a számológép képességeit egy az erre a célre személyre szabott számológéppel. Nem célunk ezzel, hogy a többi számológépet kitúrjuk, csak, hogy legyen egy egységes számológép az otatás produktivitásának maximalizálásáért.

---

### Jelenlegi helyzet leírása
Egy az általános iskolákat összefogó tanári szevezet új matematikai szoftvereket akar rendelni.     
Az iskoláik tanulóinak többsége **Microsoft Windows** felhasználó, így
alapértelmezetten **a gyári számológépet használják** különböző számításai igényeik kielégítésére.      
Észrevették azonban egy egyre nagyobb mértékeket öltő tendenciát, a nebulók
elhagyják _szeretett_ Microsoft Windows operációs rendszerünket egy újabb, még általunk is alig ismert, általuk __GNU+Linux__-nak nevezett operációs rendszerekre.       
__Olyan rendszereket használnak, mint például:__   
* Arch Linux
* Gentoo
* Manjaro
* Fedora
* Hannah Montana Linux
* Pop! OS    

A lényeg csupán az, hogy valakik a GTK+-os könyvtárakat, valakik a Qt könyvtárakat, ileltve egyéb más könyvtárakat hazsnálnak, és ezek mind-mind egyedi szoftverrrel rendelkeznek és ezek mind eltérnek valamellyest.  
  
Tehát ezeknél a rendszereknél azt tapasztalták, hogy a beépített számológépek nagyon eltérőek egymástól, így egyelőre még Windows-os számológépet ajánjlák használatra és használják oktatásra.    

---

### Vágyálom rendszer leírása  
A Csoport fontosnak tartja a legkorszerúbb technológiák használatát, mivel a szoftvert Java nyelven megírva szeretnék megkapni:
* A modern JavaFX keretrendszert fogjuk használni
* Build Automation Tooll pedig a Maven lesz ami szintén CrossPlatform, így az adminjaik is tudják majd szerkeszteni igényeik szerint, ha szükséges.
A csoportunk nagyon fontosnak tartja, hogy tanárokként lépést tartsunk a technológiával, hogy a lehető legkorszerűbb eszközöket használjuk az oktatásban, illetve védeni tudjuk diákjainkat az új technológiák jelentette veszélyektől.    
   
Szeretnék egységesíteni a szoftvereiket, ebbe beletartozik a kinézet is, szerencsére a JavaFX használatával modern kinézetű alkalmazást tudunk létrehozni ami platformokon keresztül megegyezik.   

Kérik, hogy az alapvető matematikai műveltek mellett támogasson a számológép trigonometria függvényeket, illetve más _haladóbb_ matematikai funckionalitást.    
Továbbá, szeretnék, ha a számológép támogatna egyfajta __"Történelem"__ módot, hogy ellehessen menteni az eddig elvégzett számításokat.

---

### Jelenlegi üzleti folyamatok modellje
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

### Igényelt üzleti folyamatok modellje

1. Támogat alap matematikai műveleteket
    - Az alapműveletek a numerikus billentyűzet közvetlen közelében letten elhelyezve
2. Támogat haladó matematikai koncepciókat
    - Konverziók, trigonometriai függvények, híres konstansok beépítve a hozzájuk tartozó gombokhoz
    - A funkciók típus szerint vannak csoportosítva, a műveletek könnyebb megtalálása érdekében
3. Támogatja a History (Előzmény) módot
    - Az elvégzett számításokat lehessen elmenti valamilyen módon.
    - Átlátható, az egyes műveletek nem folynak össze
4. Az egyes gombok egyértelműen utalnak a funkciójukra.

---

### Követelménylista

- K01. Könnyen űzemeltethető
- K02. Reszponzív GUI
- K03. Java
- K04. Cross-Platform
- K05. History (Előzmény) mód
- K06. Matematikai alapműveletek
- K07. Matematikai haladó műveletek

---

### Használati esetek [Use cases]
1. __Title:__  A tanuló számítást végez és eredményt kap
   __Main Success Scenario:__ 
    1. A tanuló futtatja a programot (JVM elindul előtte :)).
    2. A program betölti a JavaFX keretrendszert.
    3. A program betölti classpath útján a GUI-t leíró FXML fájt.
    4. A user beírja a kiszámítandó kifejezést.
    5. A számológép részeredményekkel szolgál minden operátor használat esetén.
    6. A felhasználó az '=' gombra kattinva elindítja a végső kiértékelést
    7. A számológép a végső ereményt szolgáltatja.               

    __Extensions:__   
    1a. Nem létezik az FXML fájl    
   * A rendzser összeomlik. "Keresse fel valamelyik rendszergazdát!"  

   1b. A konfigurációs fájl létezik, de sikertelen a parse-olása
   * Ekvivalens 1.a kezelésével
   1c. Értelmezhetetlen matematikai művelet akar elvégezni a user
   * Pl: 0-val osztás esetén dobjon hibát 

   4a/5a.: __[UNDECIDED]__ A user egy kifejezést gépel be
   * Az operátorok nem eredményeznek részkiértékelést
   * Kiértékelési szabályokat követve kifejezés fa épül
   * '='-ra kattinva kiértékelődik a szintaktikailag helyes kifejezés
   * Ellenben, hibát dob a rendszer


2. __Title:__  A tanuló megtekinti eddigi számításait  
   __Main Success Scenario:__     
   1. Kiválasztja a Történelem funckiót.
   2. Lemezre lementődnek az eddig elvégzett számítások
   3. Megnyitja az aktuális _historyLog.txt_ állományt.
   4. Ha akarja, vágolapra másolja adott számítást.
   5. Ha akarja, törli az előzményeket.

   __Extensions:__   
   1a-5a. Bármilyen hiba esetén azonnal megsemmisíti önmagát(processzus) maga után hagyva a log fájlt a host adminisztárotai számára.   

3. __Title:__ A tanuló elmenti memóriába az aktuális értéket        
   __Main Success Scenario:__       
   1. A tanuló elvégzett számítást.
   2. Az értéket a rendszer kijelzi a _kijelzőn_.
   3. A tanuló a  memóriagombok egyikére kattint
   4. A rendszer elmenti a megfelelő slotba az értéket

   __Extensions__:    
   1a. Begépel egy értéket   

4. __Title:__ A tanuló lekér egy mentett értéket     
   __Main Success Scenario:__      
   1. A tanuló a memóriagombok egyikére kattint
   2. A mentett érték bekerül egy rendszerváltozóba
   3. A rendszer megjeleníti az értéket a _kijelzőn_

   __Extension:__    
   2a. Amennyiben nincs mentett érték semmi nem történik.   

5. __Title:__ A tanuló lekér egy konstanst   
   __Main Success Scenario:__    
   1. A tanuló az kurzort a menüre viszi
   2. Megnyílik az adott menüelem alatt az opciók
   3. Választ egy konstanst
   4. A rendszer megjelenítani a _kijelzőn_ konstans nevével

   __Extensions:__  
   4a. Neve helyett értékét jeleníti meg.   
   4b. Ha konstans nem egész akkor adott pontosság mellett jeleníti meg a _kijelzőn_.


---

### Képernyő tervek

![képernyőterv](./preview/calculator.png)

---

### Fogalomszótár
Fogalmak:
* **Linux**: Avagy Linux-rendszermag, rendszermag.  
* **Rendszermag**: Az operációs rendszer erőforrásait kezelő program.
* **Linux disztribúció**: A Linux-disztribúciók a Linux-kernelre épülő terjesztések. Linux kernel mellett több-kevesebb szabad szoftvert és kereskedelmi szoftvert tartalmazhatnak.  
* **GNU/Linux, GNU+Linux, ...**: Linux nem egy operációs rendszer magában, inkább egy újabb szabad komponense a teljesen fukcionáló GNU rendszernek, amelyeket a GNU corelibs, shell eszközök és létfontosságú rendszerkomponensek műküödtetnek egy teljes OS-ként, POSIX-meghatározás szerint.
* **GUI (Graphic User Interface)**: A felület amit a felhasználó lát és ahol a program funkcióit használja
* **Előzmény (History) mód**: A korábban elvégzett műveletek listája.
* **Cross-Platform**: Másnéven platformfüggetlenség, mely olyan operációs rendszerekre, programozási nyelvekre vagy számítógépes programokra, szoftverekre és implementációikra vonatkozik, amelyek több számítógépes platformon képesek mülködni. 
* **Platform**: Olyan hardver- és/vagy szoftverkörnyezet, mely meghatározza, hogy az adott számítógépen milyen más programok használhatók.
