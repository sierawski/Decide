#Decide
Verbose alternative to boolean parameters.

##Example
Orginal:

    rideBike(false);
    drinkTea(true);

With Decide:

    rideBike(Decide.DoNot(RideFast.class));
    drinkTea(Decide.With(Cookies.class));

## That's awesome!
Are you tired of trues and falses passed to every method? Is it problematic to check documentation for the meaning? We've got your back covered with Decide! Just declare empty enum and let Decide handle passing values to methods and conversion to booleans. With it you will no longer complain about confusing method invocation.

## Disclaimer
Although it's probably better to just use something like:

    enum RideFast{YES, NO}
