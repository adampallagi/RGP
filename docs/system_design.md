### A rendszer célja

---

### Projekt terv

---

### Üzleti folyamatok modellje

---

### Követelmények

1. Alap műveletek végrehajtása
    - művelet végrehajtásának a menete: operandus megadása -> művelethez szükséges operátor -> újabb operandus -> egyenlő operátor -> az eredmény megjelenik a kijelzőn
    - összetettebb műveletsorok elvégzése is lehetséges, ekkor az egyenlő operátor helyett újabb alap műveletet jelölő operátor jön, majd újabb operandus. A műveletsor végén, ha már nem akarunk újabb műveleteket elvégezni, akkor az egyenlő operátor megnyomásával lezárjuk a műveletsort és megjelenítjük az eredmény.
2. Haladó matekatikai koncepciók végrehajtása
    - művelet végrehajtásának a menete: operandus megadása -> a művelethez szükséges operátor -> az eredmény autómatikusan megjelenik a kijelzőn, anélkül, hogy megnyomnánk az egyenlő operátort.
    - műveletsorok elvégzése közben is használhóek ezek a funkciók.
3. ELőzmény (History) mód használata
    - az elózmények előhívása nagyon egyszerű, a "Hist" gomb megnyomásával egy ablakban láthatóvá válnak az eddigi műveletek és eredményeik
    - az egyes műveletek egymástól jól elkülönítve láthatóak
    - az előzmények között csak azok a műveletek láthatóak, amelyek a program elindítása óta lettek elvégezve, a program bezárásával az előzmények is eltünnek.

--- 

### Funkcionális terv 

---

### Fizikai környezet

- Reszponzív megjelenés
- A program Java nyelven legyen írva, a fejlesztéshez és teszteléshez használt felületek, eszközök szabadon választhatóak
- A GUI JavaFX alapokon legyen, a számológép kinézete SceneBuilder használatával legyen összeállítva
- Az Előzmény mód nem igényel adatbázist, ezért nem szökséges annak üzemeltetése sem
- A program Windows illetve Linux operációs rendszereken egyaránt futtatható és használható 
- 

---

### Architekturális terv

---

### Tesztterv

---

### Telepítési terv

---

### Karbantartási terv