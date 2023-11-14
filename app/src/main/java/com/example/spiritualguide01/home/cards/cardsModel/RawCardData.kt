package com.example.spiritualguide01.home.cards.cardsModel

import com.example.spiritualguide01.R


// The "Rider-Waite" Tarot Deck is the most popular one since over 100 years.
// It is no more protected by any copyrights, which usually expire after 70 years.
// That means, all the attributes & images of each card are worldwide known & the same & free to use for anybody.
// But in order NOT to type the texts from a common book, I copied & combined them from two online Datasets:
// https://www.kaggle.com/datasets/lsind18/tarot-json?resource= (No API !!!)
// https://tarot-api-3hv5.onrender.com/api/v1/cards (very unprofessional API,
// too slow & too unreliable for usage in my App ( I tested it, only each fifth API-Call was working properly - so I just took the 'description' into my DB, which was missing in the kaggle-DB)

object RawCardData {

    /*
    The design of the backside of the card deck is a freepik from:
    <a href="https://www.freepik.com/free-vector/hand-drawn-mystical-tarot-mobile-wallpaper_21862417.htm">Image by pikisuperstar</a> on Freepik
    Thanks a lot :-)
 */

    // Back side
    val card00Backside = Card(
        id = 0,
        name = R.string.card_back_name,
        suit = SuitEnum.MAJOR_ARCANA,
        value = "1",
        keywords = R.string.card_back_empty,
        fortuneTelling = R.string.card_back_empty,
        meaning_up = R.string.card_back_empty,
        meaning_rev = "",
        qta = R.string.card_back_empty,
        description = R.string.card_back_empty,
        picture = R.drawable.back_02
    )

    // Major Arcana
    val card01TheFool = Card(
        id = 1,
        name = R.string.card01_theFool_name,
        suit = SuitEnum.MAJOR_ARCANA,
        value = "0",
        keywords = R.string.card01_theFool_keywords,
        fortuneTelling = R.string.card01_theFool_fortune_telling,
        meaning_up = R.string.card01_theFool_meaning,
        meaning_rev = "Being gullible and naive, Taking unnecessary risks, Failing to be serious when required, Being silly or distracted, Lacking experience, Failing to honor well-established traditions and limits, Behaving inappropriately",
        qta = R.string.card01_theFool_qta,
        description = R.string.card01_theFool_description,
        picture = R.drawable.m00_fool
    )

    val card02TheMagician = Card(
        id = 2,
        name = R.string.card02_magician_name,
        suit = SuitEnum.MAJOR_ARCANA,
        value = "1",
        keywords = R.string.card02_magician_keywords,
        fortuneTelling = R.string.card02_magician_fortune_telling,
        meaning_up = R.string.card02_magician_meaning,
        meaning_rev = "Inflating your own ego, Abusing talents, Manipulating or deceiving others, Being too aggressive, Using cheap illusions to dazzle others, Refusing to invest the time and effort needed to master your craft, Taking shortcuts",
        qta = R.string.card02_magician_qta,
        description = R.string.card02_magician_description,
        picture = R.drawable.m01_magician
    )

    val card03TheHighPriestess = Card(
        id = 3,
        name = R.string.card03_high_priestess_name,
        suit = SuitEnum.MAJOR_ARCANA,
        value = "2",
        keywords = R.string.card03_high_priestess_keywords,
        fortuneTelling = R.string.card03_high_priestess_fortune_telling,
        meaning_up = R.string.card03_high_priestess_meaning,
        meaning_rev = "Being aloof, Obsessing on secrets and conspiracies, Rejecting guidance from spirit or intuition, Revealing all, Ignoring gut feelings, Refusing to become involved, even when involvement is appropriate",
        qta = R.string.card03_high_priestess_qta,
        description = R.string.card03_high_priestess_description,
        picture = R.drawable.m02_high_priestess
    )

    val card04TheEmpress = Card(
        id = 4,
        name = R.string.card04_empress_name,
        suit = SuitEnum.MAJOR_ARCANA,
        value = "3",
        keywords = R.string.card04_empress_keywords,
        fortuneTelling = R.string.card04_empress_fortune_telling,
        meaning_up = R.string.card04_empress_meaning,
        meaning_rev = "Overindulging, Being greedy, Smothering someone with attention, Debilitating someone by being overprotective, Inhibiting productivity by obsessing on productivity, Being overcome by addictive behavior",
        qta = R.string.card04_empress_qta,
        description = R.string.card04_empress_description,
        picture = R.drawable.m03_empress
    )

    val card05TheEmperor = Card(
        id = 5,
        name = R.string.card05_emperor_name,
        suit = SuitEnum.MAJOR_ARCANA,
        value = "4",
        keywords = R.string.card05_emperor_keywords,
        fortuneTelling = R.string.card05_emperor_fortune_telling,
        meaning_up = R.string.card05_emperor_meaning,
        meaning_rev = "Micromanaging, Crushing the creativity of others with a rigid, iron-fisted approach, Insisting on getting your own way, Assuming a dictatorial mindset, Using overt force to achieve your goals and maintain order",
        qta = R.string.card05_emperor_qta,
        description = R.string.card05_emperor_description,
        picture = R.drawable.m04_emperor
    )

    val card06TheHierophant = Card(
        id = 6,
        name = R.string.card06_hierophant_name,
        suit = SuitEnum.MAJOR_ARCANA,
        value = "5",
        keywords = R.string.card06_hierophant_keywords,
        fortuneTelling = R.string.card06_hierophant_fortune_telling,
        meaning_up = R.string.card06_hierophant_meaning,
        meaning_rev = "Using experience as a means of manipulating or misguiding others, Being dogmatic, Favoring tradition over what is expedient or necessary, Going through the motions of empty rituals, Concealing wisdom, Restricting access to spiritual truths or the gods",
        qta = R.string.card06_hierophant_qta,
        description = R.string.card06_hierophant_description,
        picture = R.drawable.m05_hierophant
    )

    val card07TheLovers = Card(
        id = 7,
        name = R.string.card07_lovers_name,
        suit = SuitEnum.MAJOR_ARCANA,
        value = "6",
        keywords = R.string.card07_lovers_keywords,
        fortuneTelling = R.string.card07_lovers_fortune_telling,
        meaning_up = R.string.card07_lovers_meaning,
        meaning_rev = "Debilitating passion, Allowing an unhealthy desire for love to motivate destructive behavior, Disrupting unity, Working against the best interests of those who care about you, Ill-informed decisions",
        qta = R.string.card07_lovers_qta,
        description = R.string.card07_lovers_description,
        picture = R.drawable.m06_lovers
    )

    val card08TheChariot = Card(
        id = 8,
        name = R.string.card08_chariot_name,
        suit = SuitEnum.MAJOR_ARCANA,
        value = "7",
        keywords = R.string.card08_chariot_keywords,
        fortuneTelling = R.string.card08_chariot_fortune_telling,
        meaning_up = R.string.card08_chariot_meaning,
        meaning_rev = "Resting on laurels, Riding roughshod over the feelings or expectations of others, Focusing more on past successes than future opportunities, Failing to rein in impulsive behavior",
        qta = R.string.card08_chariot_qta,
        description = R.string.card08_chariot_description,
        picture = R.drawable.m07_chariot
    )

