# API documentation

API address: http://138.197.88.144:8080


## Get list of disciplines:

./api/v1/discipline

## Get an individual discipline:

./api/v1/discipline/{diciplineCode}

## Get list of universities:

./api/v1/university

## Get an individual universites:

./api/v1/university/{universityCode}

## Get list of majors:

./api/v1/major

## Get an indivigual major:

./api/v1/major/{majorCode}

## Get all courses (not recommended to use)

./api/v1/course

## Get courses by pages (recommended in order to avoid overloading in the database):

./api/v1/course?page=1&size=10&sort=code // paginate the results by 10 elements each page, show result for page number 1

## Get an dividual course:

./api/v1/course/{courseID}

## Get courses grouped by discipline:

./api/v1/course/discipline/{disciplineCode}

ex: ./api/v1/course/discipline/ARTT  //get all ARTT courses

//paging:

./api/v1/course?discipline/{disciplineCode}?page=1&size=10&sort=title



## Get courses grouped by attributes:

./api/v1/course/attribute/{attribute_code}

## Get list of attributes:

./api/v1/attribute

## Get an individual attribute:

./api/v1/attribute/{attribute id}

## Get MC academic template by major

./api/v1/mctemplate/{majorCode}

## Get transfer template

./api/v1/trans_template?major={majorCode}&school={schoolCode}