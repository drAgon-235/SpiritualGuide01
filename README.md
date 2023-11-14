# Spiritual Tarot Guide APP
(Final Project: Syntax-Institute-Berlin - Kotlin-Course )

## The Idea
Those who know Tarot also know that you can use the cards everytime and everywhere, in the train or on a party with other people. 
But also for your own spiritual needs and personal development. 
It can be not only a lot of fun, but also it can help you to heal or consolidate mentally in hard times or when facing big decisions.
## The Problem
A lot of Tarot potential gets lost simply because you cannot always have your cards with you. 
BUT, you most probably do have a smartphone with you. 
This enables me to solve your Tarot deficit problem.
## Solution
My Spiritual Tarot Guide App can really solve this problem by providing you not only several kinds of idividual readings, but also a litte Tarot school for those who want to learn more about Tarot. 
This offer is rounded off by a very personal special service: 
* "Express Card of the Day" 
* "Express Quote of the Day"
  (Here you can get a randomly generated quote by a famous person which you can even save in your favorite quotes list. 
(Maybe you even want to shere this quote? Well this function is not implemented, yet.)

> [!IMPORTANT]
> All the Tarot functions are running ***offline*** as well, thanks to own database :+1:
> 
> Only the "express quote of the day" function needs online connection due to the used quote-API 


----------------------------------------------

# The Architecture

## TAROT Cards (Buttom Navigation Item)
 *(Here we use a hardcoded DB of all 78 Tarot Cards)* 
 
This Fragment offers you 3 options:
1. Express Card of the Day

   - random card from the cards DB (resp. repository or viewmodel)
2. Card readings, each with individual interpretation Fragment

   (the core logic of this App is here; each radings fragment has a distinct laying order with animations and connections to their interpetation fragments)
   - The Small Path
   - The Little Cross
   - The Path of Wisdom
   - The Love Oracle
     
4. All cards & their meanings
   - 5 Recyclerviews (1 for each Arcana) in a ScrollView



## Quotes (Buttom Navigation Item)
This Fragment offers you 3 options:
1. Express Quote of the Day
    - Getting a random quote from API
 *(Here we use a quote API)* 

2. My Favorite Quotes' list

   - Recyclerview (option to delete from My Favorite Quotes)

   - room database nr. 2 for Favorite Quotes only used here

------------------------------------------------------------------

# Technical Features
### Pattern: MVVM

### Required Fetures
- 6 Recyclerviews (required min. 1)
- 2 room-databases (required min. 1)

    - DB 1 for Tarot cards

    - DB 2 for Favorite Quotes
- 1 API (required min. 1)
- 16 Fragments (required min. 3)

### Optional Fetures
- Bottom-Navigation-Bar
- Toolbar (with back-button)
- Animations
  * 22  x  YoYo (Shuffeling, Laying) - only Kotlin
  *  8  x  Transition animations - 'xmlns' set (in "res"-directory: anim) 
  *  1  x  Motion Layout - splash screen (activity 1/2)

### Multi Language Mode:
- English (default)
- German (took me 1 week to translate everything, so it is really 'the same text/meaning')
- more soon ... 


--------------------------------------------------------------------

## Disclaymer
### Quotes API
The free API for random quotes - no key, unlimited requests :smiley: : [zenquotes.io](https://zenquotes.io/)
  ( *very good for basic educational purposes!!!*)

### Design of card backside
The design of the 'backside of the card deck' is a freepik from: [freepik.com](https://www.freepik.com/free-vector/hand-drawn-mystical-tarot-mobile-wallpaper_21862417.htm)

### Design of Tarot Deck - Rider Waite Deck

The "Rider-Waite" Tarot Deck is the most popular one since over 100 years.
It is no more protected by any copyrights, which usually expire after 70 years.
That means, all the attributes & images of each card are worldwide known & the same & free to use for anybody.

In order NOT to type the texts from one of my books, I copied & combined them from two online sources and put them into a static database:

* Source 1: API

Very slow & badly performing API with poor database: [tarot-api-3hv5](https://tarot-api-3hv5.onrender.com/api/v1/cards) 

* Source 2: DATABASE

Very good free "Rider-Waite" Tarot Deck Database - Texts & Pictures on:  [kaggle.com](https://www.kaggle.com/datasets/lsind18/tarot-json?resource=)