    val card09TheStrength = Card(
        id = 9,
        name = R.string.card09_strength_name,
        suit = SuitEnum.MAJOR_ARCANA,
        value = "8",
        keywords = R.string.card09_strength_keywords,
        fortuneTelling = R.string.card09_strength_fortune_telling,
        meaning_up = R.string.card09_strength_meaning,
        meaning_rev = "Indulging weakness, even when you know it will damage your health and happiness, Languishing in addiction, Allowing your instincts to tame and conquer you, Failing to take a stand when necessary",
        qta = R.string.card09_strength_qta,
        description = R.string.card09_strength_description,
        picture = R.drawable.m08_strength
    )

    val card10TheHermit = Card(
        id = 10,
        name = R.string.card10_hermit_name,
        suit = SuitEnum.MAJOR_ARCANA,
        value = "9",
        keywords = R.string.card10_hermit_keywords,
        fortuneTelling = R.string.card10_hermit_fortune_telling,
        meaning_up = R.string.card10_hermit_meaning,
        meaning_rev = "Being a loner, Fearing contact with others, Becoming a know-it-all, Inflating claims of expertise, Hiding your skills and talents out of fear of unworthiness",
        qta = R.string.card10_hermit_qta,
        description = R.string.card10_hermit_description,
        picture = R.drawable.m09_hermit
    )

    val card11WheelOfFortune = Card(
        id = 11,
        name = R.string.card11_wheelOfFortune_name,
        suit = SuitEnum.MAJOR_ARCANA,
        value = "10",
        keywords = R.string.card11_wheelOfFortune_keywords,
        fortuneTelling = R.string.card11_wheelOfFortune_fortune_telling,
        meaning_up = R.string.card11_wheelOfFortune_meaning,
        meaning_rev = "Losing money gambling, Refusing to do your part to bring a plan to fruition, Taking a fatalistic approach to life, Fighting the natural course of events",
        qta = R.string.card11_wheelOfFortune_qta,
        description = R.string.card11_wheelOfFortune_description,
        picture = R.drawable.m10_wheel_fortune
    )

    val card12Justice = Card(
        id = 12,
        name = R.string.card12_justice_name,
        suit = SuitEnum.MAJOR_ARCANA,
        value = "11",
        keywords = R.string.card12_justice_keywords,
        fortuneTelling = R.string.card12_justice_fortune_telling,
        meaning_up = R.string.card12_justice_meaning,
        meaning_rev = "Delivering harsh criticism, Obsessing on rules and regulations, Playing by the book even when it is destructive or counterproductive to do so, Confusing snap decisions with timely action, Playing favorites",
        qta = R.string.card12_justice_qta,
        description = R.string.card12_justice_description,
        picture = R.drawable.m11_justice
    )

    val card13TheHangedMan = Card(
        id = 13,
        name = R.string.card13_hangingMan_name,
        suit = SuitEnum.MAJOR_ARCANA,
        value = "12",
        keywords = R.string.card13_hangingMan_keywords,
        fortuneTelling = R.string.card13_hangingMan_fortune_telling,
        meaning_up = R.string.card13_hangingMan_meaning,
        meaning_rev = "Being untrue to yourself and your values, Refusing to make sacrifices when appropriate, Refusing to adapt to new situations, Blaming others, Profiting at the expense of others",
        qta = R.string.card13_hangingMan_qta,
        description = R.string.card13_hangingMan_description,
        picture = R.drawable.m12_hangman
    )

    val card14Death = Card(
        id = 14,
        name = R.string.card14_death_name,
        suit = SuitEnum.MAJOR_ARCANA,
        value = "13",
        keywords = R.string.card14_death_keywords,
        fortuneTelling = R.string.card14_death_fortune_telling,
        meaning_up = R.string.card14_death_meaning,
        meaning_rev = "Obsessing on death and dying, Refusing to give up old habits or unhealthy relationships, Insisting that everything and everyone should stay the same forever, Failing to take good care of yourself",
        qta = R.string.card14_death_qta,
        description = R.string.card14_death_description,
        picture = R.drawable.m13_death
    )

    val card15Temperance = Card(
        id = 15,
        name = R.string.card15_temperance_name,
        suit = SuitEnum.MAJOR_ARCANA,
        value = "14",
        keywords = R.string.card15_temperance_keywords,
        fortuneTelling = R.string.card15_temperance_fortune_telling,
        meaning_up = R.string.card15_temperance_meaning,
        meaning_rev = "Going to extremes, Disrupting group efforts, Ignoring healthy approaches to life, Becoming an addict, Practicing gluttony, Tearing something or someone apart, Breaking alliances",
        qta = R.string.card15_temperance_qta,
        description = R.string.card15_temperance_description,
        picture = R.drawable.m14_temperance
    )

    val card16TheDevil = Card(
        id = 16,
        name = R.string.card16_devil_name,
        suit = SuitEnum.MAJOR_ARCANA,
        value = "15",
        keywords = R.string.card16_devil_keywords,
        fortuneTelling = R.string.card16_devil_fortune_telling,
        meaning_up = R.string.card16_devil_meaning,
        meaning_rev = "Putting excessive emphasis on appearances, Always wanting more, Valuing possessions more than people or relationships, Allowing base instincts to govern your life, Being selfish, Attributing your own dark impulses to outside forces or other people",
        qta = R.string.card16_devil_qta,
        description = R.string.card16_devil_description,
        picture = R.drawable.m15_devil
    )

    val card17TheTower = Card(
        id = 17,
        name = R.string.card17_tower_name,
        suit = SuitEnum.MAJOR_ARCANA,
        value = "16",
        keywords = R.string.card17_tower_keywords,
        fortuneTelling = R.string.card17_tower_fortune_telling,
        meaning_up = R.string.card17_tower_meaning,
        meaning_rev = "Clinging to traditions that repress growth, Engaging in willful blindness, Rejecting evidence that change is needed, Ignoring guidance from a higher power, Maliciously engaging in destructive behavior",
        qta = R.string.card17_tower_qta,
        description = R.string.card17_tower_description,
        picture = R.drawable.m16_tower
    )

    val card18TheStar = Card(
        id = 18,
        name = R.string.card18_star_name,
        suit = SuitEnum.MAJOR_ARCANA,
        value = "17",
        keywords = R.string.card18_star_keywords,
        fortuneTelling = R.string.card18_star_fortune_telling,
        meaning_up = R.string.card18_star_meaning,
        meaning_rev = "Denying unpleasant truths, Denying personal accountability and saying, \"Things just happen!\", Ignoring signs and omens, Preferring illusion to reality, Spreading pessimism and stinginess of spirit",
        qta = R.string.card18_star_qta,
        description = R.string.card18_star_description,
        picture = R.drawable.m17_star
    )

    val card19TheMoon = Card(
        id = 19,
        name = R.string.card19_moon_name,
        suit = SuitEnum.MAJOR_ARCANA,
        value = "18",
        keywords = R.string.card19_moon_keywords,
        fortuneTelling = R.string.card19_moon_fortune_telling,
        meaning_up = R.string.card19_moon_meaning,
        meaning_rev = "Becoming unable to separate fantasy from reality, Suffering from delusions, Losing your appreciation for the fantastic or magical, Adopting a ruthlessly logical mindset, Failing to appreciate life's mysteries",
        qta = R.string.card19_moon_qta,
        description = R.string.card19_moon_description,
        picture = R.drawable.m18_moon
    )

