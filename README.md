# Cross-Platform Számológép    
         
Egy Javaban íródott cross-platform, _ultimate_, open-source számológép minden olyan rendszerre amire íródott JVM!     


![calculator.gif](CrossPlatformCalculator/src/main/resources/docs/preview/calculator.gif)    
---

### Projektmunkások
| Contributor  | Profil      | Munkaállomás |    
|--------------|----------:|-------------:|       
| Racs Tamás   |[cant0r](https://github.com/cant0r)|   monospace  |
|              |[pr3sbyter](https://github.com/pr3sbyter)|  majestic12  |
| György Dóra  |[gydora03](https://github.com/gydora03)|       -      |
| Pallagi Ádám |[adampallagi](https://github.com/adampallagi)|       -      |

### Követelmények
* **JDK 11**
* **Maven**


### Telepítás [Felhasználóként]
1. Töltsd le a legfriseeb __*RELEASE.ZIP*__ vagy __*RELEASE.TAR.GZ*__ fájlt a repo Releases oldaláról.    
2. Csomagold ki az állományt
3. Futtasd a mellékelt .jar állományt a lehetséges módok alapján


### Telepítés [Fejlesztőként]
1. Klónozd le a repot
2. Állítsd elő a futtatható .jar állományt a következők alapján:
```bash
cd SZFM*
cd Cross*
mvn clean test package
```
3. Futtasd a .jar állományt:
```bash
java -jar target/Cross*.jar
```


