## BasicMathTest

Minden teszt esetén három esetet nézünk meg: két estet, amikor a metódus rossz értéket térít vissza 
(rosszul mülködik), illetve egy esetet, amikor azt az eredményt adja vissza, ami matematikailag is helyes.

#### testAdd()
- Készítette: György Dóra
- Két szám összegének a kiszámolásásra szolgáló metódust és annak mülködését teszteli.

#### testSubtract()
- Készítette: György Dóra 
- Két szám különbségének a kiszámolására szolgáló metódust és annak mülködését teszteli.

#### testMultiply()
- Készítette: György Dóra
- Két szám szorzatának a kiszámolására szolgáló metódust és annak mülködését teszteli.

#### testDivide()
- Készítette: György Dóra
- Két szám hányadosának a kiszámolására szolgáló metódust és annak mülködését teszteli.

#### testSin()
- Készítette: György Dóra
- Egy szám szinuszának a kiszámolására szolgáló metódust és annak mülködését teszteli.

#### testCos()
- Készítette: György Dóra
- Egy szám koszinuszának a kiszámolására szolgáló metódust és annak mülködését teszteli.

#### testTan()
- Készítette: György Dóra
- Egy szám tangensének a kiszámolására szolgáló metódust és annak mülködését teszteli.

#### testCtg()
- Készítette: György Dóra
- Egy szám kotangensének a kiszámolására szolgáló metódust és annak mülködését teszteli.

#### testMod()
- Készítette: György Dóra
- Két szám modulusának a kiszámolására szolgáló metódust és annak mülködését teszteli.

#### testPower()
- Készítette: György Dóra
- Egy szám valahányadik hatványának a kiszámolására szolgáló metódust és annak mülködését teszteli.


### BasicCalculatorTest
A Modellre vonatkozó tesztelések.   
A lényeg az ```evaluate(Calculation c)``` letesztelése, ugyanis az adja az alkalmazás magját.   
_Fontos_, hogy csak a public modifier-rel ellátott metódusokat teszteljük egyelőre!   
A tesztek megírásért felelős: **Racs Tamás**   
A teszteket talál a Maven specifikus teszt mappában _calculator_ csomag alatt.    

A tesztek alakja:   
#### testEvaluate_\<method\>     
- Leteszteli, hogy az input ténylegesen a megfelelő műveleteket váltja ki és helyes eredménnyel tér-e vissza az ```evaluate(Calculation c)```   

#### testEvaluate_complexCalcualtion     
- Leteszteli, hogy az inputok sorozata ténylegesen a megfelelő műveleteket váltják ki és helyes eredménnyel tér-e vissza az ```evaluate(Calculation c)```