    val card20TheSun = Card(
        id = 20,
        name = R.string.card20_sun_name,
        suit = SuitEnum.MAJOR_ARCANA,
        value = "19",
        keywords = R.string.card20_sun_keywords,
        fortuneTelling = R.string.card20_sun_fortune_telling,
        meaning_up = R.string.card20_sun_meaning,
        meaning_rev = "Being dazzled by your own accomplishments, Becoming absorbed in your own self-image, Feeling rushed and distracted, Exerting yourself to the point of exhaustion, Overstating your abilities or misrepresenting your achievements",
        qta = R.string.card20_sun_qta,
        description = R.string.card20_sun_description,
        picture = R.drawable.m19_sun
    )

    val card21Judgement = Card(
        id = 21,
        name = R.string.card21_judgement_name,
        suit = SuitEnum.MAJOR_ARCANA,
        value = "20",
        keywords = R.string.card21_judgement_keywords,
        fortuneTelling = R.string.card21_judgement_fortune_telling,
        meaning_up = R.string.card21_judgement_meaning,
        meaning_rev = "Being weighed in the balances and found wanting, Failing to measure up to a well-defined standard, Being caught goofing off or misbehaving, Failing to prepare for an examination you know is coming, Rejecting an opportunity to reinvent yourself",
        qta = R.string.card21_judgement_qta,
        description = R.string.card21_judgement_description,
        picture = R.drawable.m20_judgement
    )

    val card22TheWorld = Card(
        id = 22,
        name = R.string.card22_world_name,
        suit = SuitEnum.MAJOR_ARCANA,
        value = "21",
        keywords = R.string.card22_world_keywords,
        fortuneTelling = R.string.card22_world_fortune_telling,
        meaning_up = R.string.card22_world_meaning,
        meaning_rev = "Allowing greed and envy to prevent you from enjoying what you do possess, Failing to see the larger design in ordinary events, Believing that everything that exists can be touched, counted, or measured, Failing to see the divine reflected in those around you",
        qta = R.string.card22_world_qta,
        description = R.string.card22_world_description,
        picture = R.drawable.m21_world
    )


    // The Cups
    val card23Cups01 = Card(
        id = 23,
        name = R.string.card23_cups_ace_name,
        suit = SuitEnum.CUPS,
        value = "1",
        keywords = R.string.card23_cups_ace_keywords,
        fortuneTelling = R.string.card23_cups_ace_fortune_telling,
        meaning_up = R.string.card23_cups_ace_meaning,
        meaning_rev = "Hiding your feelings, Spurning an opportunity to love or be loved, Numbing yourself to spiritual yearnings, Rejecting the counsel of your heart, Becoming a puppet of your own emotions, Indulging in hysteria or obsession",
        qta = R.string.card23_cups_ace_qta,
        description = R.string.card23_cups_ace_description,
        picture = R.drawable.c01
    )

    val card24Cups02 = Card(
        id = 24,
        name = R.string.card24_cups_two_name,
        suit = SuitEnum.CUPS,
        value = "2",
        keywords = R.string.card24_cups_two_keywords,
        fortuneTelling = R.string.card24_cups_two_fortune_telling,
        meaning_up = R.string.card24_cups_two_meaning,
        meaning_rev = "Burning bridges, Becoming caught up in unhealthy codependency, Shutting out anyone but your chosen few, Obsessing on someone who does not return your affections, Despairing over finding \"The One\", Deceiving yourself about your true orientation",
        qta = R.string.card24_cups_two_qta,
        description = R.string.card24_cups_two_description,
        picture = R.drawable.c02
    )

    val card25Cups03 = Card(
        id = 25,
        name = R.string.card25_cups_three_name,
        suit = SuitEnum.CUPS,
        value = "3",
        keywords = R.string.card25_cups_three_keywords,
        fortuneTelling = R.string.card25_cups_three_fortune_telling,
        meaning_up = R.string.card25_cups_three_meaning,
        meaning_rev = "Mistaking giddiness for true affection, Being dominated by manic emotions, Expecting everyone to always feel the same way you do, Demanding unreasonable support from friends or family, Partying to a dangerous or unhealthy extent",
        qta = R.string.card25_cups_three_qta,
        description = R.string.card25_cups_three_description,
        picture = R.drawable.c03
    )

    val card26Cups04 = Card(
        id = 26,
        name = R.string.card26_cups_four_name,
        suit = SuitEnum.CUPS,
        value = "4",
        keywords = R.string.card26_cups_four_keywords,
        fortuneTelling = R.string.card26_cups_four_fortune_telling,
        meaning_up = R.string.card26_cups_four_meaning,
        meaning_rev = "Being bored, Daydreaming at the expense of your work, Refusing to be engaged by opportunity, Taking people and relationships for granted, Ignoring romantic or spiritual opportunities, Spurning inspiration, Feeling everything should stay \"just like it is\"",
        qta = R.string.card26_cups_four_qta,
        description = R.string.card26_cups_four_description,
        picture = R.drawable.c04
    )

    val card27Cups05 = Card(
        id = 27,
        name = R.string.card27_cups_five_name,
        suit = SuitEnum.CUPS,
        value = "5",
        keywords = R.string.card27_cups_five_keywords,
        fortuneTelling = R.string.card27_cups_five_fortune_telling,
        meaning_up = R.string.card27_cups_five_meaning,
        meaning_rev = "Wallowing in unhealthy grief or self-pity, Refusing to move on and let go, Clinging to the past, Obsessing on past lives and past loves, Failing to live in the present, Beating yourself up over past mistakes, Allowing fear of failure to limit your efforts",
        qta = R.string.card27_cups_five_qta,
        description = R.string.card27_cups_five_description,
        picture = R.drawable.c05
    )

    val card28Cups06 = Card(
        id = 28,
        name = R.string.card28_cups_six_name,
        suit = SuitEnum.CUPS,
        value = "6",
        keywords = R.string.card28_cups_six_keywords,
        fortuneTelling = R.string.card28_cups_six_fortune_telling,
        meaning_up = R.string.card28_cups_six_meaning,
        meaning_rev = "Linking your sense of self-worth to the appraisals of others, Striving to appear more needy than you really are, Taking undeserved or unmerited charity, Bragging about your charitable efforts, Profiteering in times of distress, Refusing to share a burden",
        qta = R.string.card28_cups_six_qta,
        description = R.string.card28_cups_six_description,
        picture = R.drawable.c06
    )

    val card29Cups07 = Card(
        id = 29,
        name = R.string.card29_cups_seven_name,
        suit = SuitEnum.CUPS,
        value = "7",
        keywords = R.string.card29_cups_seven_keywords,
        fortuneTelling = R.string.card29_cups_seven_fortune_telling,
        meaning_up = R.string.card29_cups_seven_meaning,
        meaning_rev = "Obsessing on imaginary fears or uncertain consequences, Giving in to emotional or political terrorism, Spending more time dreaming than working, Failing to envision the possible repercussions of your choices, Being controlled by fear",
        qta = R.string.card29_cups_seven_qta,
        description = R.string.card29_cups_seven_description,
        picture = R.drawable.c07
    )

    val card30Cups08 = Card(
        id = 30,
        name = R.string.card30_cups_eight_name,
        suit = SuitEnum.CUPS,
        value = "8",
        keywords = R.string.card30_cups_eight_keywords,
        fortuneTelling = R.string.card30_cups_eight_fortune_telling,
        meaning_up = R.string.card30_cups_eight_meaning,
        meaning_rev = "Being implacable, Finding fault, Nitpicking, Refusing to settle down, Running away from problems or confrontations, Saying, \"It's my way or the highway!\", Harping on past mistakes and disappointments, Threatening to quit as a strategy to get your way",
        qta = R.string.card30_cups_eight_qta,
        description = R.string.card30_cups_eight_description,
        picture = R.drawable.c08
    )

