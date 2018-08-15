# Complete the function below.

def getResponse(substr, page)
    uri = URI('https://jsonmock.hackerrank.com/api/movies/search/')
    params = { :Title => substr, :page => page }
    uri.query = URI.encode_www_form(params)
    Net::HTTP.get_response(uri)
end

def getMovieNames(data)
    movieNames = []
    data.each do |movie|
        movieNames.push(movie['Title'])
    end
    movieNames
end

# https://jsonmock.hackerrank.com/api/movies/search/?Title=spiderman&page=2
def getMovieTitles(substr)    
    res = getResponse(substr, 1)
    respBody = JSON.parse(res.body)
    total_pages = respBody['total_pages']
    i = 2
    movies = []
    movies = getMovieNames(respBody['data'])
    while i <= total_pages
        res = getResponse(substr, i)
        movies.push(getMovieNames(JSON.parse(res.body)['data'])).flatten!
        i += 1
    end
    movies.sort
end

