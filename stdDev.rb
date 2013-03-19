module Enumerable

    def sum
      self.inject(0){|accum, i| accum + i }
    end

    def mean
      self.sum/self.length.to_f
    end

    def sample_variance
      m = self.mean
      sum = self.inject(0){|accum, i| accum +(i-m)**2 }
      sum/(self.length - 1).to_f
    end

    def standard_deviation
      return Math.sqrt(self.sample_variance)
    end

end
a = [20,23,23,24,25,22,12,21,29]

puts a.standard_deviation # it should print 4.59
puts a.mean # it should print 22.1
puts a.sum # it should print 199
puts a.sort

  