    val card31Cups09 = Card(
        id = 31,
        name = R.string.card31_cups_nine_name,
        suit = SuitEnum.CUPS,
        value = "9",
        keywords = R.string.card31_cups_nine_keywords,
        fortuneTelling = R.string.card31_cups_nine_fortune_telling,
        meaning_up = R.string.card31_cups_nine_meaning,
        meaning_rev = "Being smug, Satisfying yourself at the expense of others, Being selfish, Over-indulging, Avoiding work that needs to be done, Claiming achievements or skills you do not possess, Never being satisfied, no matter how much you have",
        qta = R.string.card31_cups_nine_qta,
        description = R.string.card31_cups_nine_description,
        picture = R.drawable.c09
    )

    val card32Cups10 = Card(
        id = 32,
        name = R.string.card32_cups_ten_name,
        suit = SuitEnum.CUPS,
        value = "10",
        keywords = R.string.card32_cups_ten_keywords,
        fortuneTelling = R.string.card32_cups_ten_fortune_telling,
        meaning_up = R.string.card32_cups_ten_meaning,
        meaning_rev = "Comparing your achievements or relationships to unrealistic fantasy standards, Experiencing emotions so intense they blunt your ability to cope with reality, Feeling overwhelmed, Envying the achievements and happiness of others",
        qta = R.string.card32_cups_ten_qta,
        description = R.string.card32_cups_ten_description,
        picture = R.drawable.c10
    )

    val card33CupsPage = Card(
        id = 33,
        name = R.string.card33_cups_page_name,
        suit = SuitEnum.CUPS,
        value = "11",
        keywords = R.string.card33_cups_page_keywords,
        fortuneTelling = R.string.card33_cups_page_fortune_telling,
        meaning_up = R.string.card33_cups_page_meaning,
        meaning_rev = "Mistaking a crush for true love, Reading romantic intention into innocent action, Frantically trying to impress others, Indulging in overly-sweet sentimentality, Pretending to more romantic or spiritual experience than you possess",
        qta = R.string.card33_cups_page_qta,
        description = R.string.card33_cups_page_description,
        picture = R.drawable.c11
    )

    val card34CupsKnight = Card(
        id = 34,
        name = R.string.card34_cups_knight_name,
        suit = SuitEnum.CUPS,
        value = "12",
        keywords = R.string.card34_cups_knight_keywords,
        fortuneTelling = R.string.card34_cups_knight_fortune_telling,
        meaning_up = R.string.card34_cups_knight_meaning,
        meaning_rev = "Becoming a fanatic, Rejecting information that suggests your intuitions are misguided, Allowing your emotions to control you, Giving in to jealousy, confrontation, and peer pressure, Hiding or ignoring intuitive insights",
        qta = R.string.card34_cups_knight_qta,
        description = R.string.card34_cups_knight_description,
        picture = R.drawable.c12
    )

    val card35CupsQueen = Card(
        id = 35,
        name = R.string.card35_cups_queen_name,
        suit = SuitEnum.CUPS,
        value = "13",
        keywords = R.string.card35_cups_queen_keywords,
        fortuneTelling = R.string.card35_cups_queen_fortune_telling,
        meaning_up = R.string.card35_cups_queen_meaning,
        meaning_rev = "Becoming so caught up in matters of Spirit, you become detached from the world, Allowing empathy to disable you (instead of inspire action), Using psychic abilities to wield covert influence, Wallowing in emotionalism, sentiment, or self-pity",
        qta = R.string.card35_cups_queen_qta,
        description = R.string.card35_cups_queen_description,
        picture = R.drawable.c13
    )

    val card36CupsKing = Card(
        id = 36,
        name = R.string.card36_cups_king_name,
        suit = SuitEnum.CUPS,
        value = "14",
        keywords = R.string.card36_cups_king_keywords,
        fortuneTelling = R.string.card36_cups_king_fortune_telling,
        meaning_up = R.string.card36_cups_king_meaning,
        meaning_rev = "Allowing yourself to become rigid and unemotional, Making unfair decisions based on a hidden agenda, Making decisions without regard for their emotional impact on others, Abusing spiritual authority, Using emotional or spiritual leverage to exercise unhealthy control over others",
        qta = R.string.card36_cups_king_qta,
        description = R.string.card36_cups_king_description,
        picture = R.drawable.c14
    )


    // The Swords
    val card37Swords01 = Card(
        id = 37,
        name = R.string.card37_swords_ace_name,
        suit = SuitEnum.SWORDS,
        value = "1",
        keywords = R.string.card37_swords_ace_keywords,
        fortuneTelling = R.string.card37_swords_ace_fortune_telling,
        meaning_up = R.string.card37_swords_ace_meaning,
        meaning_rev = "Applying ruthless or twisted logic, Gloating over your own superior intellect, Using quick thinking to deceive or confuse others, Confusing snap judgments with quick thinking, Making decisions without thinking through consequences",
        qta = R.string.card37_swords_ace_qta,
        description = R.string.card37_swords_ace_description,
        picture = R.drawable.s01
    )

    val card38Swords02 = Card(
        id = 38,
        name = R.string.card38_swords_two_name,
        suit = SuitEnum.SWORDS,
        value = "2",
        keywords = R.string.card38_swords_two_keywords,
        fortuneTelling = R.string.card38_swords_two_fortune_telling,
        meaning_up = R.string.card38_swords_two_meaning,
        meaning_rev = "Rejecting evidence that conflicts with dearly-held beliefs, Arguing with others just for the sake of doing so, Nit-picking, Putting off a decision because you're afraid to face the consequences, Preventing others from getting the information they need to make good decisions",
        qta = R.string.card38_swords_two_qta,
        description = R.string.card38_swords_two_description,
        picture = R.drawable.s02
    )

    val card39Swords03 = Card(
        id = 39,
        name = R.string.card39_swords_three_name,
        suit = SuitEnum.SWORDS,
        value = "3",
        keywords = R.string.card39_swords_three_keywords,
        fortuneTelling = R.string.card39_swords_three_fortune_telling,
        meaning_up = R.string.card39_swords_three_meaning,
        meaning_rev = "Wallowing in despair, Allowing yourself to be completely crushed by the thoughts, words, or deeds of another, Judging yourself too harshly, Holding yourself to an unrealistic standard of excellence, Wearing your heart on your sleeve while carrying a chip on your shoulder",
        qta = R.string.card39_swords_three_qta,
        description = R.string.card39_swords_three_description,
        picture = R.drawable.s03
    )

    val card40Swords04 = Card(
        id = 40,
        name = R.string.card40_swords_four_name,
        suit = SuitEnum.SWORDS,
        value = "4",
        keywords = R.string.card40_swords_four_keywords,
        fortuneTelling = R.string.card40_swords_four_fortune_telling,
        meaning_up = R.string.card40_swords_four_meaning,
        meaning_rev = "Failing to think things through, Mistaking procrastination for thoughtfulness, Adopting a point of view and refusing to reconsider your conclusions, even when presented with refuting evidence, Allowing chaos and whimsy to dominate your thoughts",
        qta = R.string.card40_swords_four_qta,
        description = R.string.card40_swords_four_description,
        picture = R.drawable.s04
    )

