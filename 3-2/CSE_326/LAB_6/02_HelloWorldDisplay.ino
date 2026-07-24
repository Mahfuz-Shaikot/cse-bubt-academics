#include <LiquidCrystal.h>

// LCD pin configuration
const int rs = 12; // Digital pin 14
const int en = 11; // Digital pin 15
const int d4 = 5;
const int d5 = 4;
const int d6 = 3;
const int d7 = 2;

// Initialize LCD
LiquidCrystal lcd(rs, en, d4, d5, d6, d7);

void setup()
{
    lcd.begin(16, 2);

    lcd.setCursor(0, 0);
    lcd.print("Hello, World!");
}

void loop()
{
    lcd.setCursor(0, 1);

    lcd.print("Time: ");
    lcd.print(millis() / 1000);
    lcd.print(" sec   ");

    delay(100);
}