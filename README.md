# Logger -  Android Logger Framework
Logger is a simple logging library for Android which allows you to send log to anywhere for instance like logcat, file, crashlytics or server.

## Features
 * Logging
 * Easy customization
 * File logging by default implemented.


## Usage

### Initialization
Use below function to initialize the logger and `LoggerBuilder` to customize the logger.<p>
`fun initialize(
        context: Context,
        builder: LoggerBuilder,
        handler: Thread.UncaughtExceptionHandler?
    )`

###  Logger Builder

This class should be used for customizing the logger.<p>
Currently, Logger support filtering based on Tags, priority
Customization Properties:
##### Tags:
Multiple tags can be provided and logger will print only those tags. <br>If not set all logs will be printed.
##### Priorities:
Multiple priorities can be provided and logger will print only those priorities. <br>If not set all logs will be printed.<br>
###### Priority range
    WTF = 7
    DEBUG = 3 
    ERROR = 6
    INFO = 4
    VERBOSE = 2
    WARN = 5
##### File Logging:
Boolean to enable/disable file logging. By default, file logging is enabled.


### Example
* Message: ` Logger.d("Logger")`
* With Tag and Message: ` Logger.d("TAG","Logger")`
* With Tag and Exception: ` Logger.d("TAG","Logger", Exception("Sample"))`
* Exception: Logger.d(Exception("Sample"))



## Dependencies
[Timber](https://github.com/JakeWharton/timber) : com.jakewharton.timber:timber:4.7.1