    val card41Swords05 = Card(
        id = 41,
        name = R.string.card41_swords_five_name,
        suit = SuitEnum.SWORDS,
        value = "5",
        keywords = R.string.card41_swords_five_keywords,
        fortuneTelling = R.string.card41_swords_five_fortune_telling,
        meaning_up = R.string.card41_swords_five_meaning,
        meaning_rev = "Taking advantage of others, Intimidating others, Acting in an unethical manner, Picking fights, Using words to goad others into violence and irrationality, Ignoring rules you've agreed to abide by, Looking out for yourself while allowing harm to come to others, Gloating over victory",
        qta = R.string.card41_swords_five_qta,
        description = R.string.card41_swords_five_description,
        picture = R.drawable.s05
    )

    val card42Swords06 = Card(
        id = 42,
        name = R.string.card42_swords_six_name,
        suit = SuitEnum.SWORDS,
        value = "6",
        keywords = R.string.card42_swords_six_keywords,
        fortuneTelling = R.string.card42_swords_six_fortune_telling,
        meaning_up = R.string.card42_swords_six_meaning,
        meaning_rev = "Refusing to accept that things have changed, Playing the victim, Rejecting the idea that your actions have consequences, Applying scientific criteria to matters of faith, or confusing faith with science, Believing the whole world should be like your small corner of it",
        qta =R.string.card42_swords_six_qta,
        description = R.string.card42_swords_six_description,
        picture = R.drawable.s06
    )

    val card43Swords07 = Card(
        id = 43,
        name = R.string.card43_swords_seven_name,
        suit = SuitEnum.SWORDS,
        value = "7",
        keywords = R.string.card43_swords_seven_keywords,
        fortuneTelling = R.string.card43_swords_seven_fortune_telling,
        meaning_up = R.string.card43_swords_seven_meaning,
        meaning_rev = "Stealing or lying, Doing whatever you can get away with, simply because you can, Looking for a way around consequences, Justifying wicked behavior by focusing on the wickedness of others, Failing to examine your own motives and prejudices",
        qta = R.string.card43_swords_seven_qta,
        description = R.string.card43_swords_seven_description,
        picture = R.drawable.s07
    )

    val card44Sowrds08 = Card(
        id = 44,
        name = R.string.card44_swords_eight_name,
        suit = SuitEnum.SWORDS,
        value = "8",
        keywords = R.string.card44_swords_eight_keywords,
        fortuneTelling = R.string.card44_swords_eight_fortune_telling,
        meaning_up = R.string.card44_swords_eight_meaning,
        meaning_rev = "Feeling trapped, Being lost in a maze of rules and regulations, Giving in to despair, Playing the victim, Allowing others to dictate what you can and cannot do, Being rendered helpless, Having very few options, Failing to look for a way out",
        qta = R.string.card44_swords_eight_qta,
        description = R.string.card44_swords_eight_description,
        picture = R.drawable.s08
    )

    val card45Swords09 = Card(
        id = 45,
        name = R.string.card45_swords_nine_name,
        suit = SuitEnum.SWORDS,
        value = "9",
        keywords = R.string.card45_swords_nine_keywords,
        fortuneTelling = R.string.card45_swords_nine_fortune_telling,
        meaning_up = R.string.card45_swords_nine_meaning,
        meaning_rev = "Torturing yourself with regrets, Second-guessing your every move, Beating yourself up for your mistakes, Depression, Obsessing on errors and overlooked details, Refusing to handle stress in healthy ways, Ruining your ability to appreciate the present by dwelling on the past, Debating irreversible decisions",
        qta = R.string.card45_swords_nine_qta,
        description = R.string.card45_swords_nine_description,
        picture = R.drawable.s09
    )

    val card46Swords10 = Card(
        id = 46,
        name = R.string.card46_swords_ten_name,
        suit = SuitEnum.SWORDS,
        value = "10",
        keywords = R.string.card46_swords_ten_keywords,
        fortuneTelling = R.string.card46_swords_ten_fortune_telling,
        meaning_up = R.string.card46_swords_ten_meaning,
        meaning_rev = "Accepting defeat prematurely, Driving yourself to total exhaustion, especially mentally, Experiencing a mental breakdown, Obsessing on a problem to the breaking point, Giving up, Refusing to move from thought to action, Deeply unhealthy thoughts",
        qta = R.string.card46_swords_ten_qta,
        description = R.string.card46_swords_ten_description,
        picture = R.drawable.s10
    )

    val card47SwordsPage = Card(
        id = 47,
        name = R.string.card47_swords_page_name,
        suit = SuitEnum.SWORDS,
        value = "11",
        keywords = R.string.card47_swords_page_keywords,
        fortuneTelling = R.string.card47_swords_page_fortune_telling,
        meaning_up =R.string.card47_swords_page_meaning,
        meaning_rev = "Pretending to knowledge or sophistication you do not possess, Cheating on an exam, Feigning interest as a way of gaining favor, Considering only the evidence that supports conclusions you've already drawn, Rejecting the wise counsel of experienced teachers",
        qta = R.string.card47_swords_page_qta,
        description = R.string.card47_swords_page_description,
        picture = R.drawable.s11
    )

    val card48SwordsKnight = Card(
        id = 48,
        name = R.string.card48_swords_knight_name,
        suit = SuitEnum.SWORDS,
        value = "12",
        keywords = R.string.card48_swords_knight_keywords,
        fortuneTelling = R.string.card48_swords_knight_fortune_telling,
        meaning_up = R.string.card48_swords_knight_meaning,
        meaning_rev = "Stating your opinions as fact, Picking fights, Starting arguments, Using clever insults to undermine the confidence of others, Tossing reason out the window, Speaking without taking the feelings of others into account, Going on a witch hunt, Distorting evidence",
        qta = R.string.card48_swords_knight_qta,
        description = R.string.card48_swords_knight_description,
        picture = R.drawable.s12
    )

    val card49SwordsQueen = Card(
        id = 49,
        name = R.string.card49_swords_queen_name,
        suit = SuitEnum.SWORDS,
        value = "13",
        keywords = R.string.card49_swords_queen_keywords,
        fortuneTelling = R.string.card49_swords_queen_fortune_telling,
        meaning_up = R.string.card49_swords_queen_meaning,
        meaning_rev = "Knowing exactly what to say to destroy another person, Withholding critical information, Using a barbed tongue to upset others, Employing sarcasm, Mimicking others unkindly, Making light of the less fortunate, Being disrespectful, Failing to use the talent you've been given",
        qta = R.string.card49_swords_queen_qta,
        description = R.string.card49_swords_queen_description,
        picture = R.drawable.s13
    )

    val card50SwordsKing = Card(
        id = 50,
        name = R.string.card50_swords_king_name,
        suit = SuitEnum.SWORDS,
        value = "14",
        keywords = R.string.card50_swords_king_keywords,
        fortuneTelling = R.string.card50_swords_king_fortune_telling,
        meaning_up = R.string.card50_swords_king_meaning,
        meaning_rev = "Insisting on having the last word, Flaunting your intellectual capability, Talking \"over the heads\" of others, Waffling on an important decision, Constantly changing your mind, Refusing to make choices that are in your own best interest, Wishing in vain you could take back what's been said",
        qta = R.string.card50_swords_king_qta,
        description = R.string.card50_swords_king_description,
        picture = R.drawable.s14
    )


