# Workshop

## Sprint 2

### Kravspecifikation

| ID | Navn | Beskrivelse |
|---|---|---|
|F01 | Tilføjelse af bygning | Det skal være muligt at tilføje en bygning til systemet. En bygning er kendetegnet ved et unikt navn|
|F02 | Fjernelse af bygning | Det skal være muligt at fjerne en bygning fra systemet, hvorved sensorer og aktuatorer associeret med bygningen også fjernes.|
|F03 | Tilføjelse af sensor | Det skal være muligt at tilføje en sensor til systemet og associere denne med en bygning. En sensor er kendetegnet ved et unikt navn, en type (CO2/Temperatur) og dens nuværende værdi. Værdien er indtil videre bare en dummyværdi, da der i dette system ikke skal interfaces mod hardware.|
|F04 | Fjernelse af sensor | Det skal være muligt at fjerne en given sensor fra systemet, hvorved den fjernes fra den bygning som den er associeret med. |
|F05 | Tilføjelse af aktuator | Det skal være muligt at tilføje en aktuator til systemet og associere denne med en bygning. En aktuator er kendetegnet ved et unikt navn, en type (kun ventilation indtil videre), og dens nuværende setpunkt. | 
|F06 | Fjernelse af aktuator | Det skal være muligt at fjerne en given aktuator fra systemet, hvorved den fjernes fra den bygning som den er associeret med. |
|F07 | Ændring af aktuatorværdi | Det skal være muligt at ændre setpunkts-værdien for en aktuator. |
|F08 | Hent aktuatorværdi | Det skal være muligt at udlæse setpunktsværdien for en given aktuator. |
|F09 |Hent sensorværdi | Det skal være muligt at udlæse setpunktsværdien for en given sensor. |
|F10 | Liste over bygninger | Det skal være muligt at hente en liste over bygninger der er tilføjet til systemet. |
|F11 | Liste over aktuatorer | Det skal være muligt at hente en liste over aktuatorer associeret med en given bygning. |
|F12 | Liste over sensorer | Det skal være muligt, at hente en liste over sensorer associeret med en given bygning. | 

### Noun-Verb analyse
![image](https://user-images.githubusercontent.com/55130904/142160859-d01a06f1-642a-4a65-a090-40af1fcb55be.png)

### CRC-kort eksempel
|**Bygning**| | 
|---|---|
|**Responsibilities**|**Collaborator**|
|Liste af sensorer  | Sensor  |
|Tilføje sensor     | Aktuator|
|Tilføje aktuator|
|Fjerne sensor|
|Fjerne aktuator|

### Klassediagram
![image](https://user-images.githubusercontent.com/55130904/142161668-824a109b-8f24-42bd-bfd5-b4f799ff23a0.png)

## Sprint 3
### Oprids af forskelle
Den største forskel er at der er en Unit klasse. Ud over dette har både sensor og aktuater under klasser.

### Opdateret Klassediagram
![image](https://user-images.githubusercontent.com/55130904/142166896-9e36c743-aae1-4b88-bc02-e51e6ae9d9fa.png)

## Sprint 4
|Krav| Understøttes det?|
|---|---|
|F01| JA|
|F02| JA|
|F03| NEJ|
|F04| NEJ|
|F05| NEJ|
|F06| NEJ|
|F07| NEJ|
|F08| NEJ|
|F09| NEJ|
|F10| NEJ|
|F11| NEJ|
|F12| NEJ|
