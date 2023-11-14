# SpiritualGuide APP
(Final Project: Syntax-Institute-Berlin - Kotlin-Course )



## Technical Features
### Required
- 6 Recyclerviews (required min. 1)
- 2 room-databases (required min. 1)

    - DB 1 for Tarot cards

    - DB 2 for Favorite Quotes
- 1 API (required min. 1)
- 16 Fragments (required min. 3)

### Optional
- Bottom-Navigation-Bar
- Toolbar (with back-button)
- Transition animations (8)
- Splash screen (activity)

### Architecture: MVVM

### Multi Language Mode:
- English (default)
- German (took me 1 week to translate everything, so it is really 'the same text/meaning')


# TAROT Cards 
Here you have 3 options:
1. Card of the Day
   1 random card from the cards DB (resp. repository or viewmodel)
3. Card readings (4)
   - The Small Path
   - The Little Cross
   - The Path of Wisdom
   - The Love Oracle
4. All cards & their meanings
   - 5 Recyclerviews (1 for each Arcana) in a ScrollView



# Quote of the Day
Here you have 2 options:
1. Quote of the Day

   - Getting a random quote from API
(option to save it to My Favorite Quotes)
3. My Favorite Quotes' list

   - Recyclerview (option to delete from My Favorite Quotes)

   - room database for Favorite Quotes only