    // The Wands
    val card51Wands01 = Card(
        id = 51,
        name = R.string.card51_wands_ace_name,
        suit = SuitEnum.WANDS,
        value = "1",
        keywords = R.string.card51_wands_ace_keywords,
        fortuneTelling = R.string.card51_wands_ace_fortune_telling,
        meaning_up = R.string.card51_wands_ace_meaning,
        meaning_rev = "Failing to take advantage of a great opportunity, Being ineffectual or lazy, Making an inadequate effort, Working toward a goal, but lacking the resources or initiative to achieve success, Setting inappropriate goals, Failing to take a stand",
        qta = R.string.card51_wands_ace_qta,
        description = R.string.card51_wands_ace_description,
        picture = R.drawable.w01
    )

    val card52Wands02 = Card(
        id = 52,
        name = R.string.card52_wands_two_name,
        suit = SuitEnum.WANDS,
        value = "2",
        keywords = R.string.card52_wands_two_keywords,
        fortuneTelling = R.string.card52_wands_two_fortune_telling,
        meaning_up = R.string.card52_wands_two_meaning,
        meaning_rev = "Misrepresenting your intentions, Doing one thing while desiring another, Changing course mid-stream for no good reason, Refusing to change your goal even when pursuing it no longer makes sense, Disregarding the input of others",
        qta = R.string.card52_wands_two_qta,
        description = R.string.card52_wands_two_description,
        picture = R.drawable.w02
    )

    val card53Wands03 = Card(
        id = 53,
        name = R.string.card53_wands_three_name,
        suit = SuitEnum.WANDS,
        value = "3",
        keywords = R.string.card53_wands_three_keywords,
        fortuneTelling = R.string.card53_wands_three_fortune_telling,
        meaning_up = R.string.card53_wands_three_meaning,
        meaning_rev = "Procrastinating, Knowing what to do, but refusing to do it, Launching a project without a clear definition of who should do what, Rejecting an opportunity to try something new, Failing to finish what you start",
        qta = R.string.card53_wands_three_qta,
        description = R.string.card53_wands_three_description,
        picture = R.drawable.w03
    )

    val card54Wands04 = Card(
        id = 54,
        name = R.string.card54_wands_four_name,
        suit = SuitEnum.WANDS,
        value = "4",
        keywords = R.string.card54_wands_four_keywords,
        fortuneTelling = R.string.card54_wands_four_fortune_telling,
        meaning_up = R.string.card54_wands_four_meaning,
        meaning_rev = "Keeping your nose to the grindstone, Recognizing good work by demanding more work, Failing to share in a group celebration, Allowing sour grapes to poison your moment in the sun, Refusing to do your part",
        qta = R.string.card54_wands_four_qta,
        description = R.string.card54_wands_four_description,
        picture = R.drawable.w04
    )

    val card55Wands05 = Card(
        id = 55,
        name = R.string.card55_wands_five_name,
        suit = SuitEnum.WANDS,
        value = "5",
        keywords = R.string.card55_wands_five_keywords,
        fortuneTelling = R.string.card55_wands_five_fortune_telling,
        meaning_up = R.string.card55_wands_five_meaning,
        meaning_rev = "Berating others for their ridiculous opinions, Picking fights, Offering destructive criticism, Baiting people with barbed remarks, Disrupting progress with an endless stream of pointless objections",
        qta = R.string.card55_wands_five_qta,
        description = R.string.card55_wands_five_description,
        picture = R.drawable.w05
    )

    val card56Wands06 = Card(
        id = 56,
        name = R.string.card56_wands_six_name,
        suit = SuitEnum.WANDS,
        value = "6",
        keywords = R.string.card56_wands_six_keywords,
        fortuneTelling = R.string.card56_wands_six_fortune_telling,
        meaning_up = R.string.card56_wands_six_meaning,
        meaning_rev = "Being a bad winner, Allowing your achievements to inflate your ego, Looking down on people who seem less capable, Craving to be the center of attention, Giving or receiving insincere praise, Envying the achievements of others",
        qta = R.string.card56_wands_six_qta,
        description = R.string.card56_wands_six_description,
        picture = R.drawable.w06
    )

    val card57Wands07 = Card(
        id = 57,
        name = R.string.card57_wands_seven_name,
        suit = SuitEnum.WANDS,
        value = "7",
        keywords = R.string.card57_wands_seven_keywords,
        fortuneTelling = R.string.card57_wands_seven_fortune_telling,
        meaning_up = R.string.card57_wands_seven_meaning,
        meaning_rev = "Having a chip on your shoulder, Taking unnecessary risks as a means of proving your fearlessness, Looking for an opportunity to take offense, Responding to constructive criticism with defensiveness, Refusing to stand up for yourself and your beliefs",
        qta = R.string.card57_wands_seven_qta,
        description = R.string.card57_wands_seven_description,
        picture = R.drawable.w07
    )

    val card58Wands08 = Card(
        id = 58,
        name = R.string.card58_wands_eight_name,
        suit = SuitEnum.WANDS,
        value = "8",
        keywords = R.string.card58_wands_eight_keywords,
        fortuneTelling = R.string.card58_wands_eight_fortune_telling,
        meaning_up = R.string.card58_wands_eight_meaning,
        meaning_rev = "Giving in to panic, Running in circles and screaming, Insisting things must always stay the same, Stirring the pot just to see what will happen, Rushing others, Refusing to re-evaluate a schedule or program, even when it's clearly no longer appropriate",
        qta = R.string.card58_wands_eight_qta,
        description = R.string.card58_wands_eight_description,
        picture = R.drawable.w08
    )

    val card59Wands09 = Card(
        id = 59,
        name = R.string.card59_wands_nine_name,
        suit = SuitEnum.WANDS,
        value = "9",
        keywords = R.string.card59_wands_nine_keywords,
        fortuneTelling = R.string.card59_wands_nine_fortune_telling,
        meaning_up = R.string.card59_wands_nine_meaning,
        meaning_rev = "Making yourself a martyr, Abandoning your post, Giving up at the first sign of opposition, Being prevented from fulfilling an obligation, Failing to be dependable, Refusing to let something go that needs to be released, Beating a dead horse",
        qta = R.string.card59_wands_nine_qta,
        description = R.string.card59_wands_nine_description,
        picture = R.drawable.w09
    )

    val card60Wands10 = Card(
        id = 60,
        name = R.string.card60_wands_ten_name,
        suit = SuitEnum.WANDS,
        value = "10",
        keywords = R.string.card60_wands_ten_keywords,
        fortuneTelling = R.string.card60_wands_ten_fortune_telling,
        meaning_up = R.string.card60_wands_ten_meaning,
        meaning_rev = "Taking on more work than you know you can handle, Refusing to say \"No\" when you're already overloaded, Making a habit of working overtime, Shielding others from facing the consequences of their own poor judgment, Over-extending yourself on a regular basis",
        qta = R.string.card60_wands_ten_qta,
        description = R.string.card60_wands_ten_description,
        picture = R.drawable.w10
    )

    val card61WandsPage = Card(
        id = 61,
        name = R.string.card61_wands_page_name,
        suit = SuitEnum.WANDS,
        value = "11",
        keywords = R.string.card61_wands_page_keywords,
        fortuneTelling = R.string.card61_wands_page_fortune_telling,
        meaning_up = R.string.card61_wands_page_meaning,
        meaning_rev = "Basing your entire self-image on what others think, Seizing every new idea that comes your way without question, Habitually discounting input or feedback from others, Being so eager to \"do it yourself\" that you hinder your own progress",
        qta = R.string.card61_wands_page_qta,
        description = R.string.card61_wands_page_description,
        picture = R.drawable.w11
    )

