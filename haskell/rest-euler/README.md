# rest-euler

A project for solving different programming problems in Haskell. 

## Usage

The project is set up using GHCi and Cabal (Haskell plattform). The REST service is using the Scotty web-lib. 
From the root-directory ./rest-euler you can run <code>cabal install</code>, which compiles the code and generates the executable file. <code>dist\build\rest-euler.exe</code>, starts the web-server at configured port 3000.
Then it is possible to run the solutions using the following REST-url-pattern
<code>localhost:3000/uc/{problem-number}</code>.

## License

Copyright © 2015 tedhag

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
