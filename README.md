# Sorting Algorithms Activity

## 1. Unsa ang gibuhat sa programa?

Ang `SortingAlgorithms.java` usa ka Java program nga naghan-ay sa mga integer gikan sa pinakagamay paingon sa pinakadako. Gigamit niini ang tulo ka sorting algorithm: Bubble Sort, Selection Sort, ug Insertion Sort. Parehas nga original array ang gigikanan sa matag algorithm, apan tagsa-tagsa sila og kopya aron patas ang pagsulay ug dili mausab ang original nga datos.

## 2. Giunsa pagtrabaho ang matag sorting algorithm?

### Bubble Sort

Sa Bubble Sort, tan-awon ang duha ka numero nga magtapad. Kung ang naa sa wala mas dako kaysa naa sa tuo, mag-ilis sila og pwesto. Balik-balikon kini hangtod ang mga numero naa na sa hustong han-ay. Sama kini sa hinay-hinay nga pagdala sa dagkong numero paingon sa tuo nga bahin.

### Selection Sort

Sa Selection Sort, pangitaon una ang pinakagamay nga numero sa wala pa mahan-ay nga bahin sa array. Ibutang kini sa sunod nga bakanteng posisyon sa unahan. Human ana, pangitaon na usab ang sunod nga pinakagamay hangtod mahuman ang tibuok array.

### Insertion Sort

Sa Insertion Sort, magsugod sa ikaduhang numero. Itandi kini sa mga numero nga naa na sa wala nga bahin ug ibalhin ang mas dagkong numero aron maipasulod ang kasamtangang numero sa hustong pwesto. Parehas kini sa paghan-ay sa mga baraha sa kamot samtang nagdula.

## 3. Kalainan sa tulo ka algorithm

Ang Bubble Sort naggamit og pagtandi sa magtapad nga numero ug pag-ilis sa ilang pwesto. Ang Selection Sort mangita sa pinakagamay nga numero una ug ibutang kini sa unahan. Ang Insertion Sort mopasulod sa matag numero ngadto sa hustong pwesto sa bahin nga nahuman na og han-ay.

Sa kasagarang kahimtang, ang tulo adunay O(n²) nga oras sa pagdagan. Apan lahi ilang lihok: ang Bubble Sort mahimong mohunong sayo kung walay na-ilis, ang Selection Sort kasagarang mangita gihapon sa minimum sa matag pasada, ug ang Insertion Sort paspas kung hapit na daan mahan-ay ang mga numero.

## 4. Mga tubag sa reflection questions

### 1. Giunsa paghan-ay sa matag sorting algorithm ang mga numero? Unsa ang kalainan sa ilang proseso?

Ang Bubble Sort magkumpara sa magtapad nga numero ug mag-ilis kung dili sakto ang ilang han-ay. Ang Selection Sort mangita sa pinakagamay nga numero unya ibutang kini sa unahan. Ang Insertion Sort mokuha og usa ka numero ug isulod kini sa hustong lugar taliwala sa mga numero nga nauna nang nahan-ay. Pareho ang ilang tumong, pero lahi ang paagi sa pag-abot niini.

### 2. Asa sa tulo ang pinakasayon sabton ug buhaton? Ngano?

Para nako, ang Bubble Sort ang pinakasayon sabton ug buhaton. Sayon ra sundon ang proseso kay itandi lang ang duha ka magtapad nga numero ug mag-ilis kung kinahanglan. Makita dayon kung unsaon paglihok sa mga numero sa matag pasada.

### 3. Kung nahan-ay na daan ang mga numero, asa ang mas maayo? Ipasabot.

Para nako, ang Insertion Sort ang mas angay kung nahan-ay na daan ang array. Sa ingon nga kahimtang, dili na kinahanglan ibalhin ang mga numero kay naa na sila sa hustong pwesto. Ang algorithm makakompleto gamit ang gamay ra nga pagtandi, busa ang dagan niini mahimong O(n). Ang Bubble Sort nga adunay early-stop check mahimo usab nga mohunong human sa usa ka pasada, apan ang Insertion Sort natural nga episyente sa hapit o hingpit nang nahan-ay nga datos.

### 4. Unsa ang mahitabo kung dugangan ang mga numero sa array? Unsaon niini pag-apekto sa performance?

Kung modaghan ang mga numero, mas daghan ang ikumpara ug lihokon sa matag algorithm. Sa kasagarang dili pa nahan-ay nga datos, ang tulo mahimong mogahin og mas taas nga oras kay ang ilang average ug worst-case performance kay O(n²). Busa, kung modako kaayo ang array, mas klaro ang paghinay sa ilang performance. Ang Insertion Sort mahimong maayo gihapon kung hapit na mahan-ay ang datos.

### 5. Isip umaabot nga programmer, nganong importante nga makasabot sa lain-laing sorting algorithm imbis usa ra ang gamiton?

Importante nga makahibalo ko sa lain-laing sorting algorithm kay dili parehas ang kahimtang sa tanang programa. Naay panahon nga gamay ra ang datos, naay panahon nga daghan kaayo, ug usahay hapit na daan mahan-ay ang mga numero. Kung masabtan nako ang ilang kalainan, makapili ko sa pamaagi nga mas angay ug mas episyente para sa akong programa.

## 5. Giunsa pag-compile ug pagpadagan

Ablihi ang terminal sulod sa `SortingAlgorithms_Activity` folder, dayon i-type:

```bash
javac SortingAlgorithms.java
java SortingAlgorithms
```

### Expected output

```text
Original Array: [45, 12, 78, 3, 56, 23, 89, 1, 34, 67]
Bubble Sort:    [1, 3, 12, 23, 34, 45, 56, 67, 78, 89]
Selection Sort: [1, 3, 12, 23, 34, 45, 56, 67, 78, 89]
Insertion Sort: [1, 3, 12, 23, 34, 45, 56, 67, 78, 89]
```