    val card62WandsKnight = Card(
        id = 62,
        name = R.string.card62_wands_knight_name,
        suit = SuitEnum.WANDS,
        value = "12",
        keywords = R.string.card62_wands_knight_keywords,
        fortuneTelling = R.string.card62_wands_knight_fortune_telling,
        meaning_up = R.string.card62_wands_knight_meaning,
        meaning_rev = "Blundering forward with inadequate skill or information, Running roughshod over the feelings of others, Using sex appeal to manipulate others, Forcing your leadership or ideology on others, Beginning many projects without finishing any",
        qta = R.string.card62_wands_knight_qta,
        description = R.string.card62_wands_knight_description,
        picture = R.drawable.w12
    )

    val card63WandsQueen = Card(
        id = 63,
        name = R.string.card63_wands_queen_name,
        suit = SuitEnum.WANDS,
        value = "13",
        keywords = R.string.card63_wands_queen_keywords,
        fortuneTelling = R.string.card63_wands_queen_fortune_telling,
        meaning_up = R.string.card63_wands_queen_meaning,
        meaning_rev = "Being distracted, or using your charms or skills to distract others from the goal, Calling attention to yourself with negative or unhealthy behaviors, Disrupting group activities as a means of feeding your own ego",
        qta = R.string.card63_wands_queen_qta,
        description = R.string.card63_wands_queen_description,
        picture = R.drawable.w13
    )

    val card64WandsKing = Card(
        id = 64,
        name = R.string.card64_wands_king_name,
        suit = SuitEnum.WANDS,
        value = "14",
        keywords = R.string.card64_wands_king_keywords,
        fortuneTelling = R.string.card64_wands_king_fortune_telling,
        meaning_up = R.string.card64_wands_king_meaning,
        meaning_rev = "Using your creativity to get out of honest work, Investing great energy in avoiding responsibility, Boasting about achievements without putting your expertise to practical use, Lording it over others",
        qta = R.string.card64_wands_king_qta,
        description = R.string.card64_wands_king_description,
        picture = R.drawable.w14
    )

    val card65Coins01 = Card(
        id = 65,
        name = R.string.card65_coins_ace_name,
        suit = SuitEnum.COINS,
        value = "1",
        keywords = R.string.card65_coins_ace_keywords,
        fortuneTelling = R.string.card65_coins_ace_fortune_telling,
        meaning_up = R.string.card65_coins_ace_meaning,
        meaning_rev = "Indulging in relentless consumerism, Wanting more, no matter how much you have, Obsessing on your account balance, Suffering from hypochondria, Consuming blessings without expressing gratitude, Taking what you want without concern for the needs of others",
        qta = R.string.card65_coins_ace_qta,
        description = R.string.card65_coins_ace_description,
        picture = R.drawable.p01
    )

    val card66Coins02 = Card(
        id = 66,
        name = R.string.card66_coins_two_name,
        suit = SuitEnum.COINS,
        value = "2",
        keywords = R.string.card66_coins_two_keywords,
        fortuneTelling = R.string.card66_coins_two_fortune_telling,
        meaning_up = R.string.card66_coins_two_meaning,
        meaning_rev = "Engaging in endless price comparison, Putting off a buying decision for fear of finding a slightly better value later on, Buying something without regard for value, Breaking your budget with unnecessary expenses, Engaging in behavior with no regard for how your body or bankbook will be impacted",
        qta = R.string.card66_coins_two_qta,
        description = R.string.card66_coins_two_description,
        picture = R.drawable.p02
    )

    val card67Coins03 = Card(
        id = 67,
        name = R.string.card67_coins_three_name,
        suit = SuitEnum.COINS,
        value = "3",
        keywords = R.string.card67_coins_three_keywords,
        fortuneTelling = R.string.card67_coins_three_fortune_telling,
        meaning_up = R.string.card67_coins_three_meaning,
        meaning_rev = "Pandering to the tastes of others, Failing to deliver what you've promised, Not delivering your best work unless closely supervised, Ignoring or breaking agreements with those who have invested in you, Refusing to do your part, Failing to abide by a clearly-outlined agreement with yourself or others",
        qta = R.string.card67_coins_three_qta,
        description = R.string.card67_coins_three_description,
        picture = R.drawable.p03
    )

    val card68Coins04 = Card(
        id = 68,
        name = R.string.card68_coins_four_name,
        suit = SuitEnum.COINS,
        value = "4",
        keywords = R.string.card68_coins_four_keywords,
        fortuneTelling = R.string.card68_coins_four_fortune_telling,
        meaning_up = R.string.card68_coins_four_meaning,
        meaning_rev = "Being stingy, Refusing to spend money that needs to be spent, Withholding sex from your partner, Taking care of your own needs exclusively, without regard for the needs of others, Spending a dollar to save a penny, Failing to be a good manager of the blessings you've been given",
        qta = R.string.card68_coins_four_qta,
        description = R.string.card68_coins_four_description,
        picture = R.drawable.p04
    )

    val card69Coins05 = Card(
        id = 69,
        name = R.string.card69_coins_five_name,
        suit = SuitEnum.COINS,
        value = "5",
        keywords = R.string.card69_coins_five_keywords,
        fortuneTelling = R.string.card69_coins_five_fortune_telling,
        meaning_up = R.string.card69_coins_five_meaning,
        meaning_rev = "Exaggerating your financial or physical needs, Adopting a poverty mentality, Refusing to support yourself, Refusing offers of support, Playing the martyr, Turning down opportunities to improve your health or finances, Wallowing in misery",
        qta = R.string.card69_coins_five_qta,
        description = R.string.card69_coins_five_description,
        picture = R.drawable.p05
    )

    val card70Coins06 = Card(
        id = 70,
        name = R.string.card70_coins_six_name,
        suit = SuitEnum.COINS,
        value = "6",
        keywords = R.string.card70_coins_six_keywords,
        fortuneTelling = R.string.card70_coins_six_fortune_telling,
        meaning_up = R.string.card70_coins_six_meaning,
        meaning_rev = "Making a loan as a means of gaining control over someone, Using charitable acts to draw attention to yourself, Dividing work or resources unfairly, Failing to do your part in a group effort, Ignoring obligations and commitments",
        qta = R.string.card70_coins_six_qta,
        description = R.string.card70_coins_six_description,
        picture = R.drawable.p06
    )

    val card71Coins07 = Card(
        id = 71,
        name = R.string.card71_coins_seven_name,
        suit = SuitEnum.COINS,
        value = "7",
        keywords = R.string.card71_coins_seven_keywords,
        fortuneTelling = R.string.card71_coins_seven_fortune_telling,
        meaning_up = R.string.card71_coins_seven_meaning,
        meaning_rev = "Becoming distracted by melancholy thoughts, Longing for \"the good old days\", Beating yourself up over lost opportunities, Judging your own work harshly, Holding others to inappropriate standards, Refusing to take part in a project, then whining about the quality of the outcome",
        qta = R.string.card71_coins_seven_qta,
        description = R.string.card71_coins_seven_description,
        picture = R.drawable.p07
    )

