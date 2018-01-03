## API documentation

API address: http://138.197.88.144:8080


#Get list of discipline:

./api/v1/discipline

#Get an individual discipline:

./api/v1/discipline/{diciplineCode}

#Get courses list of all pages:

./api/v1/course

#Get courses by pages (recommended in order to avoid overloading in the database):

./api/v1/course?page=1&size=10&sort=code // paginate the results by 10 elements each page, show result for page number 1

#Get an dividual course:

./api/v1/course/{courseID}

#Get courses grouped by attributes:

./api/v1/course/{attribute_code}

#Get list of attributes:

./api/v1/attribute

#Get an individual attribute:

./api/v1/attribute/{attribute id}