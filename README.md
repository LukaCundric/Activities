# Activities

## Opis

Activities je preprosta Android aplikacija, izdelana v Android Studiu s programskim jezikom Java. Projekt je nastal v okviru naloge pri predmetu Razvoj mobilnih aplikacij. Namen projekta je spoznati delo z več aktivnostmi (Activities) v Android aplikacijah, prehajanje med njimi ter prenos podatkov s pomočjo razreda Intent.

Aplikacija vsebuje tri aktivnosti: MainActivity, HelloActivity in ThirdActivity, med katerimi je omogočena navigacija s klikom na gumbe in s potezno navigacijo.

## Funkcionalnosti

- **Števec (MainActivity)** – omogoča povečevanje števca s klikom na gumb COUNT.
- **Prehod med aktivnostmi** – omogoča prehajanje med tremi različnimi aktivnostmi.
- **Prenos podatkov** – trenutna vrednost števca se prenese iz glavne aktivnosti v drugo in tretjo aktivnost s pomočjo metod `putExtra()` in `getIntExtra()`.
- **HelloActivity** – prikaže napis Hello! in trenutno vrednost števca ter omogoča vrnitev na prvo aktivnost.
- **ThirdActivity** – prikaže napis Activity 3 in trenutno vrednost števca ter omogoča prehod na prvo in drugo aktivnost.
- **Navigacija z gumbi** – omogoča prehajanje med aktivnostmi s klikom na ustrezne gumbe.
- **Potezna navigacija (Swipe)** – omogoča prehod iz tretje aktivnosti na prvo s potegom prsta v levo in na drugo s potegom prsta v desno.
- **Uporabniški vmesnik** – posamezne aktivnosti imajo različna barvna ozadja in pregledno razporejene elemente.

## Uporabljene tehnologije

- Java
- XML
- Android Studio
- Android Activities
- Intent
- Bundle
- ConstraintLayout
- TextView
- Button
- GestureDetector
- OnTouchListener

## Navodila za uporabo

1. Zaženi aplikacijo.
2. Na glavnem zaslonu (MainActivity) klikaj gumb COUNT za povečevanje števca.
3. Klikni GO TO ACTIVITY 2 za prehod na drugo aktivnost, kjer se prikažeta napis Hello! in trenutna vrednost števca.
4. Klikni GO TO ACTIVITY 1 za vrnitev na glavni zaslon.
5. Na glavnem zaslonu klikni GO TO ACTIVITY 3 za prehod na tretjo aktivnost.
6. V tretji aktivnosti lahko klikneš GO TO ACTIVITY 1 za prehod na glavni zaslon ali GO TO ACTIVITY 2 za prehod na drugo aktivnost.
7. Za navigacijo iz tretje aktivnosti lahko uporabiš tudi poteze s prstom:
   - Poteg v levo – prehod na MainActivity.
   - Poteg v desno – prehod na HelloActivity.

## Izgled aplikacije

Spodaj so prikazani posnetki zaslona aplikacije in njenih treh aktivnosti.
<table>
  <tr>
    <td align="center">
      <img width="250" src="https://github.com/user-attachments/assets/2cca5545-7611-41a8-8b16-a601fececafa" />
      <br><b>MainActivity – prvi zaslon</b>
    </td>
    <td align="center">
      <img width="250" src="https://github.com/user-attachments/assets/4f80914e-5170-467c-86da-aec7fce1837b" />
      <br><b>HelloActivity – drugi zaslon</b>
    </td>
    <td align="center">
      <img width="250" src="https://github.com/user-attachments/assets/720d774c-c696-44ef-bab1-376edb1a1ccb" />
      <br><b>ThirdActivity – tretji zaslon</b>
    </td>
  </tr>
</table>

## Cilj naloge

Cilj naloge je bil izdelati Android aplikacijo s tremi različnimi aktivnostmi ter spoznati povezovanje aktivnosti in prenos podatkov med njimi. Pri tem sem uporabil razred Intent za prehajanje med aktivnostmi, metodi putExtra() in getIntExtra() za prenos vrednosti števca ter razred OnSwipeTouchListener za izvedbo potezne navigacije.

## Kaj sem se naučil?

- Ustvarjati in povezovati več aktivnosti v Android Studiu.
- Uporabljati razred Intent za prehajanje med aktivnostmi.
- Prenos podatkov med aktivnostmi z metodama putExtra() in getIntExtra().
- Uporabljati findViewById() za povezovanje elementov uporabniškega vmesnika z Java kodo.
- Uporabljati OnClickListener za zaznavanje klikov na gumbe.
- Uporabljati GestureDetector in OnTouchListener za zaznavanje potez s prstom.
- Ustvarjati uporabniške vmesnike s pomočjo XML in ConstraintLayout.

## Avtor

Luka Cundrič