    val card72Coins08 = Card(
        id = 72,
        name = R.string.card72_coins_eight_name,
        suit = SuitEnum.COINS,
        value = "8",
        keywords = R.string.card72_coins_eight_keywords,
        fortuneTelling = R.string.card72_coins_eight_fortune_telling,
        meaning_up = R.string.card72_coins_eight_meaning,
        meaning_rev = "Working yourself to death, Doing a half-hearted or sloppy job, Continuing in a job you hate, Buying thoughtless gifts, Producing work with shoddy craftsmanship, Rushing through your work, Rejecting opportunities to learn more about your craft",
        qta = R.string.card72_coins_eight_qta,
        description = R.string.card72_coins_eight_description,
        picture = R.drawable.p08
    )

    val card73Coins09 = Card(
        id = 73,
        name = R.string.card73_coins_nine_name,
        suit = SuitEnum.COINS,
        value = "9",
        keywords = R.string.card73_coins_nine_keywords,
        fortuneTelling = R.string.card73_coins_nine_fortune_telling,
        meaning_up = R.string.card73_coins_nine_meaning,
        meaning_rev = "Being assigned to a task without being trained to perform it, Pursuing a position for which you are not qualified, Disregarding requirements, Refusing to dedicate adequate time or attention when learning about something or someone new, Always craving more",
        qta = R.string.card73_coins_nine_qta,
        description = R.string.card73_coins_nine_description,
        picture = R.drawable.p09
    )

    val card74Coins10 = Card(
        id = 74,
        name = R.string.card74_coins_ten_name,
        suit = SuitEnum.COINS,
        value = "10",
        keywords = R.string.card74_coins_ten_keywords,
        fortuneTelling = R.string.card74_coins_ten_fortune_telling,
        meaning_up = R.string.card74_coins_ten_meaning,
        meaning_rev = "Spending all of your money on extravagant gifts and possessions, Trying too hard to impress others with your wealth or physique, Giving an inappropriately expensive gift as a means of currying favor, Obsessing on matters of weight, health, or finance, Always asking, \"What's in it for me?\"",
        qta = R.string.card74_coins_ten_qta,
        description = R.string.card74_coins_ten_description,
        picture = R.drawable.p10
    )

    val card75CoinsPage = Card(
        id = 75,
        name = R.string.card75_coins_page_name,
        suit = SuitEnum.COINS,
        value = "11",
        keywords = R.string.card75_coins_page_keywords,
        fortuneTelling = R.string.card75_coins_page_fortune_telling,
        meaning_up = R.string.card75_coins_page_meaning,
        meaning_rev = "Trying to appear healthier or wealthier than you really are, Spending money carelessly, Living strictly for today, with no thought of tomorrow, Possessing immature attitudes toward sex and sexuality, Using wealth or beauty as an excuse for not having to learn and grow",
        qta = R.string.card75_coins_page_qta,
        description = R.string.card75_coins_page_description,
        picture = R.drawable.p11
    )

    val card76CoinsKnight = Card(
        id = 76,
        name = R.string.card76_coins_knight_name,
        suit = SuitEnum.COINS,
        value = "12",
        keywords = R.string.card76_coins_knight_keywords,
        fortuneTelling = R.string.card76_coins_knight_fortune_telling,
        meaning_up = R.string.card76_coins_knight_meaning,
        meaning_rev = "Throwing caution to the four winds, Spending without regard for consequence, Spending on luxury when necessities are lacking, Escaping stress by spending money, Obsessing on tiny physical or financial details, Perpetually chasing after some new bauble, Copying another's work and claiming it as your own",
        qta = R.string.card76_coins_knight_qta,
        description = R.string.card76_coins_knight_description,
        picture = R.drawable.p12
    )

    val card77CoinsQueen = Card(
        id = 77,
        name = R.string.card77_coins_queen_name,
        suit = SuitEnum.COINS,
        value = "13",
        keywords = R.string.card77_coins_queen_keywords,
        fortuneTelling = R.string.card77_coins_queen_fortune_telling,
        meaning_up = R.string.card77_coins_queen_meaning,
        meaning_rev = "Indulging in gluttony or greediness, Becoming insatiable, Blunting the impact of treats by indulging in them too often, Providing physical comfort without providing for emotional needs, Allowing a feeling of entitlement to distort your gratitude for what you're given",
        qta = R.string.card77_coins_queen_qta,
        description = R.string.card77_coins_queen_description,
        picture = R.drawable.p13
    )

    val card78CoinsKing = Card(
        id = 78,
        name = R.string.card78_coins_king_name,
        suit = SuitEnum.COINS,
        value = "14",
        keywords = R.string.card78_coins_king_keywords,
        fortuneTelling = R.string.card78_coins_king_fortune_telling,
        meaning_up = R.string.card78_coins_king_fortune_telling,
        meaning_rev = "Becoming so conservative you resist all change on principle alone, Ignoring innovations in the name of preserving tradition, Being smug or cocky, Becoming ruthlessly dedicated to profit or pleasure, Being sexually selfish, Bossing others around, especially when you're not empowered to do so",
        qta = R.string.card78_coins_king_qta,
        description = R.string.card78_coins_king_description,
        picture = R.drawable.p14
    )


    /*
        val card78 = Card(
            id = 78,
            name = "",
            suit = SuitEnum.,
            value = "1",
            keywords = "",
            fortuneTelling = "",
            meaning_up = "",
            meaning_rev = "",
            qta = "",
            description = "",
            picture = "R.drawable.p14"
        )

     */


    val cardListRaw: List<Card> = listOf(
        //Major Arcana:
        card01TheFool,
        card02TheMagician,
        card03TheHighPriestess,
        card04TheEmpress,
        card05TheEmperor,
        card06TheHierophant,
        card07TheLovers,
        card08TheChariot,
        card09TheStrength,
        card10TheHermit,
        card11WheelOfFortune,
        card12Justice,
        card13TheHangedMan,
        card14Death,
        card15Temperance,
        card16TheDevil,
        card17TheTower,
        card18TheStar,
        card19TheMoon,
        card20TheSun,
        card21Judgement,
        card22TheWorld,
        // The Cups:
        card23Cups01,
        card24Cups02,
        card25Cups03,
        card26Cups04,
        card27Cups05,
        card28Cups06,
        card29Cups07,
        card30Cups08,
        card31Cups09,
        card32Cups10,
        card33CupsPage,
        card34CupsKnight,
        card35CupsQueen,
        card36CupsKing,
        // The Swords:
        card37Swords01,
        card38Swords02,
        card39Swords03,
        card40Swords04,
        card41Swords05,
        card42Swords06,
        card43Swords07,
        card44Sowrds08,
        card45Swords09,
        card46Swords10,
        card47SwordsPage,
        card48SwordsKnight,
        card49SwordsQueen,
        card50SwordsKing,
        // The Wands
        card51Wands01,
        card52Wands02,
        card53Wands03,
        card54Wands04,
        card55Wands05,
        card56Wands06,
        card57Wands07,
        card58Wands08,
        card59Wands09,
        card60Wands10,
        card61WandsPage,
        card62WandsKnight,
        card63WandsQueen,
        card64WandsKing,
        // The Pentacles ( Coins )
        card65Coins01,
        card66Coins02,
        card67Coins03,
        card68Coins04,
        card69Coins05,
        card70Coins06,
        card71Coins07,
        card72Coins08,
        card73Coins09,
        card74Coins10,
        card75CoinsPage,
        card76CoinsKnight,
        card77CoinsQueen,
        card78CoinsKing
    )


}