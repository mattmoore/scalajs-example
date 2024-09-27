# ScalaJS with npm packages

This is a simple ScalaJS project demonstrating how to:

- Write a JavaScript file and call it from ScalaJS.
- Import an npm module and call it from ScalaJS, using [scalajs-bundler](https://github.com/scalacenter/scalajs-bundler).

## Running the example

Clone the project and `cd` into the directory. Then run:

```shell
sbt app/run
```

```text
Hello, Matt!
35629875-4673-4c27-ae7e-a14d6d3a879e
```

## Bundling the program as a deployable webpack for nodejs

```shell
sbt app/fastOptJS::webpack
```

This will generate a webpack under `app/target/scala-3.5.1/scalajs-bundler/main/scalajs-example-fastopt.js`. You can run it with node js:

```shell
node app/target/scala-3.5.1/scalajs-bundler/main/scalajs-example-fastopt.js
```

```text
Hello, Matt!
35629875-4673-4c27-ae7e-a14d6d3a879e
```

> [!TIP]
> You can also generate a fully optimized variant, which is probably best for production builds, but note that it will take longer to build:

```shell
sbt app/fullOptJS::webpack
```

This will generate a webpack under `app/target/scala-3.5.1/scalajs-bundler/main/scalajs-example-opt.js`. You can run it with node js:

```shell
node app/target/scala-3.5.1/scalajs-bundler/main/scalajs-example-opt.js
```

```text
Hello, Matt!
35629875-4673-4c27-ae7e-a14d6d3a879e
```
